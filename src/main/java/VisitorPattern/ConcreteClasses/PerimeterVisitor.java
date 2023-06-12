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
// Classe PerimeterVisitor que implementa a interface Visitor
public class PerimeterVisitor implements Visitor {

    @Override
    public void visit(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Perimeter of the circle: " + perimeter);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
