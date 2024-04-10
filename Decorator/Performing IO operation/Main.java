import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file name:");
		String name = sc.next();
		
        // Creating plain file operation component
        IOOperation fileOperation = new FileIOOperation(name);

        // Decorating with file path
        IOOperation filePathOperation = new FilePathDecorator(fileOperation);
        System.out.println("File Path: " + filePathOperation.getFilePath());

        // Decorating with file size
        IOOperation fileSizeOperation = new FileSizeDecorator(fileOperation);
        long fileSize = fileSizeOperation.getFileSize();
        if (fileSize != -1) {
            System.out.println("File Size: " + fileSize + " bytes");
        } else {
            System.out.println("File does not exist or is not a regular file.");
        }
    }
}