package lesson4.dz1;

import java.io.*;

public class CopyFilesWithExtension {

    public static void copyFiles (String folderFrom, String folderTo, String extension) throws IOException {
        File fileFrom = new File(folderFrom);
        File fileTo = new File(folderTo);
        File[] files = fileFrom.listFiles();

        if (!fileFrom.exists() || !fileTo.exists()) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < files.length; i++) {
            String str = files[i].toString();
            str = str.substring(str.length()-extension.length());
            if (files[i].isFile() & str.equals(extension)) {
                File out = new File(folderTo, files[i].getName());
                copyFile(files[i], out);
            }
        }
    }
        private static void copyFile(File in, File out) throws IOException {
            try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
                is.transferTo(os);
                System.out.println(in + " is copied");
            } catch (IOException e) {
                throw e;
            }
        }
}

//    1)Напишите программу, которая скопирует все файлы с заранее определенным расширением
//    (например, только doc) из одного каталога в другой.