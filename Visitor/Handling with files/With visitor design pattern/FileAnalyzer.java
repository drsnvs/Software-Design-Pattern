class FileAnalyzer implements FileVisitor {
    @Override
    public void visitJavaFile(JavaFile file) {
        // Analyze Java file
        System.out.println("Analyzing Java file: " + file.getFileName());
    }

    @Override
    public void visitXMLFile(XMLFile file) {
        // Analyze XML file
        System.out.println("Analyzing XML file: " + file.getFileName());
    }

    @Override
    public void visitTextFile(TextFile file) {
        // Analyze text file
        System.out.println("Analyzing text file: " + file.getFileName());
    }
}