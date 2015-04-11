package nevec.groovy.tutorial.session1
// == is java's equals
str1 = 'hello'
str2 = str1
str3 = new String('hello')
str4 = 'Hello'
println "str1 == str2: ${str1 == str2}"
println "str1 == str3: ${str1 == str3}"
println "str1 == str4: ${str1 == str4}"
println "str1.is( str2): ${str1.is(str2)}"
println "str1.is( str3): ${str1.is(str3)}"
println "str1.is( str4): ${str1.is(str4)}"


def a = [1, 2, 3, 4]
def b = [1, 2, 3, 4]

println "a == b: ${a == b}"


// compile time type check is off by default
//Integer val = 4
//val = 'hello'


//Different Syntax for Creating Primitive Arrays
//int[] d = [1, 2, 3]
//println "class of d is: ${d.getClass().name}"
//
//def e = [1, 2, 3]
//println "class of e is: ${e.getClass().name}"
//
//def f = e as int[]
//println "class of f is: ${f.getClass().name}"
