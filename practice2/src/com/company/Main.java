package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        //可輸入向量的維度
        System.out.print("enter capacity: ");
        int num=scn.nextInt();
        double x[]=new double[num];
        double y[]=new double[num];
        //可輸入x向量的向量數字
        System.out.print("enter x number: ");
        for(int i=0;i<num;i++){
            x[i]=scn.nextDouble();
        }
        //可輸入y向量的向量數字
        System.out.print("enter y number: ");
        for(int i=0;i<num;i++){
            y[i]=scn.nextDouble();
        }
        System.out.println("xy向量的內積: "+innerProduct(x,y));
        System.out.println("x向量的norm: "+norm2(x));
        System.out.println("y向量的norm: "+norm2(y));
        System.out.println("xy向量的cos值: "+cosine(x,y));
    }

    //計算xy向量的內積
    public static double innerProduct(double x[], double y[]){
        double inner=0;
        for(int i=0;i<x.length;i++){
            inner +=x[i]*y[i];
        }

        return inner;

    }

    //計算該向量的norm
    public static double norm2(double x[]){
        double total=0;
        for(int i=0;i<x.length;i++){
            total +=Math.pow(x[i],2);
        }
        double norm1=Math.pow(total,0.5);

        return norm1;

    }
    //計算xy向量的cos值
    public static double cosine(double x[], double y[]){
        double inner=innerProduct(x,y);
        double norm3=norm2(x);
        double norm4=norm2(y);
        double cos=inner/(norm3*norm4);

        return cos;

    }



}
