
public class PdfDocFactory extends DocumentFactory {
    public PdfDocument createDocument() {
        return new PdfDocumentConcrete();
    }
}