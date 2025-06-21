public class Test {
    public static void main(String args[]) {
        WordDocFactory factory1 = new WordDocFactory();
        WordDocument doc1 = factory1.createDocument();
        doc1.create();

        PdfDocFactory factory2 = new PdfDocFactory();
        PdfDocument doc2 = factory2.createDocument();
        doc2.create();

        ExcelDocFactory factory3 = new ExcelDocFactory();
        ExcelDocument doc3 = factory3.createDocument();
        doc3.create();
    }
}