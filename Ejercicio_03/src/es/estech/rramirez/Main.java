package es.estech.rramirez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l1, l2, l3;
        Triangle triangle;
        try {
            System.out.print("Introduce el primer lado: ");
            l1 = sc.nextInt();
            System.out.print("Introduce el segundo lado: ");
            l2 = sc.nextInt();
            System.out.print("Introduce el tercer lado: ");
            l3 = sc.nextInt();
            triangle = new Triangle(l1, l2, l3);
            System.out.println(triangle);
        } catch (InputMismatchException imex) {
            System.out.println("Excepción: " + imex.toString());
            System.out.println("No ha sintroducido un número.");
        } catch (IlegalTriangleException itex) {
            System.out.println(itex.getMessage());
        } finally {
            sc.close();
        }
    }
}
