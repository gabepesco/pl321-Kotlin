import kotlin.test.assertEquals

fun avgWordLengthTest() {
    assertEquals(4.0, avgWordLength("These are four"))
    assertEquals(0.0, avgWordLength(""))
    assertEquals(1.0, avgWordLength("a"))
    assertEquals(2.5, avgWordLength("a test"))
    assertEquals(3.0, avgWordLength("123"))
    assertEquals(1.0, avgWordLength("a, b. c? d: e; f&"))
}

fun wordCountTest() {
    assertEquals(2, wordCount("Hello World"))
    assertEquals(0, wordCount(""))
    assertEquals(0, wordCount("!, :;?&"))
    assertEquals(3, wordCount("Word Count Test!"))
    assertEquals(9, wordCount("The amount of words in this sentence is nine"))
    assertEquals(2, wordCount("10 11"))
}

fun wordFrequenciesTest() {
    val wordMap = wordFrequencies("This is a really long string with many a a a a")
    assertEquals(wordMap["a"], 5)
    assertEquals(wordMap["This"], null)
    assertEquals(wordMap["this"], 1)
    assertEquals(wordMap["bazinga"], null)
    assertEquals(wordMap[""], null)
}

fun main(args: Array<String>){
    avgWordLengthTest()
    wordCountTest()
    wordFrequenciesTest()
}
