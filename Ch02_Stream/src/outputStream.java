import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class outputStream {
    // TCP 세그먼트는 한 번에 40바이트씩 보낼 수 있다.
    // 이 메서드는 데이터를 보낼 때 한 번에 많이 보낼 수 있도록 만든다.
    // (한 줄당 72개의 문자를 출력한다.)
    public static void GenerateCharacters(OutputStream out) throws IOException {
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72;
        int start = firstPrintableCharacter;
        byte[] line = new byte[numberOfCharactersPerLine + 2];  // +2는 \r \n

        while(true) {
            for (int i = start; i < start + numberOfCharactersPerLine; i++) {
                line[i - start] = (byte)((i - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter);
            }

            line[72] = (byte)'\r';      // 캐리지 리턴
            line[73] = (byte)'\n';      // 라인 피드
            out.write(line);

            start = ((start + 1) - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter;
        }
    }

    public static void FileStream() {
        try (OutputStream out = new FileOutputStream("/data.txt");) {
            // 출력을 위한 작업
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
