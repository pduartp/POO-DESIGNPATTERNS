/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package VisitorPattern.Interface;

import VisitorPattern.Circle;
import VisitorPattern.Rectangle;

/**
 *
 * @author patri
 */
// Interface Visitor

/* 
Declarando a interface Visitor com um conjunto de métodos visit (visitando) 
para cada cada classe de elemento concreta do programa.
 */
// Interface Visitor
public interface Visitor {

    void visit(Circle circle);

    void visit(Rectangle rectangle);
}
