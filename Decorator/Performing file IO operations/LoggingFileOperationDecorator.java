import java.io.*;
class LoggingFileOperationDecorator extends FileOperationDecorator {
    public LoggingFileOperationDecorator(FileOperation decoratedOperation) {
        super(decoratedOperation);
    }

    public void perform() throws IOException {
        System.out.println("Logging: Performing file operation");
        decoratedOperation.perform();
        System.out.println("Logging: File operation completed");
    }
}