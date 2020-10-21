package com.rishabh.javabasicsexercise1;

public class Triangle {
    public void printNumberTriangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Triangle triangle = new Triangle();
        triangle.printNumberTriangle(4);
    }
}
