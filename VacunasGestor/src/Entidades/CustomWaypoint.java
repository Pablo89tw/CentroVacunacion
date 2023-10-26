package Entidades;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.WaypointRenderer;

public class CustomWaypoint extends DefaultWaypoint implements WaypointRenderer<CustomWaypoint> {
    private String label;

    public CustomWaypoint(double latitude, double longitude, String label) {
        super(latitude, longitude);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public void paintWaypoint(Graphics2D g, JXMapViewer mapKit, CustomWaypoint wp) {
         Logger logger = Logger.getLogger(getClass().getName()); // Obtiene un logger para la clase actual
         logger.info("El método paintWaypoint se ha ejecutado.");
        int zoom = mapKit.getZoom();
        int x = (int) mapKit.getTileFactory().geoToPixel(wp.getPosition(), zoom).getX();
        int y = (int) mapKit.getTileFactory().geoToPixel(wp.getPosition(), zoom).getY();

        String imagePath = "C:\\Users\\Pablo\\Desktop\\programa 4.0\\GitHub\\CentroVacunacion\\VacunasGestor\\src\\Vistas\\Imagenes\\waypoint.png";
        BufferedImage customIcon = null;
        try {
            customIcon = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int iconWidth = customIcon.getWidth();
        int iconHeight = customIcon.getHeight();

        int xOffset = -iconWidth / 2;
        int yOffset = -iconHeight;

        g.drawImage(customIcon, x + xOffset, y + yOffset, iconWidth, iconHeight, null);
    }
}
