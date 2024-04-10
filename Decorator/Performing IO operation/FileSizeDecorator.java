import java.io.File;

// Decorator for File Size
class FileSizeDecorator implements IOOperation {
    private IOOperation ioOperation;
	
    public FileSizeDecorator(IOOperation ioOperation) {
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