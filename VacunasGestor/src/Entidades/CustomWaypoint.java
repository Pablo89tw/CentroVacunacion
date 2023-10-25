package Entidades;

import org.jxmapviewer.viewer.DefaultWaypoint;

public class CustomWaypoint extends DefaultWaypoint {
    private String label;

    public CustomWaypoint(double latitude, double longitude, String label) {
        super(latitude, longitude);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}