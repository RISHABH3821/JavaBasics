package com.rishabh.javabasicsexercise1;

public class Pay {
    public void printPay(int hours, double basePay) {
        if (basePay < 9.61) {
            System.out.println("Error base pay cannot be less than 9.61");
        } else if (hours > 60) {
            System.out.println("Error max hours is 60");
        } else if (hours < 40) {
            double pay = hours * basePay;
            System.out.format("Pay for %d  hours with base pay of %f = %f\n", hours, basePay, pay);
        } else {
            double pay = 40 * basePay + (hours-40)*(1.5*basePay);
            System.out.format("WITH OVERTIME Pay for %d  hours with base pay of %f = %f\n", hours, basePay, pay);
        }
    }

    public static void main(String[] args){
        Pay pay = new Pay();
        pay.printPay(30, 12); // in 40 hour range
        pay.printPay(42, 10); // above 40 hours should give overtime
        pay.printPay(49, 8); // base pay less than 9.61 should print error
        pay.printPay(62, 13); // hours more than 60 should print error.
    }

}
