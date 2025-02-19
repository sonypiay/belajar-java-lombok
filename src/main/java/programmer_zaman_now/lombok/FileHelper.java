package programmer_zaman_now.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;
import java.util.Scanner;

@Slf4j
public class FileHelper {

    @SneakyThrows
    public static String loadFile(String fileName) {
        log.info("Load file {}", fileName);

        @Cleanup FileReader fileReader = new FileReader(fileName);
        @Cleanup Scanner scanner = new Scanner(fileReader);

        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine()).append("\n");
        }

        return sb.toString();
    }
}
