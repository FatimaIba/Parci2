/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrilatero;

import java.util.Scanner;
/**
 *
 * @author fatii
 */
public class mainN {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----TRAPECIO-----");
        System.out.println("Ingresa la coordenada 1:");
        double X1 = sc.nextDouble();
        double Y4 = sc.nextDouble();
        System.out.println("Ingresa la coordenada 2:");
        double X4 = sc.nextDouble();
        double Y3 = sc.nextDouble();
        System.out.println("Ingresa la coordenada 3:");
        double X3 = sc.nextDouble();
        double Y2 = sc.nextDouble();
        System.out.println("Ingresa la coordenada 4:");
        double X2 = sc.nextDouble();
        double Y1 = sc.nextDouble();
        double AreaT;
        AreaT = (X1 * Y4) + (X4 * Y3) + (X3 * Y2) + (X2 * Y1) - (Y1 * X4) + (Y4 * X3) + (Y3 * X2) + (Y2 * X1) / 2;
        System.out.println("El area del trapecio es:" + AreaT);
        System.out.println("---------------------------------------");
        System.out.println("----RECTANGULO-----");
        System.out.println("Ingresa la coordenada 1 :");
        double x1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Ingresa la coordenada 2:");
        double x2 = sc.nextDouble();
        double y3 = sc.nextDouble();
        System.out.println("Ingresa la coordenada 3:");
        double x3 = sc.nextDouble();
        double y4 = sc.nextDouble();
        System.out.println("Ingresa la coordenada 4:");
        double x4 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double Area;
        Area = (x1 * y2) + (x2 * y3) + (x3 * y4) + (x4 * y1) - (y1 * x2) + (y2 * x3) + (y3 * x4) + (y4 * x1) / 2;
        System.out.println("El area del rectangulo es:" + Area);
   
        System.out.println("---------------------------------------");
        System.out.println("----CUADRADO-----");
        System.out.println("Ingresa la coordenada 1 :");
        double CX1 = sc.nextDouble();
        double CY2 = sc.nextDouble();
        System.out.println("Ingresa la coordenada 2:");
        double CX2 = sc.nextDouble();
        double CY3 = sc.nextDouble();
        System.out.println("Ingresa la coordenada 3:");
        double CX3 = sc.nextDouble();
        double CY4 = sc.nextDouble();
        System.out.println("Ingresa la coordenada 4:");
        double CX4 = sc.nextDouble();
        double CY1 = sc.nextDouble();
        double AreaC;
        AreaC = (CX1 * CY2) + (CX2 * CY3) + (CX3 * CY4) + (CX4 * CY1) - (CY1 * CX2) + (CY2 * CX3) + (CY3 * CX4) + (CY4 * CX1) / 2;
        System.out.println("El area del cuadrado es:" + AreaC);
    } 
}
