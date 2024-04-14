public class Main {
    public static void main(String[] args) {
        FileVisitor fileAnalyzer = new FileAnalyzer();

        File javaFile = new JavaFile("Example.java");
        File xmlFile = new XMLFile("Config.xml");
        File textFile = new TextFile("Readme.txt");

        javaFile.accept(fileAnalyzer);
        xmlFile.accept(fileAnalyzer);
        textFile.accept(fileAnalyzer);
    }
}