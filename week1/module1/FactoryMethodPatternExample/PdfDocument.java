public interface PdfDocument {
    void create();
}

class PdfDocumentConcrete implements PdfDocument {
    public void create() {
        System.out.println("Creating pdf document.");
    }
}