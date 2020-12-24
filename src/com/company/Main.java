package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstLastDigitSum(123809182));  // provide the input..

    }

    public static int sumFirstLastDigitSum(int number) {

        int i = 0;
        int j = number % 10;

        if (number < 0) {
            return -1;
        }if (number <= 9) {
            return number + number;
        } else     //  Limiting if not a valid number

            while (number >= 1) {

                int even = number % 2;
                if(even == 0){
                    int num = number / 10;
                    int rem = number % 10;

                    i += rem;

                }
                number /= 10; // limiting the loop
            }

        return (number) + j;
    }

}
