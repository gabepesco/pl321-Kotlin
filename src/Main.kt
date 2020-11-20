fun main(args: Array<String>) {
    val file = readFileDirectlyAsText("example.txt")
    println("Average word length: " + avgWordLength(file))
    println("Total word count: " + wordCount(file))
    println("Word frequencies: " + wordFrequencies(file))
}
