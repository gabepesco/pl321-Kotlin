import java.io.File

fun readFileDirectlyAsText(fileName: String): String
		= File(fileName).readText(Charsets.UTF_8)

fun avgWordLength(str: String): Double {
	val specialChars = mutableListOf(".", "?", ",", ":", ";", "&")
	var newString = str
	for (char in specialChars){
		newString = newString.replace(char, "")
	}
	val words = newString.split(" ", ".", "?", ",", ":", ";", "&")
	val sum = words.fold(0.0) {sum, element -> sum + element.length}
	return sum / words.size

}


fun <K> increment(map: MutableMap<K, Int?>, key: K) {
	val count = map.getOrDefault(key, 0)
	map[key] = count!! + 1
}


fun wordFrequencies(str: String): Map<String?, Int?> {
	val specialChars = mutableListOf(".", "?", ",", ":", ";", "&", "\r\n")
	var newString = str
	for (char in specialChars){
		newString = newString.replace(char, "")
	}
	val words = newString.split(" ", ".", "?", ",", ":", ";", "&")
	val wordMap: MutableMap<String?, Int?> = HashMap()

	for (word in words) {
		increment(wordMap, word.toLowerCase())
	}

	return wordMap.toList().sortedBy {-it.second!! }.toMap()
}


fun wordCount(inputString: String): Int {
	val strArray = inputString.split(" ", "!", ",", ".", "?", ":", ";", "&").toTypedArray()
	var count = 0

	for (s in strArray) {
		if (s != "") {
			count++
		}
	}
	return count
}
