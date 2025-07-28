
//Escribe un único método en Java que sirva para realizar los siguientes cálculos 
//sobre un rectángulo a partir de la base y la altura proporcionadas por el usuario:
// Calcular el área del rectángulo. Area=base×altura
// Calcular el perímetro del rectángulo. Perímetro=2×(base+altura)
// Calcular la diagonal del rectángulo (utilizando el teorema de Pitágoras). 
//Diagonal= (raíz cuadrada)base2+altura2
// Devolver todos los datos en un único return
//En el main pintar la información devuelta por el método
package es.cursojava.metodos.ejercicios;

public class Ejercicio3 {
    
    public static void main(String[] args) {   //metodo main pertence a la clase Ejericio3,porque estan dentro de la declaracion de la clase
        String resultado = calculosGeometricos(10, 20);               //{  }
        System.out.println(resultado);
    }
    
    public static String calculosGeometricos(double base, double altura) { //metodo calculosGeometricos pertenece a la clase Ejercicio3
        double area = base * altura;
        
        double perimetro = 2 * (base + altura);
        double base2 = Math.pow(base, 2);
        double altura2= Math.pow(altura,2);
        double baseAltura= base2 + altura2;
        double diagonal = Math.sqrt(baseAltura);
        String datos = " El area es " + area + " \n El perimetro es  " + perimetro + " \n La diagonal es  " + diagonal;
        return datos;   //variable que retornamos. Viene del String datos.
    }
	
    
}

