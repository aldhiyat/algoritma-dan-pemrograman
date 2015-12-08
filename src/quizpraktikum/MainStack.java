/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package quizpraktikum;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Agung Aldhiyat
 */
public class MainStack {
    private int TOP;
    final int Nil = 0;
    final int MaxEl = 10;
    private int[] infotype = new int[10+1];

    public MainStack() {
        TOP=Nil;
    }


    boolean IsEmpty() /* Mengirim true jika Stack kosong: lihat definisi di atas */ {  /* Kamus Lokal */

        /* Algoritma */
        return (TOP == Nil);
    }

    boolean IsFull() /* Mengirim true jika tabel penampung nilai elemen stack penuh */ {  /* Kamus Lokal */

        /* Algoritma */
        return (TOP == MaxEl);
    }

    void Push(int X) /* Menambahkan X sebagai elemen Stack S. */ /* I.S. S mungkin kosong, tabel penampung elemen stack TIDAK penuh */ /* F.S. X menjadi TOP yang baru, TOP bertambah 1 */ {  /* Kamus Lokal */

        /* Algoritma */
        TOP++;
        infotype[TOP] = X;
    }

    public int Pop() /* Menghapus X dari Stack S. */ /* I.S. S  tidak mungkin kosong */ /* F.S. X adalah nilai elemen TOP yang lama, TOP berkurang 1 */ {  /* Kamus Lokal */
        /* Algoritma */
        TOP--;
        return infotype[TOP];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        int tempInput = input.nextInt();
        MainStack o = new MainStack();
        for (int i = 1; i <= tempInput; i++) {
            if (i % 2 != 0) {
                o.Push(i);
            }
        }
        int x=0;
        int tempTop = o.TOP;
        for (int i = o.TOP; i > 0; i--) {
            System.out.println(o.infotype[i]);
            x=o.Pop();
        }
        System.out.println("Empty stack");
        System.out.println(tempTop);
    }
}
