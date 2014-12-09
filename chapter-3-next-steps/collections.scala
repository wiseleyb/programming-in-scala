/*
  Examples from Chapter 3 of Programming scala
  To run:
  scala collections.scala
*/

/*
  note that val greetStrings should be immutable, but the object it refers
  to isn't
*/
val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = " "
greetStrings(2) = "world\n"

for (i <- 0 to 2) print(greetStrings(i))

greetStrings.foreach(print)

val numNames = Array("zero", "one", "two")
numNames.foreach(println)

val l12 = List(1, 2)
val l34 = List(3, 4)
val l1234 = l12 ::: l34
val l01234 = 0 :: l1234
println(l12 + " and " + l34 + " were not mutated")
println(l1234 + " is a new list")
println(l01234 + " is a new list as well")

val tuple = (1, "two", 3, 'a', List(1,5))
println("Tuples: " + tuple)

var set = Set(1, "2", List(1,2))
println("Sets: " + set)

var map = Map(1 -> "one", 3 -> "three", 3 -> "three")
println("Maps: " + map)
println("Map 3: " + map(3))
