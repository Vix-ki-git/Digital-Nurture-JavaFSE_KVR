
public interface WordDocument {
    void create();
    
}

class WordDocumentConcrete implements WordDocument {
    public void create() {
        System.out.println("Creating word document.");
    }
    
}