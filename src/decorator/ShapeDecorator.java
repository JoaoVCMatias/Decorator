/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author joaov
 */
public class ShapeDecorator implements IShape{
    protected IShape shape;

    public ShapeDecorator(IShape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        this.shape.draw();
    }
    
}
