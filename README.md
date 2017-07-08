**_Functional Programming in Scala_**

Scala supports both object-oriented and functional programming paradigms.

In Scala it is possible to have nested functions (functions within functions), a function returning a function, a function taking a function as parameters, and so on.


**_A Scala function definition has the following form:_**

    def functionName ([list of parameters]) : [return type] = {
        function body
        return [expr]
    }

**_Arguments in anonymous function_**

    val incrementOne: Int => Int = _ + 1
    val add2Numbers: (Int, Int) => Int = (_ + _ )
    
    incrementOne(6) //output -> 7
    add2Numbers(2,3) //output -> 5
    

**_Return keyword in Scala is optional and is error-prone; should be avoided. It has no side-effects on anonymous funtions._**

    def foo(x: Int): Int = {
      val anonFunc: Int => Int = { z =>
        if (z > 5)
          return z // This line makes z the return value of foo!
        else
          z + 2    // This line is the return value of anonFunc
      }
      anonFunc(x)  // This line is the return value of foo
    }
    
    foo(5)

**_Implicit classes_**

    object Helpers {
      implicit class IntWithTimes(x: Int) {
        def times[A](f: => A): Unit = {
          def loop(current: Int): Unit =
            if(current > 0) {
              f
              loop(current - 1)
            }
          loop(x)
        }
      }
    }

**_**Important points to be remembered:**_**

- Functional based language
- Compose the problem to be solved as a set of functions to execute.
- Infinite call with the same inputs, returns same output
- Immutable "val" parameters in function solves concurreny issues
- Support lazy and eager loading
- Algebra based
- Less verbose
- No getters and setters: Scala does create getters/setters for you automatically
- Auxiliary Constructor : Overloaded constructors have a special name
- Support implicit classes : The 'implicit' keyword makes the class’ primary constructor available for implicit conversions when the class is in scope.
    *  They must be defined inside of another trait/class/object.
    *  They may only take one non-implicit argument in their constructor.
    *  There may not be any method, member or object in scope with the same name as the implicit class.
- Overriding classes must use the override modifier.
- Super class constructors cannot be directly invoked by Auxiliary constructors. They only can invoke the primary constructor which, in turn, would invoke the Super class constructor.

