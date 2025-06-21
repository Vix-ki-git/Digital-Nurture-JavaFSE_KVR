

public class WordDocFactory extends DocumentFactory {
    public WordDocument createDocument() {
        return new WordDocumentConcrete();
    }
}