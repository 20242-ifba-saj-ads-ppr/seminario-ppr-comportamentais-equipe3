import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private final List<EditorMemento> mementos = new ArrayList<>();
    private int currentIndex = -1;

    public void addMemento(EditorMemento memento) {

        if (currentIndex < mementos.size() - 1) {
            mementos.subList(currentIndex + 1, mementos.size()).clear();
        }
        
        mementos.add(memento);
        currentIndex = mementos.size() - 1;
    }

    public EditorMemento undo() {
        if (currentIndex > 0) {
            currentIndex--;
            return mementos.get(currentIndex);
        }
        return null;
    }

    public EditorMemento redo() {
        if (currentIndex < mementos.size() - 1) {
            currentIndex++;
            return mementos.get(currentIndex);
        }
        return null;
    }

    public int getHistorySize() {
        return mementos.size();
    }

    public int getCurrentIndex() {
        return currentIndex;
    }
}
