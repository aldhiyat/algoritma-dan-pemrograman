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
public class Pecahan {
    private int N;
    private int D;

    public int getN() {
        return N;
    }

    public int getD() {
        return D;
    }

    public void setN(int N) {
        this.N = N;
    }

    public void setD(int D) {
        this.D = D;
    }

    public Pecahan() {
        this.N = 0;
        this.D = 1;
    }

    public Pecahan(int N, int D) {
        this.N = N;
        this.D = D;
    }

    public Pecahan Substract(Pecahan P){
        this.N = this.N * P.D - P.N * this.D;
        this.D *= P.D;

        return this;
    }

    public Pecahan Substract(){
        int Denum = 1;
        int Numer = 1;

        N = ((N * Denum)-(D * Numer));
        D *= Denum;

        return this;
    }

    public Pecahan Substract(Pecahan P1, Pecahan P2){
        Pecahan P3 = new Pecahan();
        P3.N = P1.N * P2.D - P2.N * P1.D;
        P3.D = P1.D * P2.D;

        return P3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pecahan P1 = new Pecahan(sc.nextInt(), sc.nextInt());
        Pecahan P2 = new Pecahan(sc.nextInt(), sc.nextInt());

        P1.Substract(P2);
        System.out.println("P1="+P1.getN()+"/"+P1.getD()+";P2="+P2.getN()+"/"+P2.getD());
        P1.Substract();
        System.out.println("P1="+P1.getN()+"/"+P1.getD());
        Pecahan P3 = new Pecahan();
        P3 = P3.Substract(P1,P2);
        System.out.println("P1="+P1.getN()+"/"+P1.getD()+";P2="+P2.getN()+"/"+P2.getD()+";P3="+P3.getN()+"/"+P3.getD());
    }
}
