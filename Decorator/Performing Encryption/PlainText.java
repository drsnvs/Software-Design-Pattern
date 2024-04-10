class PlainText implements TextOperation {
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String operate(String text) {
        return this.text;
    }
}