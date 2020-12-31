import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("test.dat"));
        System.out.println(in.next() + " " + in.next());
    }
}
