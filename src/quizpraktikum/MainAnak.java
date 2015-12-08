/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package quizpraktikum;

import java.util.Scanner;

/**
 *
 * @author Agung Aldhiyat
 */
interface Displayer{
    public void Display();
}

class Ayah{
    protected int Z;
    protected char C;

    protected Ayah() {
        this.Z = 0;
        this.C = '*';
    }

    protected Ayah(int Z, char C) {
        this.Z = Z;
        this.C = C;
    }

    protected int Compute(){
        return (this.Z * 2);
    }
}

class Anak extends Ayah implements Displayer{
    private int W = 0;

    public Anak() {
        this.W = 1;
    }

    public Anak(int W, int Z, char C) {
        super(Z, C);
        this.W = W;
    }

    @Override
    protected int Compute() {
        return (this.W + super.Z + 2);
    }

    @Override
    public void Display() {
        System.out.println(Z+""+C+""+W);
    }
}

public class MainAnak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ayah a1 = new Ayah();

        int _z = sc.nextInt();
        char _c = sc.next().charAt(0);

        Ayah a2 = new Ayah(_z, _c);

        Anak b1;
        b1 = new Anak();

        int _z1 = sc.nextInt();
        char _c1 = sc.next().charAt(0);
        int _w = sc.nextInt();

        Anak b2 = new Anak(_w, _z1, _c1);

        System.out.println(a1.Compute());
        System.out.println(a2.Compute());
        System.out.println(b1.Compute());
        System.out.println(b2.Compute());
        b1.Display();
        b2.Display();
    }
}
