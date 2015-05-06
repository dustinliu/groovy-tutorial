package nevec.groovy.tutorial.session4;

public class JoeJoeJoe {
    private Joe joe;

    public JoeJoeJoe(Joe joe) {
        this.joe = joe;
    }

    public String doIt() {
        return joe.doIt();
    }

    public int addTwo(int n) {
        return joe.addTwo(n);
    }

    public void execption() {
        throw new RuntimeException("eee");
    }
}
