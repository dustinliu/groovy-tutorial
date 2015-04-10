package nevec.groovy.tutorial.session1

public class ExecuteProcess {
    public static void main(String[] args) {
        try {
            Process proc = Runtime.getRuntime().exec("ls -l")
            BufferedReader result = new BufferedReader(new InputStreamReader(proc.getInputStream()))

            String line
            while ((line = result.readLine()) != null) {
                System.out.println(line)
            }
        } catch (IOException ex) {
            ex.printStackTrace()
        }
    }
}

//next SafeOperator.groovy
