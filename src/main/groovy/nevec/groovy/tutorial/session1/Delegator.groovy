package nevec.groovy.tutorial.session1

class Worker {
    def work() { println 'get work done' }

    def analyze() { println 'analyze...' }

    def writeReport() { println 'get report written' }
}

class Expert {
    def analyze() { println "expert analysis..." }
}

class Manager {
    Expert expert = new Expert()
    Worker worker = new Worker()

    def work() {
        worker.work()
    }

    def analyze() {
        expert.analyze()
    }

    def writeReport() {
        worker.writeReport()
    }
}


def joe = new Manager()
joe.analyze()
joe.work()
joe.writeReport()



//singleton
