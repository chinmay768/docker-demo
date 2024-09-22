import java.util.Properties;

public class Test {
    public static void printSysProperties() {
        System.out.println("Printing sys props:");
        Properties properties = System.getProperties();
        System.out.println(properties);
    }

    public static void main(String[] args) {
        System.out.println("Java program started successfully!");

        printSysProperties();
    }
}
