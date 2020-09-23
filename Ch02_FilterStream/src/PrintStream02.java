import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStream02 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("file11.dat");
            PrintStream ps = new PrintStream(fos);

            ps.println("자바");

            byte[] b = new String("자바").getBytes();
            ps.write(b);

            ps.close();
        } catch(IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
