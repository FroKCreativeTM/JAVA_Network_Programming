import java.io.FileOutputStream;

public class FileOutputStreamTest03 {
    // throws Exception를 이용해서 try를 대체한다.
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file03.dat");

        // 255가 넘어가는 정수
        int data = 321;

        fos.write(data);
        fos.close();
    }
}
