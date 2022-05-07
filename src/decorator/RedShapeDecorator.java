/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author joaov
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(IShape shape) {
        super(shape);
    }
    @Override
    public void draw() {
        super.draw();
        System.out.println(" Vermelho");
    }
    public void setBorder(IShape shape){
        setRedBorder(shape);
        System.out.println("Objeto mudado");
    }
    private void setRedBorder(IShape shape){
        this.shape = shape;
    }
    
}
