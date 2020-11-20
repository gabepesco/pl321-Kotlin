package test

import kotlin.test.assertEquals
import avgWordLength

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