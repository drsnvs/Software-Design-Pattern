// Decorator for Word Count
class WordCountDecorator implements TextOperation {
    private TextOperation textOperation;

    public WordCountDecorator(TextOperation textOperation) {
        this.textOperation = textOperation;
    }

    @Override
    public String operate(String text) {
        // Implement word count logic here
        String[] words = text.split("\\s+");
        StringBuilder wordCount = new StringBuilder();
        int count = 0;
        for (String word : words) {
            count++;
            wordCount.append(word);
            wordCount.append(": ");
            wordCount.append(countOccurrences(text, word));
            wordCount.append(", ");
            count = 0;
        }
        return wordCount.toString();
    }

    private int countOccurrences(String text, String word) {
        int count = 0;
        int idx = text.indexOf(word);
        while (idx != -1) {
            count++;
            idx = text.indexOf(word, idx + 1);
        }
        return count;
    }
}