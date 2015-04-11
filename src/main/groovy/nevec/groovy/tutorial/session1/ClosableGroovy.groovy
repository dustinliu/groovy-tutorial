package nevec.groovy.tutorial.session1

def fileName = 'JoeJoeJoe.groovy'
FileInputStream fis = new FileInputStream(fileName)

try {
    print fis.read()
} finally {
    fis.close()
}

//JavaBean

