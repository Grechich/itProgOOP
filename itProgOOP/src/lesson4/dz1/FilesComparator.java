package lesson4.dz1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilesComparator{

    public static boolean twoFilesComparator (File file1, File file2) throws IOException {
        byte[] buffer1 = new byte[10_000_000];
        byte[] buffer2 = new byte[10_000_000];
        int readBytes1 = 0;
        int readBytes2 = 0;

        try (InputStream is1 = new FileInputStream(file1); InputStream is2 = new FileInputStream(file2)) {
            for (; ; ) {
                readBytes1 = is1.read(buffer1);
                readBytes2 = is2.read(buffer2);
                if ((readBytes1 <= 0 && readBytes2 > 0) || (readBytes2 <= 0 && readBytes1 > 0)) {
                    return false;
                }
                if (readBytes1 <= 0 & readBytes2 <= 0) {
                    break;
                }
                for (int i = 0; i < buffer1.length; i++) {
                    if (buffer1[i] != buffer2[i]) {
                        return false;
                    }
                }
            }
        } catch (IOException e) {
            throw e;
        }
        return true;
    }
}

//   1) Реализуйте сервис для сравнения файлов на идентичность. Файлы считаются идентичными если они побайтово равны.
//   Файлы разной длинны, или файлы в которых хотя бы один байт отличен считаются разными.
//   2) Дополните полученный сервис возможностью передачи адресов файлов в ключевом режиме призапуске приложения из командной строки.