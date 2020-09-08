import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    private static void GenerateCharacters(OutputStream out) throws IOException {
        int firstPrintableCharacter = 65;
        int numberOfPrintableCharacters = firstPrintableCharacter + 26;
        int numberOfCharactersPerLine = 27;
        int start = firstPrintableCharacter;
        byte[] line = new byte[numberOfCharactersPerLine + 2];  // +2는 \r \n

        for(int n = 0; n < 100; n++) {
            for (int i = start; i < start + numberOfCharactersPerLine; i++) {
                line[i] = (byte)((i - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter);
            }

            line[numberOfCharactersPerLine] = (byte)'\r';      // 캐리지 리턴
            line[numberOfCharactersPerLine + 1] = (byte)'\n';      // 라인 피드
            out.write(line);

            start = ((start + 1) - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter;
        }
    }

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Test.dat");
        GenerateCharacters(fos);
        fos.close();
    }
}
