import java.io.*;

public class FileIO {

    public static void main(String[] args) throws IOException {

        // Create a new FileReader object.
        FileReader reader = new FileReader("myfile.txt");

        // Wrap the FileReader object in a BufferedReader object.
        BufferedReader bufferedReader = new BufferedReader(reader);

        // Read a line from the file.
        String line = bufferedReader.readLine();

        // Close the BufferedReader object.
        bufferedReader.close();

        // Print the line to the console.
        System.out.println(line);
    }
}