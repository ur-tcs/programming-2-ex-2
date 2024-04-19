package StringList

//Here you can implement you exercise on strings. Some hints that will give you a solid frame can be found in the README file.
final class EmptyListException extends Exception(f"Empty list")
//If you want to throw an exception you may use the above defined EmptyListException
//Note that if you throw an exception, your program immediately breaks and does not return any results (except the thrown exception)

def printList(s:StringList):String ={
  if s.isLast then
    s.current
  else{ 
    s.current + printList(s.rest)
  }
}

/*printList(First("make",Next("this", Next("sentence", Next("syntax",Last())))))
should return the following string: "Make this sentence syntax."
*/
abstract class StringList:
    ???