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

class Queue{
    Float[] T = new Float[100];
    int HEAD;
    int TAIL;
    int MaxEl;
}

public class MQueue{
    final int Nil = -1;
    Queue Q = new Queue();
    
    public MQueue() {
        Q.TAIL = Nil;
    }
    
    public boolean IsEmpty(Queue Q){
        return (Q.HEAD == Nil && Q.TAIL == Nil);
    }
        
    public boolean IsFull(Queue Q){
        return (NBElement(Q) == Q.MaxEl);
    }
    
    public int NBElement(Queue Q){
        if(Q.HEAD > Q.TAIL){
            return (Q.MaxEl - (Q.HEAD - Q.TAIL)-1);
        }else if(Q.TAIL > Q.HEAD){
            return ((Q.TAIL - Q.HEAD)+1);
        }else if((Q.HEAD == Q.TAIL) && !IsEmpty(Q)){
            return 1;
        }else{
            return 0;
        }
    }
    
    public void CreateEmpty(Queue Q, int Max){
        Q.MaxEl = Max;
        Q.HEAD = Nil;
        Q.TAIL = Nil;
        Q.T = new Float[Max];
    }
    
    public void Dealokasi(Queue Q){
        Q.MaxEl = 0;
        Q.TAIL = Nil;
        Q.HEAD = Nil;
        Q.T = null;
    }
    
    public void Add(Queue Q, float X){
        if(!IsFull(Q)){
            if(IsEmpty(Q)){
                Q.HEAD = 0;
                Q.TAIL = 0;
            }else if(Q.TAIL == Q.MaxEl){
                Q.TAIL = 0;
            }else{
                Q.TAIL++;
            }

            Q.T[Q.TAIL] = X;
            
        }
    }
    
    public void Del(Queue Q, float X){
        if(!IsEmpty(Q)){
            if(NBElement(Q) == 1){
                X = Q.T[Q.HEAD];
                Q.HEAD = Nil;
                Q.TAIL = Nil;
            }else{
                X = Q.T[Q.HEAD];
                Q.HEAD++;
            }
        }
    }
    
    public float peek(Queue Q, int i){
        return (Q.T[i]);
    }
    
    public float AvgElmt(Queue Q){
        float total = 0;
        int size = 0;
        if(!IsEmpty(Q)){
            for (int i = Q.HEAD; i <= Q.TAIL; i++) {
                total = total + Q.T[i];
                size++;
            }
        }
      
        return (total / size);
    }
    
    public static void main(String[] args) {
        MQueue MQ = new MQueue();
        Queue Q = new Queue();
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        
        MQ.CreateEmpty(Q, sc.nextInt());
        int input = sc.nextInt();
        int i = 0;
        
        while(input != 0 && i != Q.MaxEl){
            if(input == 1){
                MQ.Add(Q, sc.nextInt());
            }else if(input == 2){
                MQ.Del(Q, Q.HEAD);
            }
            input = sc.nextInt();
            i++;
        }
        
        System.out.println(MQ.NBElement(Q));
        if(!Float.isNaN(MQ.AvgElmt(Q))){
            System.out.printf("%.2f\n",MQ.AvgElmt(Q));
        }else{
            System.out.println("Tidak bisa dihitung");
        }
    }
}
