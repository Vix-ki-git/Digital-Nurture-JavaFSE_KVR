
public interface ExcelDocument {
    void create();
}

class ExcelDocumentConcrete implements ExcelDocument {
    public void create() {
        System.out.println("Creating Excel Document...");
    }
}