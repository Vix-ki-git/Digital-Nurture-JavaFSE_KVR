public class ExcelDocFactory extends DocumentFactory {
    public ExcelDocument createDocument() {
        return new ExcelDocumentConcrete();
    }
}