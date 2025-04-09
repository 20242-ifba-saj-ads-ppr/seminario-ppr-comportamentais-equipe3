public class Main {
    public static void main(String[] args) {
        // Criando nosso editor de texto
        TextEditor editor = new TextEditor();
        CareTaker careTaker = new CareTaker();
        
        System.out.println("=== Teste do Editor de Texto com Padrão Memento ===\n");
        
        // Estado inicial
        System.out.println("Estado inicial:");
        System.out.println(editor);
        System.out.println();
        
        // Salvando o estado inicial
        careTaker.addMemento(editor.save());
        
        // Primeira alteração
        editor.write("Olá, este é um teste do padrão Memento.\n");
        System.out.println("Após primeira escrita:");
        System.out.println(editor);
        System.out.println();
        
        // Salvando o estado após a primeira escrita
        careTaker.addMemento(editor.save());
        
        // Segunda alteração
        editor.write("Esta é a segunda linha do texto.\n");
        editor.setFilename("memo_teste.txt");
        System.out.println("Após segunda escrita e renomeação:");
        System.out.println(editor);
        System.out.println();
        
        // Salvando o estado após a segunda escrita
        careTaker.addMemento(editor.save());
        
        // Terceira alteração
        editor.write("Esta é a terceira linha do texto.\n");
        System.out.println("Após terceira escrita:");
        System.out.println(editor);
        System.out.println();
        
        // Salvando o estado após a terceira escrita
        careTaker.addMemento(editor.save());
        
        // Testando a operação de desfazer (undo)
        System.out.println("=== Testando operação de desfazer ===");
        
        EditorMemento restoredState = careTaker.undo();
        if (restoredState != null) {
            editor.restore(restoredState);
            System.out.println("Após desfazer uma vez:");
            System.out.println(editor);
            System.out.println();
        }
        
        restoredState = careTaker.undo();
        if (restoredState != null) {
            editor.restore(restoredState);
            System.out.println("Após desfazer duas vezes:");
            System.out.println(editor);
            System.out.println();
        }
        
        // Testando a operação de refazer (redo)
        System.out.println("=== Testando operação de refazer ===");
        
        restoredState = careTaker.redo();
        if (restoredState != null) {
            editor.restore(restoredState);
            System.out.println("Após refazer uma vez:");
            System.out.println(editor);
            System.out.println();
        }
        
        restoredState = careTaker.redo();
        if (restoredState != null) {
            editor.restore(restoredState);
            System.out.println("Após refazer duas vezes:");
            System.out.println(editor);
            System.out.println();
        }
        
        // Testando alteração após desfazer
        System.out.println("=== Testando nova alteração após desfazer/refazer ===");
        
        // Desfazer uma vez para retornar a um estado anterior
        restoredState = careTaker.undo();
        if (restoredState != null) {
            editor.restore(restoredState);
            System.out.println("Voltando uma etapa:");
            System.out.println(editor);
            System.out.println();
        }
        
        // Fazer uma nova alteração após desfazer
        editor.write("Esta é uma nova direção do texto!\n");
        System.out.println("Após nova escrita:");
        System.out.println(editor);
        System.out.println();
        
        // Salvar o novo estado
        careTaker.addMemento(editor.save());
        
        // Verificando se o histórico futuro foi descartado
        System.out.println("Tamanho do histórico: " + careTaker.getHistorySize());
        System.out.println("Índice atual: " + careTaker.getCurrentIndex());
        System.out.println();
        
        // Tentando refazer (não deve haver operações para refazer)
        restoredState = careTaker.redo();
        if (restoredState == null) {
            System.out.println("Não há operações para refazer, como esperado.");
        } else {
            editor.restore(restoredState);
            System.out.println("Após tentar refazer (isso não era esperado):");
            System.out.println(editor);
        }
        
    }
}