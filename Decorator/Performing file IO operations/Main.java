import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            // Original file operation
            FileOperation writeFileOperation = new WriteFileOperation("output.txt", "This is \nmy output file");

            // Decorated with logging
            FileOperation decoratedFileOperation = new LoggingFileOperationDecorator(writeFileOperation);

            // Perform file operation
            decoratedFileOperation.perform();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}