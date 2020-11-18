import kotlin.test.assertEquals

fun avgWordLength(str: String): Double {
    val specialChars = mutableListOf<String>(".", "?", ",", ":", ";", "&")
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

fun avgWordLengthTest(){
    assertEquals(4.0, avgWordLength("These are four"))
    assertEquals(0.0, avgWordLength(""))
    assertEquals(1.0, avgWordLength("a"))
    assertEquals(2.5, avgWordLength("a test"))
    assertEquals(3.0, avgWordLength("123"))
    assertEquals(1.0, avgWordLength("a, b. c? d: e; f&"))
}

fun main(args: Array<String>){
    avgWordLengthTest()
}