package Conexion;

import Entidades.Ciudadano;
import Entidades.Turno;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class Certificado {

    public void ArmarCertificado(Ciudadano c1, Turno t1, Turno t2, Turno t3) {
        try {
            PDDocument document = null;
            if (t1 != null && t2 == null && t3 == null) {
                document = PDDocument.load(new File("D:\\Proyecto Final Java\\Todo_1D.pdf"));
            } else if (t1 != null && t2 != null && t3 == null) {
                document = PDDocument.load(new File("D:\\Proyecto Final Java\\Todo_2D.pdf"));
            } else if (t1 != null && t2 != null && t3 != null) {
                document = PDDocument.load(new File("D:\\Proyecto Final Java\\Todo_3D.pdf"));
            }
            PDPage page = document.getPage(0);
            PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, true);

            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(328, 692);
            contentStream.showText(c1.getApellido() + " " + c1.getNombre());
            contentStream.endText();

            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(328, 647);
            contentStream.showText(Integer.toString(c1.getDNI()));
            contentStream.endText();

            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(328, 612);
            contentStream.showText(LocalDate.now().toString());
            contentStream.endText();

            String esquema = "";
            if (c1.getDosisAplicadas() < 3) {
                esquema = "Incompleto";
            }
            if (c1.getDosisAplicadas() == 3) {
                esquema = "Completo";
            }

            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(328, 578);
            contentStream.showText(esquema);
            contentStream.endText();
            contentStream.close();

            if (t1 != null) {
                PDPage page2 = document.getPage(1);
                PDPageContentStream contentStream2 = new PDPageContentStream(document, page2, PDPageContentStream.AppendMode.APPEND, true);

                contentStream2.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream2.beginText();
                contentStream2.newLineAtOffset(222, 692);
                contentStream2.showText(t1.getVial().getMarca());
                contentStream2.endText();

                contentStream2.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream2.beginText();
                contentStream2.newLineAtOffset(222, 647);
                contentStream2.showText(Integer.toString(t1.getVial().getNumeroSerie()));
                contentStream2.endText();

                contentStream2.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream2.beginText();
                contentStream2.newLineAtOffset(222, 600);
                contentStream2.showText(t1.getVacunatorio().getNombre() + " " + t1.getVacunatorio().getDireccion());
                contentStream2.endText();

                contentStream2.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream2.beginText();
                contentStream2.newLineAtOffset(422, 692);
                contentStream2.showText("Primera");
                contentStream2.endText();

                contentStream2.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream2.beginText();
                contentStream2.newLineAtOffset(422, 647);
                contentStream2.showText(t1.getVial().getFechaColocacion().toLocalDate().toString());
                contentStream2.endText();

                contentStream2.close();
               
                if (t2 == null) {
                    String nombreArchivo2 = c1.getApellido() + "_" + c1.getNombre().charAt(0) + "_" + "certificado.pdf";
                    String rutaCompleta2 = "D:\\Proyecto Final Java\\Certificados\\" + nombreArchivo2;
                    document.save(rutaCompleta2);
                }
                }
                if (t2 != null) {
                    PDPage page3 = document.getPage(2);
                    PDPageContentStream contentStream3 = new PDPageContentStream(document, page3, PDPageContentStream.AppendMode.APPEND, true);

                    contentStream3.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream3.beginText();
                    contentStream3.newLineAtOffset(222, 692);
                    contentStream3.showText(t2.getVial().getMarca());
                    contentStream3.endText();

                    contentStream3.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream3.beginText();
                    contentStream3.newLineAtOffset(222, 647);
                    contentStream3.showText(Integer.toString(t2.getVial().getNumeroSerie()));
                    contentStream3.endText();

                    contentStream3.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream3.beginText();
                    contentStream3.newLineAtOffset(222, 600);
                    contentStream3.showText(t2.getVacunatorio().getNombre() + " " + t2.getVacunatorio().getDireccion());
                    contentStream3.endText();

                    contentStream3.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream3.beginText();
                    contentStream3.newLineAtOffset(422, 692);
                    contentStream3.showText("Segunda");
                    contentStream3.endText();

                    contentStream3.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream3.beginText();
                    contentStream3.newLineAtOffset(422, 647);
                    contentStream3.showText(t2.getVial().getFechaColocacion().toLocalDate().toString());
                    contentStream3.endText();

                    contentStream3.close();
                
                  if (t3 == null) {
                    String nombreArchivo2 = c1.getApellido() + "_" + c1.getNombre().charAt(0) + "_" + "certificado.pdf";
                    String rutaCompleta2 = "D:\\Proyecto Final Java\\Certificados\\" + nombreArchivo2;
                    document.save(rutaCompleta2);
                  }
                }
                    if (t3 != null) {
                    PDPage page4 = document.getPage(3);
                    PDPageContentStream contentStream4 = new PDPageContentStream(document, page4, PDPageContentStream.AppendMode.APPEND, true);

                    contentStream4.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream4.beginText();
                    contentStream4.newLineAtOffset(222, 692);
                    contentStream4.showText(t3.getVial().getMarca());
                    contentStream4.endText();

                    contentStream4.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream4.beginText();
                    contentStream4.newLineAtOffset(222, 647);
                    contentStream4.showText(Integer.toString(t3.getVial().getNumeroSerie()));
                    contentStream4.endText();

                    contentStream4.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream4.beginText();
                    contentStream4.newLineAtOffset(222, 600);
                    contentStream4.showText(t3.getVacunatorio().getNombre() + " " + t3.getVacunatorio().getDireccion());
                    contentStream4.endText();

                    contentStream4.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream4.beginText();
                    contentStream4.newLineAtOffset(422, 692);
                    contentStream4.showText("Tercera");
                    contentStream4.endText();

                    contentStream4.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream4.beginText();
                    contentStream4.newLineAtOffset(422, 647);
                    contentStream4.showText(t3.getVial().getFechaColocacion().toLocalDate().toString());
                    contentStream4.endText();

                    contentStream4.close();
                }
                String nombreArchivo2 = c1.getApellido() + "_" + c1.getNombre().charAt(0) + "_" + "certificado.pdf";
                String rutaCompleta2 = "D:\\Proyecto Final Java\\Certificados\\" + nombreArchivo2;
                document.save(rutaCompleta2);
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
