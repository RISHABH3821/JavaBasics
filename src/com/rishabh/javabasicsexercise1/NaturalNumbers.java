package com.rishabh.javabasicsexercise1;

public class NaturalNumbers {
    public void printNN(int n){
        int sum = 0;
        System.out.format("First %d natural numbers:\n", n);

        for(int i=1;i<=n;i++){
            System.out.format("%d, ", i);
            sum +=i;
        }

        System.out.format("Squares %d natural numbers:\n", n);

        for(int i=1;i<=n;i++){
            System.out.format("%d, ", i*i);
        }

        System.out.format("\nSum of first %d natural numbers:\n", n);
        System.out.println(sum);

        System.out.format("avg of first %d natural numbers:\n", n);
        System.out.println(sum/n);

    }

    public static void main(String[] args){
        NaturalNumbers naturalNumbers = new NaturalNumbers();
        naturalNumbers.printNN(5);
    }


}
