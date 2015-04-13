package nevec.groovy.tutorial.session2

def l = [1, 4, 7, 3, 9, 5, 8, 1, 6, 9]

//println l[2..-1]

//println l.sum()
//println l.sort()
//println l


//l.each {
//    println it
//}


//def m = l.collect() { it*2 }
//println m
//println l


//def m = l.findAll() { it > 4 }
//println m


def ll = ['aaa', 'bbb', 'cccccc', 'ddd']
//println ll - ['bbb', 'ddd']

//println ll*.size()


def langs = ['C++' : 'Stroustrup', Java : 'Gosling', Lisp : 'McCarthy']
langs.each {key, value -> println "[${key}] - [${value}]"}
//langs.each {entry -> println "[${entry.key}] - [${entry.value}]"}

//mop
