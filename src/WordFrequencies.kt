import kotlin.test.assertEquals
import java.io.File


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

fun wordFrequenciesTest() {
	val wordMap = wordFrequencies(File("example.txt").readText(Charsets.UTF_8))
	assertEquals(wordMap["ut"], 11)
	assertEquals(wordMap["lorem"], 1)
	assertEquals(wordMap["bazinga"], null)
	assertEquals(wordMap[""], null)
}

fun main(args: Array<String>) {
	wordFrequenciesTest()
}