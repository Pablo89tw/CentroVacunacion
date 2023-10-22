package Conexion;

import Entidades.Ciudadano;
import Entidades.Turno;

import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class Certificado {
        GeneradorQR qr = new GeneradorQR();
    
       public void ArmarCertificado(Ciudadano c1, Turno t1, Turno t2, Turno t3) throws IOException {
            try {
            PDDocument document = null;
            if (t1 != null && t2 == null && t3 == null) {
                document = PDDocument.load(getClass().getResource("/Imagenes/certificado_d1.pdf").openStream());
            } else if (t1 != null && t2 != null && t3 == null) {
                document = PDDocument.load(getClass().getResource("/Imagenes/certificado_d2.pdf").openStream());
            } else if (t1 != null && t2 != null && t3 != null) {
                document = PDDocument.load(getClass().getResource("/Imagenes/certificado_d3.pdf").openStream());
            }
            
            String codigo = "";
            codigo += "Datos: " + c1.getApellido() + " " + c1.getNombre() + " DNI: "+ c1.getDNI() + " iD: " + c1.getIdCiudadano();
            codigo += "|\n| Dosis 1: " + t1.getVial().getMarca() + "/ /" + t1.getVial().getNumeroSerie() + "/ /" + t1.getVial().getFechaColocacion().toLocalDate() + "/ /" + t1.getVial().getIdVial();
            if (t2 != null) {
                codigo += "|\n| Dosis 2: " + t2.getVial().getMarca() + "/ /" + t2.getVial().getNumeroSerie() + "/ /" + t2.getVial().getFechaColocacion().toLocalDate() + "/ /"+ t2.getVial().getIdVial();
            }        
            if (t3 != null) {
                codigo += "|\n| Dosis 3:" + t3.getVial().getMarca() + "/ /" + t3.getVial().getNumeroSerie() + "/ /" + t3.getVial().getFechaColocacion().toLocalDate() + "/ /" + t3.getVial().getIdVial();
            }

            PDPage page1 = document.getPage(0);
            PDPageContentStream contentStream1 = new PDPageContentStream(document, page1, PDPageContentStream.AppendMode.APPEND, true);

            BufferedImage qrImage = qr.metodoQr(codigo);
            PDImageXObject qrXObject = LosslessFactory.createFromImage(document, qrImage);
            contentStream1.drawImage(qrXObject, 75, 400, qrImage.getWidth(), qrImage.getHeight());   
            
            PDPage page2 = document.getPage(0);
            PDPageContentStream contentStream2 = null;

            PDPage page3 = document.getPage(1);
            PDPageContentStream contentStream3 = new PDPageContentStream(document, page3, PDPageContentStream.AppendMode.APPEND, true);

            PDPage page4 = document.getPage(1);
            PDPageContentStream contentStream4 = null;

            contentStream1.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream1.beginText();
            contentStream1.newLineAtOffset(294, 585);
            contentStream1.showText(c1.getApellido() + " " + c1.getNombre());
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.newLineAtOffset(294, 542);
            contentStream1.showText(Integer.toString(c1.getDNI()));
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.newLineAtOffset(294, 510);
            if (c1.getFechaNacimiento() != null) {
                contentStream1.showText(c1.getFechaNacimiento().toString());
            } else {
                contentStream1.showText("Sin Datos");
            }
            contentStream1.endText();

            String esquema = (c1.getDosisAplicadas() < 3) ? "Esquema Incompleto" : "Esquema Completo";
            contentStream1.beginText();
            contentStream1.newLineAtOffset(294, 480);
            contentStream1.showText(esquema);
            contentStream1.endText();

            contentStream1.close();

            if (t1 != null) {
                contentStream2 = new PDPageContentStream(document, page2, PDPageContentStream.AppendMode.APPEND, true);

                generateText(contentStream2, 199, 293, t1.getVial().getMarca());
                generateText(contentStream2, 199, 250, Integer.toString(t1.getVial().getNumeroSerie()));
                generateText(contentStream2, 199, 203, t1.getVacunatorio().getNombre() + " " + t1.getVacunatorio().getDireccion());
                generateText(contentStream2, 392, 294, "Primera");
                generateText(contentStream2, 392, 250, t1.getVial().getFechaColocacion().toLocalDate().toString());

                contentStream2.close();
            }

            if (t2 != null) {
                contentStream3.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream3.beginText();
                contentStream3.newLineAtOffset(199, 575);
                contentStream3.showText(t2.getVial().getMarca());
                contentStream3.endText();

                generateText(contentStream3, 199, 530, Integer.toString(t2.getVial().getNumeroSerie()));
                generateText(contentStream3, 199, 483, t2.getVacunatorio().getNombre() + " " + t2.getVacunatorio().getDireccion());
                generateText(contentStream3, 392, 575, "Segunda");
                generateText(contentStream3, 392, 530, t2.getVial().getFechaColocacion().toLocalDate().toString());

                contentStream3.close();
            }

            if (t3 != null) {
                contentStream4 = new PDPageContentStream(document, page4, PDPageContentStream.AppendMode.APPEND, true);

                generateText(contentStream4, 199, 293, t3.getVial().getMarca());
                generateText(contentStream4, 199, 250, Integer.toString(t3.getVial().getNumeroSerie()));
                generateText(contentStream4, 199, 203, t3.getVacunatorio().getNombre() + " " + t3.getVacunatorio().getDireccion());
                generateText(contentStream4, 392, 294, "Tercera");
                generateText(contentStream4, 392, 250, t3.getVial().getFechaColocacion().toLocalDate().toString());

                contentStream4.close();
            }

            String nombreArchivo = c1.getApellido() + "_" + c1.getNombre().charAt(0) + "_" + "certificado.pdf";

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Seleccionar ubicación de descarga");

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF", "pdf");
            fileChooser.setFileFilter(filter);
            fileChooser.setSelectedFile(new File(nombreArchivo));

            int userSelection = fileChooser.showSaveDialog(null);
            String rutaDescarga = null;
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                rutaDescarga = fileChooser.getSelectedFile().getAbsolutePath();
                document.save(rutaDescarga);
            }
            int opcion = JOptionPane.showConfirmDialog(null, "Descarga completa, ¿Desea abrirlo?", "Abrir", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                try {
                    File pdfFile = new File(rutaDescarga);
                    if (pdfFile.exists()) {
                        Desktop.getDesktop().open(pdfFile);
                    } else {
                        JOptionPane.showMessageDialog(null, "El archivo PDF no existe en la ubicación especificada.");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
      }

 private void generateText(PDPageContentStream contentStream, float x, float y, String text) throws IOException {
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.beginText();
        contentStream.newLineAtOffset(x, y);
        contentStream.showText(text);
        contentStream.endText();
    }
 

}
