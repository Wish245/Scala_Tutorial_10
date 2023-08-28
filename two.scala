object counterLetter{
    def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(word => word.length)
    val totalLetterCount = letterCounts.reduce((count1, count2) => count1 + count2)
    totalLetterCount
    }
    def main(args: Array[String]): Unit = {
        val wordList = List("apple", "banana", "cherry", "date")
        val totalOccurrences = countLetterOccurrences(wordList)
        println(s"Total letter occurrences: $totalOccurrences")
    }

}