public class EditorMemento {
    private final String content;
    private final String filename;

    public EditorMemento(String content, String filename) {
        this.content = content;
        this.filename = filename;
    }

    // Esses métodos só devem ser acessíveis pelo Originator (TextEditor)
    protected String getContent() {
        return content;
    }

    protected String getFilename() {
        return filename;
    }

}
