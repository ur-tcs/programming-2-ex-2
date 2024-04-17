# Programming-2-Exercise-2
In this exercise you will learn about structural recursion and classes in scala.
* As in the first exercise you need to obtain the exercise files. Clone or fork the repository: `git clone https://github.com/ur-tcs/programming-2-ex-2.git` or download it by clicking on the green `<code>` button and select `download`
## Structural Recursion
* We provide the signature of the functions you need to write in the exercise files. The body is replaced with ???: that’s the part you need to come up with!
+ The exercise files are found in the folder `recursion_and_classes/src/main/scala/recursion`. The Exercises are those files which start with `Ex` (for exercise), sorted by the type of structure you will work on. The files `IntList.scala` and `IntTree.scala` should **stay unchanged**. They define the necessary classes you will work on in the exercises.
+ You will perform recursion on different structures like lists, trees, etc. The sufficient background to solve the exercises is given below.
+ The number of exercises is quite large. It is not necessary to solve all the exercises to get a good understanding of recursion since many of the exercises are similar. A few exercises of each type may be enough.
+ For each function we provided a test. As for the first exercise you can run the tests by entering `sbt` while you are in your project directory, and then compiling your code using `compile`. To run all the tests use `test`. If you only want to run the test of a specific function use `testOnly -- "*function*"`, where function is the name of the function you want to test.

For example you might find the following signature:
```scala
// As a first step implement the faculty function n!=n*(n-1)*...*2*1
def fac(n:Int):Int={
??? 
}
```
After you replaced the `???` by the correct code you might run `compile` and `testOnly -- "*fac*"`. In this case this will test if fac(6)==6 * 5 * 4 * 3 * 2 * 1. In particular a correct test does not necessarily mean that you implemented the correct function (you might also pass the test by replacing `???` by `720`).

Note that the syntax of scala does not require to specify the return type of the function, but for your convenience we already gave it.
Furthermore the curly braces are not necessary to mark the body of the function if you have the right spacing.

### Recursion on lists

In this exercise, you will write recursive functions that operate on lists. These lists are represented as instances of the IntList class. An IntList can be either:

* `IntNil()`, which represents an empty list,
* `IntCons( head ,tail )`, which represents a non-empty list starting with `head` (an integer) and continuing with `tail` (a list of integers).

Hence, the list `1, 2` is represented by `IntCons(1, IntCons(2, IntNil()))`.

IntList objects have three operations — `.head`, `.tail`, and `.isEmpty` — demonstrated in the following REPL session:
```scala
scala> import recursion.*

scala> IntCons(2, IntNil()).head
val res0: Int = 2

scala> IntCons(2, IntNil()).tail
val res1: recursion.IntList = IntNil()

scala> val oneTwo = IntCons(1, IntCons(2, IntNil()))
val oneTwo: recursion.IntCons = IntCons(1,IntCons(2,IntNil()))

scala> oneTwo.isEmpty
val res2: Boolean = false

scala> oneTwo.head
val res3: Int = 1

scala> oneTwo.tail
val res4: recursion.IntList = IntCons(2,IntNil())

scala> oneTwo.tail.isEmpty
val res5: Boolean = false

scala> oneTwo.tail.head
val res6: Int = 2

scala> oneTwo.tail.tail
val res7: recursion.IntList = IntNil()

scala> oneTwo.tail.tail.isEmpty
val res8: Boolean = true
```

The last exercise on recursion on Lists is a bit intermediate: **Polish Notation**

Polish Notation (PN) is a way to write arithmetic expressions where every operator comes before its operands. For example, instead of writing `3 + 4`, you would write `+ 3 4`.

Your task is to implement a PN evaluator for an `IntList` where operators are represented by negative integers: we’ll deal with just addition and multiplication for now:

```scala
val Add = -1
val Multiply = -2
```

For example, the expression `3 + 4` would be represented as `IntCons(Add, IntCons(1, IntCons(2, IntNil())))` and the expression `3 * 4` would be represented as `IntCons(Mul, IntCons(1, IntCons(2, IntNil())))`.

Here is a REPL session demonstrating how the polishEval function should behave:

```scala
scala> // List:   [Add, 3, 4]
scala> // Prefix: + 3 4
scala> // Infix:  3 + 4
scala> val expr1 = IntCons(Add, IntCons(3, IntCons(4, IntNil())))
val expr1: recursion.IntCons = IntCons(-1,IntCons(3,IntCons(4,IntNil())))

scala> polishEval(expr1)
val res40: (Int, recursion.IntList) = (7,IntNil())

scala> // List:   [Multiply, Add, 5, 3, 4]
scala> // Prefix: * + 5 3 4
scala> // Infix:  (5 + 3) * 4
scala> val expr2 = IntCons(Multiply, IntCons(Add, IntCons(5, IntCons(3, IntCons(4, IntNil())))))
val expr2: recursion.IntCons = IntCons(-2,IntCons(-1,IntCons(5,IntCons(3,IntCons(4,IntNil())))))

scala> polishEval(expr2)._1
val res41: Int = 32
```

### Lists as Sets
Lists are ordered collections of objects; as a result, most set operations can be defined on them too. There is no additional explanation needed to solve the corresponding exercises.

### Recursion on Trees
Now, we’ll explore recursion on binary trees. A binary tree is a tree where each node has at most two children. An `IntTree` can be either:

+ `IntEmptyTree()`, which represents an empty tree,
+ `IntBranch( value , left , right)`: which represents a node with value `value` (an integer) and two children `left` and `right` (trees of integers).

Hence, a tree with two non-empty nodes, a root node with value `1` with a left child with value `2`, is represented by `IntBranch(1, IntBranch(2, IntEmptyTree(), IntEmptyTree()), IntEmptyTree())`.

IntTree objects have four operations — `.value`, `.left`, `.right` and `.isEmpty` — demonstrated in the following REPL session:

```scala

scala> import recursion.*

scala> IntBranch(2, IntEmptyTree(), IntEmptyTree()).value
val res11: Int = 2

scala> IntBranch(2, IntEmptyTree(), IntEmptyTree()).left
val res12: recursion.IntTree = IntEmptyTree()

scala> IntBranch(2, IntEmptyTree(), IntEmptyTree()).right
val res13: recursion.IntTree = IntEmptyTree()

scala> val tree = IntBranch(1, IntBranch(2, IntEmptyTree(), IntEmptyTree()), IntEmptyTree())
val tree: recursion.IntBranch = IntBranch(1,IntBranch(2,IntEmptyTree(),IntEmptyTree()),IntEmptyTree())

scala> tree.isEmpty
val res14: Boolean = false

scala> tree.value
val res15: Int = 1

scala> tree.left
val res16: recursion.IntTree = IntBranch(2,IntEmptyTree(),IntEmptyTree())

scala> tree.left.isEmpty
val res17: Boolean = false

scala> tree.left.value
val res18: Int = 2

scala> tree.left.left
val res19: recursion.IntTree = IntEmptyTree()

scala> tree.left.right
val res20: recursion.IntTree = IntEmptyTree()

scala> tree.right
val res21: recursion.IntTree = IntEmptyTree()

scala> tree.right.isEmpty
val res22: Boolean = true
```

### Recursion on Strings

In this exercise, you will write recursive functions that operate on strings. A string can be thought of as a list of characters. Like lists, we can apply the same structural recursion principles to strings. Each string has the `isEmpty`, `head` and `tail` methods similar to `IntList`:

```scala
scala> "Hello Ada".tail
val res25: String = ello Ada

scala> "Hello Ada".tail.head
val res26: Char = e

scala> "Hello Ada".tail.isEmpty
val res27: Boolean = false

scala> " ".isEmpty
val res28: Boolean = false

scala> "".isEmpty
val res29: Boolean = true
```

Note the type of the `head` method: it returns a Char, not a String. A Char is a single character, whereas a String is a sequence of characters. A String is surrounded by double quotes (e.g. "This is a String"), whereas a Char is surrounded by single quotes (e.g. 'c').

For the corresponding exercies, you cannot use any other method than `isEmpty`, `head` and `tail` on strings.

## Classes

In this exercises you will get familiar with (abstract) classes, traits, companion Objects, etc.

### Geometric Objects

We want to construct a class hierarchy on some geometric objects, namely circles, squares and cubes. Before we guide you through the exercise, here is what we want in the end. You may try to implement this without further reading.

+ Three classes: circle, square and cube
+ Each class should have a dimension, a diameter (diameter of circle or diagonal for square and cube) and should be able to compute their volume (for two dimensional objects we mean their area by volume)
+ Clearly some of these objects share some properties. You should try to implement this via traits and/or abstract classes
+ In order to compute the area of the circle, we don't want to use the "exact" value of Pi, but instead create our own constant `approxPi`. This should be equal to all objects of the class circle, but we should be able to change the value uniformly.
+ For every geometric object we would like to have a method quadrature, which returns a cubic object with the same volume as the original one (with respect to `approxPi`), e.g. if circ1 is an object of the class circle, then circ1.quadrature() returns a square with the same surface as circ1.
+ As a Bonus you can implement another class `ball` analogously to circle. At least you should keep the right traits in mind such that such an extension is easily possible.

Here are some useful tools for this exercise:
```scala
Math.Pi //will give you the exact value of Pi
Math.pow(base,exponent) //this is the exponentiation function in scala
Math.sqrt(x) //the square root
math.round(x*Math.pow(10,n))/Math.pow(10,n)// this will round the value x to n decimals
length = diameter/(Math.sqrt(n)) //connection between length and diameter in an n-dimensional cube
```

We encourage you to test your program by yourself. A good playground could be again a worksheet, where you imported the necessary files.

<details>
<summary> Hint: Which classes and traits should I define </summary>
The following is **one** of many solutions to this question:
+ an abstract class Geometric for all of our classes
+ traits planar for circle and square, and spatial for the cube (and a possible ball) which all extend Geometric
+ classes square, circle and ball which are all subclasses of Geometric and have the natural traits.
</details><br/>

<details>
<summary> Hint: Which classes/traits should contain which variables/methods </summary>
Since every geometric object in our case should have a diameter, dimension and volume, those are to define in the abstract class Geometric:

```scala
abstract class Geometric:
  def diameter: Double
  def dimension: Int
  def volume(): Double
```

The traits planar and spatial tell you in which dimension you are (so this is fixed in these traits), furthermore they can already decide which type your quadrature method should have (square for the two dimensional and cube for the three dimensional case)

```scala
trait planar extends Geometric:
  def dimension = 2
  def quadrature(): square

trait spatial extends Geometric:
  def dimension = 3
  def quadrature(): cube
```

Because square and cube have an easy way to compute their volume we may implement this in our rectangular trait, which has access to a dimension as it extends Geometric. It might be useful to define an extra value length.

```scala
trait rectangular extends Geometric :
  def length = diameter/(Math.sqrt(dimension))
  def volume(): Double = Math.pow(length, dimension)
```
</details><br/>

<details>
<summary> Hint: How to implement `approxPi` </summary>
Since approxPi should play the role of a static variable in Java, we put it into a companion object for our class circle. That is, we create an object with the same name like the class and define a private variable `approxPi` in it, that we can only change with some methods defined in our companion object. Note that the companion object does know the variables of circle (e.g. the diameter) and vice versa.

To be precise your companion object should look something like this:
```scala
object circle {
  private var app_pi = ??? //private because we don't want to accidentally change it and var because we want to be able to change it through methods
  def setPi(???) = ??? //some method that gives us the possibility to change approxPi
}
```
</details><br/>
