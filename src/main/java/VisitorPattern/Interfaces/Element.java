/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package VisitorPattern.Interfaces;

/**
 *
 * @author patri
 */

/*
Declarando a interface elemento com método accept que aceita um objeto visitante
como argumento
*/
public interface Element {

    void accept(Visitor visitor);

};
