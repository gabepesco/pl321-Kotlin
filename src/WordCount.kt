import kotlin.test.assertEquals

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

fun wordCountTest(){
    assertEquals(2, wordCount("Hello World"))
    assertEquals(0, wordCount(""))
    assertEquals(0, wordCount("!, :;?&"))
    assertEquals(3, wordCount("Word Count Test!"))
    assertEquals(9, wordCount("The amount of words in this sentence is nine"))
    assertEquals(2, wordCount("10 11"))
}

fun main(args: Array<String>){
    wordCountTest()
}
