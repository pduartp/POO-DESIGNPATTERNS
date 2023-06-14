/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package io.github.pduartp.designpatterntests;

import FlyWeightPattern.Circle2;
import FlyWeightPattern.ShapeFactory;
import VisitorPattern.Circle;
import VisitorPattern.ConcreteVisitorClasses.AreaVisitor;
import VisitorPattern.ConcreteVisitorClasses.PerimeterVisitor;
import VisitorPattern.Interface.Visitor;
import VisitorPattern.Rectangle;

/**
 *
 * @author patri
 */
public class Program {

    private static final String[] colors =
    {
        "Red", "Green", "Blue", "White", "Black"
    };

    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="VISITOR">
        System.out.println("\t\t<< Visitor >>");

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

//</editor-fold>            
        //<editor-fold defaultstate="collapsed" desc="FlyWeight">
        System.out.println("\t\t<< FlyWeight >>");

        // Cria 20 círculos com cores e posições aleatórias
        for (int i = 0; i < 20; i++)
        {
            Circle2 circle2 = (Circle2) ShapeFactory.getCircle(getRandomColor());
            circle2.setX(getRandomX());
            circle2.setY(getRandomY());
            circle2.setRadius(100);
            circle2.draw();
        }

//</editor-fold>
    }

    private static String getRandomColor() {
        // Gera uma cor aleatória a partir do array de cores disponíveis
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        // Gera uma posição X aleatória
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        // Gera uma posição Y aleatória
        return (int) (Math.random() * 100);
    }
}
