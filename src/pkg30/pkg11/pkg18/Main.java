package pkg30.pkg11.pkg18;

//import java.util.Scanner;
import java.awt.*;
import java.awt.geom.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Четыре вектора квадрата");
        Vector[] vector = new Vector[4];
        vector[0] = new Vector(0, 0, 0);
        vector[1] = new Vector(1, 0, 0);
        vector[2] = new Vector(1, 1, 0);
        vector[3] = new Vector(0, 1, 0);
        Color color = new Color(0, 0, 0);
        Facet face = new Facet(vector[0], vector[1], vector[2], vector[3], color);
        face.printVectors();
        
        System.out.println("Вращение плоскости относительно x");
        face.rotateByX(90);
        face.printVectors();
        
        System.out.println("Вращение плоскости относительно y");
        face.rotateByY(90);
        face.printVectors();
        
        System.out.println("Вращение плоскости относительно z");
        face.rotateByZ(90);
        face.printVectors();
        
        System.out.println("Вращение плоскости относительно x, y, z");
        face.rotate(90, 90, 90);
        face.printVectors();
        
        System.out.println("Почти нормаль");
        Vector normal = face.normal();
        normal.printCoordinates();
        
        System.out.println("Два вектора");
        Vector a = new Vector(0, 10 ,0);
        Vector b = new Vector(20 ,0 ,0);
        a.printCoordinates();
        b.printCoordinates();
        
        System.out.println("Скалярное произведение векторов а и b");
        double test = a.dot(b);
        System.out.println(test);
        System.out.println("");
        
        System.out.println("Сложение векторов");
        Vector p = a.plus(b);
        p.printCoordinates();
        
        System.out.println("Вычитаниие векторов");
        Vector m = b.minus(a);
        m.printCoordinates();
        
        System.out.println("Векторное произведение");
        Vector c = b.cross(a);
        c.printCoordinates();
        
        System.out.println("Поворот относительно х");
        Vector rx = p.rotateByX(90);
        rx.printCoordinates();
        
        System.out.println("Поворот относительно y");
        Vector ry = p.rotateByY(90);
        ry.printCoordinates();
        
        System.out.println("Поворот относительно z");
        Vector rz = p.rotateByZ(90);
        rz.printCoordinates();
        
        System.out.println("Поворот относительно x, y, z");
        Vector r = p.rotate(90, 90, 90);
        r.printCoordinates();

//        for(int i=0; i<1; i++){
//            System.out.println("Hello meh");
//        }
//        Vector v = new Vector(1, 1, 1);
//            while(true){
//                Scanner in = new Scanner(System.in);
//                System.out.print("\nType equation: ");
//                String str = in.nextLine();
//            }
    }
}