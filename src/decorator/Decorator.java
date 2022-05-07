/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

/**
 *
 * @author joaov
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RedShapeDecorator s = new RedShapeDecorator(new ClassCircle());
        s.draw();
        s.setBorder(new ClassRectangle());
        s.draw();
        System.out.println("----------------------------------");
        ShapeDecorator a = new ShapeDecorator(new ClassRectangle());
        a.draw();
        
    }
    
}
