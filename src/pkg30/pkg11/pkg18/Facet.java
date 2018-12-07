package pkg30.pkg11.pkg18;

import java.awt.*;
import java.awt.geom.*;

public class Facet {
    public Vector[] v;
    public Color color;
    
    
    public Facet(Vector v1, Vector v2, Vector v3, Vector v4, Color color) {
        v = new Vector[4];
        
        v[0] = v1;
        v[1] = v2;
        v[2] = v3;
        v[3] = v4;
        this.color = color;
    }
    public Vector normal(){
        Vector a = new Vector(v[1].x - v[0].x, v[1].y - v[0].y, v[1].z - v[0].z);
        Vector b = new Vector(v[2].x - v[1].x, v[2].y - v[1].y, v[2].z - v[1].z);
        
        return a.cross(b);
    }
    public void printVectors() {
        for (int i = 0; i < 4; i++) {
            v[i].printCoordinates();
        }
        System.out.println("");
    }
}