class JavaFile implements File {
    private String fileName;

    public JavaFile(String fileName) {
        this.fileName = fileName;
    }

    public void accept(FileVisitor visitor) {
        visitor.visitJavaFile(this);
    }

    public String getFileName() {
        return fileName;
    }
}