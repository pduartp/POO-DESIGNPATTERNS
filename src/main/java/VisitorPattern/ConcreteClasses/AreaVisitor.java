/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisitorPattern.ConcreteClasses;

import VisitorPattern.Circle;
import VisitorPattern.Interfaces.Visitor;
import VisitorPattern.Rectangle;

/**
 *
 * @author patri
 */
// Classe AreaVisitor que implementa a interface Visitor
public class AreaVisitor implements Visitor {

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of the circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of the rectangle: " + area);
    }
}
