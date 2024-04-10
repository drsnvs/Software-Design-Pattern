import java.io.*;
abstract class FileOperationDecorator implements FileOperation {
    protected FileOperation decoratedOperation;

    public FileOperationDecorator(FileOperation decoratedOperation) {
        this.decoratedOperation = decoratedOperation;
    }

    public void perform() throws IOException {
        decoratedOperation.perform();
    }
}