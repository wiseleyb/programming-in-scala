/*
  Examples from Chapter 3 of Programming Scala
  3.1 Interacting with files
  To run:
  cd cahpter-3-next-steps
  scala files.scala files.scala
*/

import scala.io.Source

if (args.length > 0) {
  args.foreach(printFile)
}
else
  Console.err.println("Enter a filename")

def printFile(filename: String) {
  println(filename)
  val lines = fileToList(filename)
  val maxWidth = widthOfLength(longestLine(lines))
  lines.foreach(printFileLine(_, maxWidth))
}

def printFileLine(line: String, maxWidth: Int) {
  val numSpaces = maxWidth - widthOfLength(line)
  val padding = " " * numSpaces
  println(padding + line.length + " | " + line)
}

def fileToList(filename: String) = Source.fromFile(filename).getLines().toList

def widthOfLength(line: String) = line.length.toString.length

def longestLine(lines: List[String]) = {
  lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )
}

