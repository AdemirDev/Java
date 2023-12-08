import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ArquivoPdf {

    public static void main(String[] args) {
        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("meuPrimeiroPDF.pdf"));

            documento.open();

            documento.add(new Paragraph("Aprendendo a gerar PDFs com Java"));
            documento.add(new Paragraph("Aprender Java é bacana"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            documento.close();
        }
    }
}
