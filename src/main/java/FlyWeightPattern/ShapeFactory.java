/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author patri
 */

// ShapeFactory.java
// Fábrica para criar objetos Circle2 compartilháveis
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        // Verifica se já existe um círculo com a cor fornecida
        Circle2 circle = (Circle2) circleMap.get(color);

        if (circle == null)
        {
            // Se não existir, cria um novo círculo e o armazena no mapa
            circle = new Circle2(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }

        // Retorna o círculo existente ou recém-criado
        return circle;
    }
}
