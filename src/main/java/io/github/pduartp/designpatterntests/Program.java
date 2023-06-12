/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package io.github.pduartp.designpatterntests;

import VisitorPattern.Circle;
import VisitorPattern.ConcreteClasses.AreaVisitor;
import VisitorPattern.ConcreteClasses.PerimeterVisitor;
import VisitorPattern.Interfaces.Visitor;
import VisitorPattern.Rectangle;

/**
 *
 * @author patri
 */
public class Program {

    public static void main(String[] args) {
        // Criando instâncias de objetos geométricos
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);

        // Criando instâncias de visitantes
        Visitor areaVisitor = new AreaVisitor();
        Visitor perimeterVisitor = new PerimeterVisitor();

        // Cálculo da área usando o visitante de área
        circle.accept(areaVisitor);
        rectangle.accept(areaVisitor);

        // Cálculo do perímetro usando o visitante de perímetro
        circle.accept(perimeterVisitor);
        rectangle.accept(perimeterVisitor);

    }
}
