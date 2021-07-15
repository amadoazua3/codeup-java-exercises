package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        Path path = getPath("src", "fileIO", "files");
        tryCreateDirectory(path);

        // Try to create the file
        path = Paths.get(path.toAbsolutePath().toString(), "test.txt");
        tryCreateFile(path);

        // Print out the final location of the file
        System.out.println(path.toAbsolutePath());
    }


    public static Path getPath(String filename){
        return Paths.get(filename);
    }

    public static Path getPath(String parentDirectory, String filename){
        return Paths.get(parentDirectory, filename);
    }

    public static Path getPath(String parentDirectory, String childDirectory, String filename){
        return Paths.get(parentDirectory, childDirectory, filename);
    }

    public static boolean doesPathExist(Path path){
        return Files.exists(path);
    }


    public static void tryCreateDirectory(Path pathToCreate) {

        if (!doesPathExist(pathToCreate)) {

            try {
                Files.createDirectory(pathToCreate);
            } catch (IOException e) {
                System.out.println("Could not create the directory at: ");
                System.out.println(pathToCreate.toAbsolutePath());
            }

        } else {
            System.out.println("The path at: " + pathToCreate.toAbsolutePath() + " already exists");
        }
    }

    public static void tryCreateFile(Path path){

        if(!doesPathExist(path)){
            try{
                Files.createFile(path);
            }catch (IOException e){
                System.out.println("Could not create file at: " + path.toAbsolutePath());
            }
        } else {
            System.out.println("The file at: " + path.toAbsolutePath() + " already exists");
        }

    }

}
