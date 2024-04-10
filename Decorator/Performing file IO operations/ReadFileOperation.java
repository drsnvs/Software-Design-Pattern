import java.io.*;
class ReadFileOperation implements FileOperation {
    private String filename;

    public ReadFileOperation(String filename) {
        this.filename = filename;
    }

    public void perform() throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}