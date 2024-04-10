import java.io.File;

// Concrete Component
class FileIOOperation implements IOOperation {
    private String filePath;

    public FileIOOperation(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public long getFileSize() {
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            return file.length();
        }
        return -1; // File doesn't exist or is not a regular file
    }
}