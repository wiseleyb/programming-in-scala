/*
  Examples from Chapter 2 of Programming in Scala
  Run this from command line like so:
  scala echoargs.scala one two three
*/

printStep("while")
var i = 0
while (i < args.length) {
  if (i != 0) print(" ")
  print(args(i))
  i += 1
}
println()

printStep("foreach1")
args.foreach(arg => println(arg))

printStep("foreach2")
args.foreach((arg: String) => println(arg))

printStep("foreach3")
args.foreach(println)

printStep("for")
for (arg <- args) println(arg)

def printStep(step: String) {
  println()
  println(step)
}
