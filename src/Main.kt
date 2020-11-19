import java.io.File

fun readFileDirectlyAsText(fileName: String): String
        = File(fileName).readText(Charsets.UTF_8)

fun main(args: Array<String>) {
    val file = readFileDirectlyAsText("example.txt")
    println(avgWordLength(file))
    println(wordCount(file))
}
