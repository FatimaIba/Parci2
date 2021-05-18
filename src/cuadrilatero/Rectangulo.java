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
public class Rectangulo extends Cuadrilatero {
    private double Area;
    private double x1,x2,x3,x4;
    private double y1,y2,y3,y4;
    private double R1,R2,R3,R4;
    private double r1,r2,r3,r4;

    public Rectangulo(double Area, int X1, int X2, int X3, int X4, int Y1, int Y2, int Y3, int Y4) {
        super(X1, X2, X3, X4, Y1, Y2, Y3, Y4);
        this.Area = Area;
    }
    
    public void AreaRectangulo(){
    Area= (double)((R1+R2+R3+R4+r1+r2+r3+r4)/2); 
    }
    public double getArea() {
        return Area;
    }
    public void setArea(double Area) {
        this.Area = Area;
    }
    public double getx1() {
        return x1;
    }
    public void setx1(double x1) {
        this.x1 = x1;
    }
    public double getx2() {
        return x2;
    }
    public void setx2(double x2) {
        this.x2 = x2;
    }
    public double getx3() {
        return x3;
    }
    public void setx3(double x3) {
        this.x3 = x3;
    }
    public double getx4() {
        return x4;
    }
    public void setx4(double x4) {
        this.x4 = x4;
    }
    public double gety1() {
        return y1;
    }
    public void sety1(double y1) {
        this.y1 = y1;
    }
    public double gety2() {
        return y2;
    }
    public void sety2(double y2) {
        this.y2 = y2;
    }
    public double gety3() {
        return y3;
    }
    public void sety3(double y3) {
        this.y3 = y3;
    }
    public double gety4() {
     return y4;
    }
    public void sety4(double y4) {
      this.y4 = y4;
    }
    public double getR1() {
        return R1= x1*y2;
    }
    public void setR1(double R1) {
        this.R1 = R1;
    }
    public double getR2() {
        return R2=x2*y3;
    }
    public void setR2(double R2) {
        this.R2 = R2;
    }
    public double getR3() {
        return R3=x3*y4;
    }
    public void setR3(double R3) {
        this.R3 = R3;
    }
    public double getR4() {
        return R4= x4*y1;
    }
    public void setR4(double R4) {
        this.R4 = R4;
    }
 public double getr1() {
        return r1= y1*x2;
    }
 public double getr2() {
        return r2= y2*x3;
    }
 public double getr3() {
        return r3= y3*x4;
    }
 public double getr4() {
        return r4= y4*x1;
    }
}
