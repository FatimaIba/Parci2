/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrilatero;

/**
 *
 * @author fatii
 */
public class Trapecio extends Cuadrilatero{
    private double T1,T2,T3,T4;
    private double AreaT;
    public void AreaTrapecio(){
    System.out.println("El area del traprecio es: + AreaT");
    }
    public Trapecio(double T1, double T2, double T3, double T4,double AreaT, int X1, int X2, int X3, int X4, int Y1, int Y2, int Y3, int Y4) {
        super(X1, X2, X3, X4, Y1, Y2, Y3, Y4);
        this.T1 = T1;
        this.T2 = T2;
        this.T3 = T3;
        this.T4 = T4;
        this.AreaT = AreaT;
    }
    public double getT1() {
        return T1;
    }

    public void setT1(double T1) {
        this.T1 = T1;
    }

    public double getT2() {
        return T2;
    }

    public void setT2(double T2) {
        this.T2 = T2;
    }

    public double getT3() {
        return T3;
    }

    public void setT3(double T3) {
        this.T3 = T3;
    }

    public double getT4() {
        return T4;
    }

    public void setT4(double T4) {
        this.T4 = T4;
    }

 
    public double getAreaT() {
        return AreaT;
    }
    public void setAreaT(double AreaT) {
        this.AreaT = AreaT;
    }
    
}