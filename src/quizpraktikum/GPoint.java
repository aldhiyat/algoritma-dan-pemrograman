/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package quizpraktikum;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Agung Aldhiyat
 */
public class GPoint <T extends Number>{
    // member variable
    private T X;
    private T Y;

    // constructor
    GPoint(T _x, T _y) {
    // user defined constructor: mengeset nilai X dengan _x dan Y dengan _y
	this.X = _x; this.Y = _y;
    }

    // Getter dan Setter
    public T getX() {
    // menghasilkan nilai X
	return this.X;
    }

    public T getY() {
    // menghasilkan nilai Y
	return this.Y;
    }

    public void setX (T newx) {
    // mengeset nilai X dengan newx
	this.X = newx;
    }

    public void setY (T newy) {
    // mengeset nilai Y dengan newy
	this.Y = newy;
    }

    // Fungsi/prosedur lain
    public int Kuadran() {
    // menghasilkan kuadran dari Point
	if ( this.X.doubleValue() > 0 && this.Y.doubleValue() > 0) {
            return 1;
    	} else if (this.X.doubleValue() < 0 && this.Y.doubleValue() > 0) {
            return 2;
	} else if (this.X.doubleValue() < 0 && this.Y.doubleValue() < 0) {
            return 3;
	} else if (this.X.doubleValue() > 0 && this.Y.doubleValue() < 0) {
            return 4;
	} else { // di sumbu atau titik origin
            return 0;
	}
    }

    public void print() {
    // Mencetak (X,Y) ke layar
        if(X instanceof Double && Y instanceof Double){
            NumberFormat formatter = new DecimalFormat("0.00");
            //System.out.print("(" + formatter.format(X) + "," + formatter.format(Y) + ")");
            System.out.printf("(%.2f,%.2f)", X, Y);
        }else{
            System.out.print("(" + this.X + "," + this.Y + ")");
        }
    }

    public static void main (String [] args) {
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int pilih;
        pilih = sc.nextInt();

        switch(pilih){
            case 1:
                GPoint<Integer> gpInt = new GPoint<>( sc.nextInt(), sc.nextInt());
                gpInt.print();
                System.out.println("");
                System.out.println(gpInt.Kuadran());
            break;
            case 2:
                GPoint<Double> gpDouble = new GPoint<>( sc.nextDouble(), sc.nextDouble());
                gpDouble.print();
                System.out.println("");
                System.out.println(gpDouble.Kuadran());
            break;
        }
    }
}
