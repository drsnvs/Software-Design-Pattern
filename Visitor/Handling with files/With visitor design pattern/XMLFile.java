class XMLFile implements File {
    private String fileName;

    public XMLFile(String fileName) {
        this.fileName = fileName;
    }

    public void accept(FileVisitor visitor) {
        visitor.visitXMLFile(this);
    }

    public String getFileName() {
        return fileName;
    }
}