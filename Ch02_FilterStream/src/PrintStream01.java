import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStream01 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("file10.dat");
            PrintStream ps = new PrintStream(fos);

            boolean bool = true;
            ps.println(bool);

            byte b = -128;
            ps.println(b);

            double d = 0.9;
            ps.println(d);

            Object o = new Object();
            ps.println(o);

            ps.println("자바");
            ps.close();
        } catch(IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
