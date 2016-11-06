/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.Color;
import java.sql.Time;
import java.util.Vector;
import static practice.Pixel.equalColor;

/**
 *
 * @author Shlez
 */
public class TimePixel extends Pixel {
    
    private Time time;
    
    public TimePixel(double x, double y, Color color, Time time) {
        super(x, y, color);
        this.time = time;
    }
    
    public TimePixel(TimePixel t) {
       
        super(t.getX(), t.getY(), t.getColor());
        this.time = t.time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    public static Vector<TimePixel> equalTime(Vector<TimePixel> vector, Time time) {
        
        Vector<TimePixel> newVector = new Vector<TimePixel>();
        
        for (TimePixel pixel : vector) {
            if (pixel.getTime() == time) newVector.add(pixel);
        }
        
        return newVector;
    }
    
    public static void main(String[] args) {
        
        Vector<TimePixel> vector = new Vector<TimePixel>();
        
        Time t1 = new Time(10000);
        Time t2 = new Time(20000);
        Time t3 = new Time(30000);
        
        TimePixel p1 = new TimePixel(1, 2, Color.RED, t1);
        TimePixel p2 = new TimePixel(2, 3, Color.RED, t1);
        TimePixel p3 = new TimePixel(3, 4, Color.RED, t1);
        
        vector.add(p1);
        vector.add(p2);
        vector.add(p3);
        
        vector = equalTime(vector, t1);
        System.err.println("vector length = " + vector.size());
        
    }
    
}
