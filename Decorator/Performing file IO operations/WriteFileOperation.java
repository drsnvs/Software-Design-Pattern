import java.io.*;
class WriteFileOperation implements FileOperation {
    private String filename;
    private String content;

    public WriteFileOperation(String filename, String content) {
        this.filename = filename;
        this.content = content;
    }

    public void perform() throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
}