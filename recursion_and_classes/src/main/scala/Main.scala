package recursion

@main def hello(): Unit = {println(polishEval(IntCons(Add,IntCons(Multiply,IntCons(2,IntCons(3,IntCons(4,IntNil())))))))}

import recursion.*
/* Here you find a framework for the exercises on recursion.
The exercises are linked with different topics which you can check out in the readme file of the exercise.
You definetely don't need to implement all the functions to get a good understanding of recursion since many of them are quite similar. 
*/

// As a first step implement the faculty function n!=n*(n-1)*...*2*1
def fac(n:Int):Int={
  ??? 
}
/*There is an even more functional way to define fac,
such that the only desired computation takes place within another call of fac
i.e. fac(n-1) is allowed but n*fac(...) is permitted
In order to get this done we need a help function hfac that gets called from our new fac function nfac*/
