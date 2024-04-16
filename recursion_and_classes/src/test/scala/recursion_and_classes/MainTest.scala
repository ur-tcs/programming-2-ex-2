package recursion

class RecTest extends munit.FunSuite {
  test("test for fac") {
    assertEquals(fac(6), 6*5*4*3*2*1)
  }
  test("test for nfac"){
    assertEquals(nfac(8),8*7*6*5*4*3*2*1)
  }
  test("test for length"){
    assertEquals(length(IntCons(3,IntCons(2,IntCons(1,IntNil())))),3)
  }
  test("test for allPositiveOrZero"){
    assertEquals(allPositiveOrZero(IntCons(3,IntCons(-1,IntNil()))),false)
  }
  test("test for countPositive"){
    assertEquals(countPositive(IntCons(3,IntCons(-1,IntCons(0,IntNil())))),1)
  }
  test("test for sum"){
    assertEquals(sum(IntCons(3,IntCons(-1,IntCons(1,IntNil())))),3)
  }
  test("test for product"){
    assertEquals(product(IntCons(3,IntCons(4,IntCons(-1,IntNil())))),-12)
  }
  test("test for anyOdd"){
    assertEquals(anyOdd(IntCons(4,IntCons(1,IntCons(0,IntNil())))),true)
  }
  test("test for decrement"){
    assertEquals(decrement(IntCons(3,IntCons(2,IntCons(-2,IntNil())))),IntCons(2,IntCons(1,IntCons(-3,IntNil()))))
  }
  test("test for collectEven"){
    assertEquals(collectEven(IntCons(4,IntCons(1,IntCons(3,IntNil())))),IntCons(4,IntNil()))
  }
  test("test for min"){
    assertEquals(min(IntCons(3,IntCons(2,IntCons(1,IntNil())))),1)
  }
  test("test for increment"){
    assertEquals(increment(IntCons(3,IntCons(4,IntCons(-3,IntNil())))),IntCons(4,IntCons(5,IntCons(-2,IntNil()))))
  }
  test("test for subtract"){
    assertEquals(subtract(IntCons(3,IntCons(2,IntCons(4,IntNil())))),5)
  }
  test("test for removeOdd"){
    assertEquals(removeOdd(IntCons(3,IntCons(2,IntCons(1,IntNil())))),IntCons(2,IntNil()))
  }
  test("test for countEven"){
    assertEquals(countEven(IntCons(3,IntCons(2,IntCons(1,IntCons(16,IntNil()))))),2)
  }
  test("test for ncountEven"){
    assertEquals(ncountEven(IntCons(3,IntCons(2,IntCons(1,IntCons(16,IntNil()))))),2)
  }
  test("test for multiplyBy2"){
    assertEquals(multiplyBy2(IntCons(3,IntCons(2,IntCons(4,IntNil())))),IntCons(6,IntCons(4,IntCons(8,IntNil()))))
  }
  test("test for anyNegative"){
    assertEquals(anyNegative(IntCons(3,IntCons(-2,IntCons(4,IntNil())))),true)
  }
  test("test for allEven"){
    assertEquals(allEven(IntCons(3,IntCons(2,IntCons(4,IntNil())))),false)
  }
  test("test for multiplyOdd"){
    assertEquals(multiplyOdd(IntCons(3,IntCons(2,IntCons(5,IntNil())))),15)
  }
  test("test for horner"){
    assertEquals(horner(2,IntCons(3,IntCons(2,IntCons(4,IntNil())))),23)
  }
  test("test for capAtZero"){
    assertEquals(capAtZero(IntCons(3,IntCons(-2,IntCons(4,IntNil())))),IntCons(0,IntCons(-2,IntCons(0,IntNil()))))
  }
  test("test for removeZeroes"){
    assertEquals(removeZeroes(IntCons(3,IntCons(0,IntCons(-1,IntNil())))),IntCons(3,IntCons(-1,IntNil())))
  }
  test("test for reverseAppend"){
    assertEquals(reverseAppend(IntCons(3,IntCons(2,IntCons(1,IntNil()))),IntCons(4,IntCons(5,IntNil()))),IntCons(1,IntCons(2,IntCons(3,IntCons(4,IntCons(5,IntNil()))))))
  }
  test("test for reverse"){
    assertEquals(reverse(IntCons(3,IntCons(2,IntCons(4,IntNil())))),IntCons(4,IntCons(2,IntCons(3,IntNil()))))
  }
  test("test for takeWhilePositive"){
    assertEquals(takeWhilePositive(IntCons(2,IntCons(2,IntCons(-3,IntNil())))),IntCons(2,IntCons(2,IntNil())))
  }
  test("test for append"){
    assertEquals(append(IntCons(1,IntCons(2,IntCons(3,IntNil()))),IntCons(4,IntCons(5,IntNil()))),IntCons(1,IntCons(2,IntCons(3,IntCons(4,IntCons(5,IntNil()))))))
  }
  test("test for nappend"){
    assertEquals(nappend(IntCons(1,IntCons(2,IntCons(3,IntNil()))),IntCons(4,IntCons(5,IntNil()))),IntCons(1,IntCons(2,IntCons(3,IntCons(4,IntCons(5,IntNil()))))))
  }
  test("test for collectMultiples"){
    assertEquals(collectMultiples(3,IntCons(3,IntCons(2,IntCons(6,IntNil())))),IntCons(3,IntCons(6,IntNil())))
  }
  test("test for last"){
    assertEquals(last(IntCons(1,IntCons(2,IntCons(8,IntNil())))),8)
  }
  test("test for init"){
    assertEquals(init(IntCons(1,IntCons(2,IntCons(3,IntNil())))),IntCons(1,IntCons(2,IntNil())))
  }
  test("test for minMax"){
    assertEquals(minMax(IntCons(-1,IntCons(2,IntCons(4,IntNil())))),(-1,4))
  }
  test("test for polishEval"){
    assertEquals(polishEval(IntCons(Add,IntCons(Multiply,IntCons(2,IntCons(3,IntCons(4,IntNil()))))))._1,10)
  }
  test("test for contains"){
    assertEquals(contains(IntCons(1,IntCons(2,IntCons(3,IntNil()))),3),true)
  }
  test("test for isSubset"){
    assertEquals(isSubset(IntCons(1,IntCons(2,IntCons(3,IntNil()))),IntCons(1,IntCons(2,IntNil()))),false)
  }
  test("test for intersection"){
    assertEquals(intersection(IntCons(1,IntCons(2,IntCons(3,IntNil()))),IntCons(1,IntCons(4,IntNil()))),IntCons(1,IntNil()))
  }
  test("test for difference"){
    assertEquals(difference(IntCons(1,IntCons(2,IntCons(3,IntNil()))),IntCons(1,IntCons(4,IntNil()))),IntCons(2,IntCons(3,IntNil())))
  }
  test("test for treeSize"){
    assertEquals(treeSize(IntBranch(3,IntBranch(2,IntBranch(-3,IntEmptyTree()
    ,IntEmptyTree()),IntEmptyTree()),IntBranch(1,IntEmptyTree(),IntBranch(4,
    IntEmptyTree(),IntEmptyTree())))),5)
  }
  test("test for treeDepth"){
    assertEquals(treeDepth(IntBranch(3,IntBranch(2,IntBranch(-3,IntEmptyTree()
    ,IntEmptyTree()),IntEmptyTree()),IntBranch(1,IntEmptyTree(),IntBranch(4,
    IntEmptyTree(),IntEmptyTree())))),3)
  }
  test("test for treeSum"){
    assertEquals(treeSum(IntBranch(3,IntBranch(2,IntBranch(-3,IntEmptyTree()
    ,IntEmptyTree()),IntEmptyTree()),IntBranch(1,IntEmptyTree(),IntBranch(4,
    IntEmptyTree(),IntEmptyTree())))),7)
  }
  test("test for treeIncrement"){
    assertEquals(treeIncrement(IntBranch(3,IntBranch(2,IntBranch(-3,IntEmptyTree()
    ,IntEmptyTree()),IntEmptyTree()),IntBranch(1,IntEmptyTree(),IntBranch(4,
    IntEmptyTree(),IntEmptyTree())))),IntBranch(4,IntBranch(3,IntBranch(-2,IntEmptyTree()
    ,IntEmptyTree()),IntEmptyTree()),IntBranch(2,IntEmptyTree(),IntBranch(5,
    IntEmptyTree(),IntEmptyTree()))))
  }
  test("test for treeShow"){
    assertNoDiff(treeShow(IntBranch(3,IntBranch(2,IntBranch(-3,IntEmptyTree()
    ,IntEmptyTree()),IntEmptyTree()),IntBranch(1,IntEmptyTree(),IntBranch(4,
    IntEmptyTree(),IntEmptyTree())))),
    3.toString +"\n"+2.toString + "\n" + -3.toString + "\n" + 1.toString + "\n" + 4.toString)
  }
  test("test for stringLength"){
    assertEquals(stringLength("Long String"),11)
  }
  test("test for capitalizeString"){
    assertNoDiff(capitalizeString("let it be Upper"), "LET IT BE UPPER")
  }
  test("test for isBlank"){
    assertEquals(isBlank("Long String"),false)
  }
  test("test for wordCount"){
    assertEquals(wordCount("Long String    tail !"),4)
  }
  test("test for caesarCipher"){
    assertNoDiff(caesarCipher("dkz",3), "gnc")
  }
  test("test for reverseString"){
    assertNoDiff(reverseString("in reverse"), "esrever ni")
  }
}
