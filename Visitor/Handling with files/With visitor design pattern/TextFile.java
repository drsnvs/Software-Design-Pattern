class TextFile implements File {
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    public void accept(FileVisitor visitor) {
        visitor.visitTextFile(this);
    }

    public String getFileName() {
        return fileName;
    }
}