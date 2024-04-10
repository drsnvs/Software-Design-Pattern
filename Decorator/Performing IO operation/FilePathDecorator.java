import java.io.File;

// Decorator for File Path
class FilePathDecorator implements IOOperation {
    private IOOperation ioOperation;

    public FilePathDecorator(IOOperation ioOperation) {
        this.ioOperation = ioOperation;
    }

    @Override
    public String getFilePath() {
        return ioOperation.getFilePath();
    }

    @Override
    public long getFileSize() {
        return ioOperation.getFileSize();
    }
}