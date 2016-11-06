/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.Color;
import java.util.Vector;

/**
 *
 * @author Shlez
 */
public class Pixel extends Point {
    
    private Color color;
    
    
    
    public Pixel(double x, double y, Color color) {
         super(x, y);
         this.color = color;
    }
    
    public Pixel(Pixel p) {
        super(p.getX(), p.getY());
        this.color = p.color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }   
    
    public static Vector<Pixel> equalColor(Vector<Pixel> vector, Color color) {
        
        Vector<Pixel> newVector = new Vector<Pixel>();
        
        for (Pixel pixel : vector) {
            if (pixel.getColor() == color) newVector.add(pixel);
        }
        
        return newVector;
    }
    
    public static void main(String[] args) {
        
        Vector<Pixel> vector = new Vector<Pixel>();
        
        Pixel p1 = new Pixel(1, 2, Color.RED);
        Pixel p2 = new Pixel(2, 3, Color.RED );
        Pixel p3 = new Pixel(3, 4, Color.BLUE);
        
        vector.add(p1);
        vector.add(p2);
        vector.add(p3);
        
        vector = equalColor(vector, Color.RED);
        System.err.println("vector length = " + vector.size());
        
    }
    
}
