package fileIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    public static void main(String[] args) {

//        System.out.println(getFilePath("src","fileIO", "test.txt").toAbsolutePath());

//        System.out.println("Does the path exist?");
//        System.out.println(
//                doesPathExist(
//                        getFilePath("src", "fileIO", "test.txt")));

//        tryCreateDirectory(getFilePath("src", "fileIO", "files"));

      init();

    }

    public static void init(){

        // Try to create the directory
        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
        FileDirectoryUtil.tryCreateDirectory(path);

        // Try to create the file
        path = Paths.get(path.toAbsolutePath().toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        // Print out the final location of the file
        System.out.println(path.toAbsolutePath());

        // Try to print the contents to the file BEFORE we write
        IOUtil.tryPrintContents(path);

        // Try to write to the file
        IOUtil.tryWriteToFile(getContent(), path);

        // Try to print the contents to the file AFTER we write
        IOUtil.tryPrintContents(path);


    }


    public static List<String> getContent(){

        List<String> contentToWrite = new ArrayList<String>();
        contentToWrite.add("This is a new line!");
        contentToWrite.add("ANOTHER LINE");
        contentToWrite.add("ANOTHER ANOTHER LINE!!!");

        return contentToWrite;

    }



}
