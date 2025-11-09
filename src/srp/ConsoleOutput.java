package srp;

public class ConsoleOutput implements ReportOutput {
    @Override
    public void print(String message) {
        System.out.print(message);
    }
}
