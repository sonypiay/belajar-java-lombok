package programmer_zaman_now.lombok;

import lombok.Cleanup;

import java.io.FileReader;
import java.util.Scanner;

public class FileHelper {

    public static String loadFile(String fileName) throws Exception {
        @Cleanup FileReader fileReader = new FileReader(fileName);
        @Cleanup Scanner scanner = new Scanner(fileReader);

        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine()).append("\n");
        }

        return sb.toString();
    }
}
