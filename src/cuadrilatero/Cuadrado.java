/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrilatero;

/**
 *IN
 * @author fatii
 */
public class Cuadrado extends Cuadrilatero {
    private int AreaC;
    private  double CX1,CX2,CX3,CX4;
    private double CY1,CY2,CY3,CY4;

    public Cuadrado(int AreaC, double CX1, double CX2, double CX3, double CX4, double CY1, double CY2, double CY3, double CY4, int X1, int X2, int X3, int X4, int Y1, int Y2, int Y3, int Y4) {
        super(X1, X2, X3, X4, Y1, Y2, Y3, Y4);
        this.AreaC = AreaC;
        this.CX1 = CX1;
        this.CX2 = CX2;
        this.CX3 = CX3;
        this.CX4 = CX4;
        this.CY1 = CY1;
        this.CY2 = CY2;
        this.CY3 = CY3;
        this.CY4 = CY4;
    }

    public int getAreaC() {
        return AreaC;
    }
    public void setAreaC(int AreaC) {
        this.AreaC = AreaC;
    }
    public double getCX1() {
        return CX1;
    }
    public void setCX1(double CX1) {
        this.CX1 = CX1;
    }
    public double getCX2() {
        return CX2;
    }
    public void setCX2(double CX2) {
        this.CX2 = CX2;
    }
    public double getCX3() {
        return CX3;
    }
    public void setCX3(double CX3) {
        this.CX3 = CX3;
    }
    public double getCX4() {
        return CX4;
    }

    public void setCX4(double CX4) {
        this.CX4 = CX4;
    }

    public double getCY1() {
        return CY1;
    }

    public void setCY1(double CY1) {
        this.CY1 = CY1;
    }

    public double getCY2() {
        return CY2;
    }

    public void setCY2(double CY2) {
        this.CY2 = CY2;
    }

    public double getCY3() {
        return CY3;
    }

    public void setCY3(double CY3) {
        this.CY3 = CY3;
    }

    public double getCY4() {
        return CY4;
    }

    public void setCY4(double CY4) {
        this.CY4 = CY4;
    }
    
    
}
