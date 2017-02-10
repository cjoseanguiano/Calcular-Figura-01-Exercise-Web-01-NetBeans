/*
Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. 
Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores necesarios para calcular el área. 
Crea un método por cada figura para calcular cada área, este devolverá un número real. 
Muestra el resultado por pantalla
 */
package calcularfigura;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class CalcularFigura {

    public static void main(String[] args) {
        int seleccion;
        double total;
        seleccion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor \n"
                + "1 Calcular area circulo\n"
                + "2 Calcular area cuadrado\n"
                + "3 Calcuclar area triangulo"));


        switch (seleccion) {

            case 1:
                int radio;
                radio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del circulo"));
                total = pedirCirculo(radio);
                JOptionPane.showMessageDialog(null, total);
                break;

            case 2:
                int ladoA;
                int ladoB;
                ladoA = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 1er valor del cuadrado"));
                ladoB = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 2do valor del cuadrado"));
                total = pedirCuadrado(ladoA, ladoB);
                JOptionPane.showMessageDialog(null, total);

                break;
            case 3:
                int base;
                int altura;
                base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base del triangulo"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura del triangulo"));
                total = pedirTriangulo(base, altura);
                JOptionPane.showMessageDialog(null, total);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Verifica el valor que ingresaste");
                break;
        }

    }

    public static double pedirCirculo(int radio) {
        return Math.pow(radio, 2) * Math.PI;
    }

    public static double pedirCuadrado(int a, int b) {
        return a * b;
    }

    public static double pedirTriangulo(int base, int altura) {
        return base * altura / 2;
    }

}
