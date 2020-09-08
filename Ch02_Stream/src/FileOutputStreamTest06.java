import java.io.FileOutputStream;

public class FileOutputStreamTest06 {
    // throws Exception를 이용해서 try를 대체한다.
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file06.dat");
        String str = "FroK의 블로그에 어서오세요.";
        byte[] data = str.getBytes();
        fos.write(data);
        fos.close();
    }
}
