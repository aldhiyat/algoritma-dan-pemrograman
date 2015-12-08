/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package quizpraktikum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Agung Aldhiyat
 */
public class ArrayListImplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = sc.nextInt();
        int i = 0;
        int N = sc.nextInt();

        switch(pilih){
            case 1:
                ArrayList<Integer> arrInt = new ArrayList<>();


                while (i < N && N != 0) {
                    arrInt.add(sc.nextInt());
                    i++;
                }

                if (!arrInt.isEmpty()) {
                    for ( int start = 0, end = arrInt.size() - 1 ;start < end ; start++, end-- ){
                        Collections.swap( arrInt, start, end ) ;
                    }
                    System.out.println(arrInt);
                    Collections.sort(arrInt);
                    System.out.println(arrInt);
                }else{
                    System.out.println("Array Kosong");
                }
            break;

            case 2:
                ArrayList<Character> arrChar = new ArrayList<>();

                while (i < N && N != 0) {
                    arrChar.add(sc.next().charAt(0));
                    i++;
                }

                if (!arrChar.isEmpty()) {
                    for ( int start = 0, end = arrChar.size() - 1 ;start < end ; start++, end-- ){
                        Collections.swap( arrChar, start, end ) ;
                    }
                    System.out.println(arrChar);
                    Collections.sort(arrChar);
                    System.out.println(arrChar);
                }else{
                    System.out.println("Array Kosong");
                }
            break;

            case 3:
                ArrayList<String> arrStr = new ArrayList<>();

                while (i < N && N != 0) {
                    arrStr.add(sc.next());
                    i++;
                }

                if (!arrStr.isEmpty()) {
                    for ( int start = 0, end = arrStr.size() - 1 ;start < end ; start++, end-- ){
                        Collections.swap( arrStr, start, end ) ;
                    }
                    System.out.println(arrStr);
                    Collections.sort(arrStr);
                    System.out.println(arrStr);
                }else{
                    System.out.println("Array Kosong");
                }
            break;
        }
    }
}
