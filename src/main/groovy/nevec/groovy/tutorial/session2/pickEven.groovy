package nevec.groovy.tutorial.session2

//def sum(n) {
//    def total = 0
//    for (int i = 2; i <= n; i += 2) {
//        total += i
//    }
//    total
//}
//
//println sum(10)


def even(n, closure) {
    for (int i = 2; i <= n; i += 2) {
        closure(i)
    }
}

def total = 0
even(10) { total += it }
println total


//string
