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
	var total = 0.0
	for (word in words) {
		total += word.length
	}
	return total / words.size

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
		increment(wordMap, word)
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
