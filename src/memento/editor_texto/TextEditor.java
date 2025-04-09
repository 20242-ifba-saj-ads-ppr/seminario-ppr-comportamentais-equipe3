public class TextEditor {

    private StringBuilder content;
    private String filename;

    public TextEditor() {
        this.content = new StringBuilder();
        this.filename = "sem_titulo.txt";
    }

    public void write(String text) {
        content.append(text);
    }

    public void clear() {
        content = new StringBuilder();
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContent() {
        return content.toString();
    }

    public String getFilename() {
        return filename;
    }

    public EditorMemento save() {
        return new EditorMemento(content.toString(), filename);
    }

    public void restore(EditorMemento memento) {
        content = new StringBuilder(memento.getContent());
        filename = memento.getFilename();
    }

    @Override
    public String toString() {
        return "Arquivo: " + filename + "\nConteúdo:\n" + content.toString();
    }
}
