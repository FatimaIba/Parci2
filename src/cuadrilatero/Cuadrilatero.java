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
public abstract class Cuadrilatero {
private int X1,X2,X3,X4;
private int Y1,Y2,Y3,Y4;
public void Area(){
System.err.println("El resultado del area es:");
}
    public Cuadrilatero(int X1, int X2, int X3, int X4, int Y1, int Y2, int Y3, int Y4) {
        this.X1 = X1;
        this.X2 = X2;
        this.X3 = X3;
        this.X4 = X4;
        this.Y1 = Y1;
        this.Y2 = Y2;
        this.Y3 = Y3;
        this.Y4 = Y4;
    }
    public int getX1() {
        return X1;
    }
    public void setX1(int X1) {
        this.X1 = X1;
    }
    public int getX2() {
        return X2;
    }
    public void setX2(int X2) {
        this.X2 = X2;
    }
    public int getX3() {
        return X3;
    }
    public void setX3(int X3) {
        this.X3 = X3;
    }
    public int getX4() {
        return X4;
    }

    public void setX4(int X4) {
        this.X4 = X4;
    }

    public int getY1() {
        return Y1;
    }

    public void setY1(int Y1) {
        this.Y1 = Y1;
    }

    public int getY2() {
        return Y2;
    }

    public void setY2(int Y2) {
        this.Y2 = Y2;
    }

    public int getY3() {
        return Y3;
    }

    public void setY3(int Y3) {
        this.Y3 = Y3;
    }

    public int getY4() {
        return Y4;
    }

    public void setY4(int Y4) {
        this.Y4 = Y4;
    }
   
}
