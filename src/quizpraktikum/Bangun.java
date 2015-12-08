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
public class Bangun {
    public static class SegiTiga {

        private double a;
        private double b;
        private double c;

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public void hitungKeliling() {
            double keliling = this.getA() + this.getB() + this.getC();
            System.out.printf("%.2f\n", keliling);
        }
    }

    public static class PersegiPanjang {

        private double p;
        private double l;

        public double getP() {
            return p;
        }

        public void setP(double p) {
            this.p = p;
        }

        public double getL() {
            return l;
        }

        public void setL(double l) {
            this.l = l;
        }

        public void hitungKeliling() {
            if (this.p != this.l) {
                double keliling = (2*this.getP()) + (2*this.getL());
                System.out.printf("%.2f\n", keliling);
                System.out.println("N");
            } else {
                double keliling = this.getP() * 4;
                System.out.printf("%.2f\n", keliling);
                System.out.println("Y");
            }
        }
    }

    public static class Lingkaran {

        private double r;

        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }

        public void hitungKeliling() {
            double keliling = (3.14 * 2) * r;
            System.out.printf("%.2f\n", keliling);
        }

        public void perbesarKeliling(double x) {
            double keliling = 3.14 * 2 * r * x;
            System.out.printf("%.2f\n", keliling);
        }

    }

    public static void main(String[] args) {
            SegiTiga segitiga = new SegiTiga();
            Scanner input= new Scanner(System.in);
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            segitiga.setA(a);
            segitiga.setB(b);
            segitiga.setC(c);

            PersegiPanjang pp = new PersegiPanjang();
            double p = input.nextDouble();
            double l = input.nextDouble();
            pp.setL(l);
            pp.setP(p);

            Lingkaran lingkaran = new Lingkaran();
            double r = input.nextDouble();
            lingkaran.setR(r);
            double x = input.nextDouble();
            
            segitiga.hitungKeliling();
            pp.hitungKeliling();
            lingkaran.hitungKeliling();
            lingkaran.perbesarKeliling(x);
       
    }

}

