import kotlin.test.assertEquals

fun avgWordLength(str: String): Double {
    val specialChars = mutableListOf(".", "?", ",", ":", ";", "&")
    var newString = str
    for (char in specialChars){
        newString = newString.replace(char, "")
    }
    val words = newString.split(" ", ".", "?", ",", ":", ";", "&")
    var sum = words.fold(0.0) {sum, element -> sum + element.length}
    //var total = 0.0
    //for (word in words) {
        //total += word.length
    //}
    return sum / words.size

}
