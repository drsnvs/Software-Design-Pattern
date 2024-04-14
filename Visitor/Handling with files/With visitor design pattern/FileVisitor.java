interface FileVisitor {
    void visitJavaFile(JavaFile file);
    void visitXMLFile(XMLFile file);
    void visitTextFile(TextFile file);
}