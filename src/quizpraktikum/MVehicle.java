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
public class MVehicle {
    public static void main(String[] args) {

            int k1, k2;
            double s1, s2;
            double t1, t2;

            Scanner input = new Scanner(System.in);
            k1 = input.nextInt();
            s1 = input.nextDouble();
            t1 = input.nextDouble();

            Car C1 = new Car(k1);
            Car C2 = new Car();

            s2 = input.nextDouble();
            t2 = input.nextDouble();

            C1.hitung_kecepatan(s1, t1);
            C1.print_info();
            C2.hitung_kecepatan(s2, t2);
            C2.print_info();
    }
}

    abstract class Vehicle {
        protected int jenis;
        protected int jumlah_roda;
        protected int kapasitas_tangki;

        public abstract void hitung_kecepatan(double jarak, double waktu);

        public void print_info() {
            System.out.println(jenis);
            System.out.println(jumlah_roda);
            System.out.println(kapasitas_tangki);
        }
    }

    class Car extends Vehicle {

        @Override
        public void hitung_kecepatan(double jarak, double waktu) {
            double kecepatan = jarak / waktu;
            System.out.printf("%.2f\n", kecepatan);
        }

        public Car() {
            jenis = 1;
            jumlah_roda = 4;
            kapasitas_tangki = 200;
        }

        public Car(int kapasitas_tangki) {
            jenis = 1;
            jumlah_roda = 4;
            this.kapasitas_tangki = kapasitas_tangki;
        }

        public int getJenis() {
            return jenis;
        }

        public void setJenis(int jenis) {
            this.jenis = jenis;
        }

        public int getJumlah_roda() {
            return jumlah_roda;
        }

        public void setJumlah_roda(int jumlah_roda) {
            this.jumlah_roda = jumlah_roda;
        }

        public int getKapasitas_tangki() {
            return kapasitas_tangki;
        }

        public void setKapasitas_tangki(int kapasitas_tangki) {
            this.kapasitas_tangki = kapasitas_tangki;
        }
    }
