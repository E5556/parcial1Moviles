/*
Aplicando Recursividad, es decir una función que se llama a sí misma, sin usar ciclos for ni while ni asignaciones, calcular la potencia de un número usando multiplicaciones. Por ejemplo 4^3 es multiplicar 3 veces 4 (4X4X4), pero adicionalmente cada multiplicación puede expresarse a nivel de sumas (4X4 es lo equivalente a sumar 4 veces 4). Hacer, mediante recursividad, un código que permita calcular la potencia de un número usando multiplicaciones, pero las multiplicaciones se resuelven por suma.



*/


import java.util.Scanner;

public class recursividad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        int resultado = calcularPotencia(base, exponente);
        System.out.println(base + "^" + exponente + " = " + resultado);

        scanner.close();
    }

    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1; 
        } else if (exponente == 1) {
            return base; 
        } else {
            
            int mitad = calcularPotencia(base, exponente / 2);
            int resultado = mitad * mitad;
            
            if (exponente % 2 == 1) {
                resultado *= base;
            }

            return resultado;
        }
    }
}