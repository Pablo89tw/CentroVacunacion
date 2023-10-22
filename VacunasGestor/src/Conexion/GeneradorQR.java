package Conexion;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GeneradorQR {

    public BufferedImage metodoQr(String codigo) {
        int size = 215;
        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        try {
            BitMatrix matrix = qrCodeWriter.encode(codigo, BarcodeFormat.QR_CODE, size, size);
            return matrixToImage(matrix, 0);
        } catch (WriterException ex) {
            Logger.getLogger(GeneradorQR.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null; // Devuelve null en caso de error
    }
    
    private static BufferedImage matrixToImage(BitMatrix matrix, int margin) {
     int width = matrix.getWidth();
    int height = matrix.getHeight();
    
    // Calcula las nuevas dimensiones de la imagen con los márgenes recortados
    int startX = margin;
    int startY = margin;
    int newWidth = width - 2 * margin;
    int newHeight = height - 2 * margin;

BufferedImage image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
    for (int x = 0; x < newWidth; x++) {
        for (int y = 0; y < newHeight; y++) {
            image.setRGB(x, y, matrix.get(x + startX, y + startY) ? 0xFF000000 : 0x00000000);
        }
    }
    return image;
    }
}

