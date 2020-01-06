import java.util.Scanner;

public class Exercise {

    public static int findMiddleNumber (int a, int b, int c){

     if ((a<b && b<c) || (c<b && b<a)) {
     return b;
      }
     if ((b < a && a > c) || c < a && a < b){
     return a;
      }
     return c;
    }

    public static int calculateTheExponent (int number,int exponent){
    if (exponent != 0){
        return (number * calculateTheExponent(number,(exponent-1)));
       }
    return 1;
    }

    public static void separatingDigits(int n){
    if (n >= 10){
        separatingDigits((n/10));
     }
      System.out.println("Digit - " + n%10);
    }

    public static int factorial(int num){
     if(num >= 1){
         return (num * factorial((num - 1)));
        }
     return 1;
    }


    public static int findFibonacciNthNumber(int n){
      if(n == 0){
        return 0;
      }
      if (n == 1){
         return 1;
      }
      return findFibonacciNthNumber(n-1) + findFibonacciNthNumber(n -2);
    }

    public static void convertDays(int n){
        System.out.println("Convert days to seconds : ");
        int hours = n *24;
        int minutes = n*60;
        int seconds = n*3600;

        System.out.println("Hours = " + hours + ", Minutes = " + minutes + ", Seconds = " + seconds);
    }

    public static void numberRow (int x){
        System.out.println(x);
        x --;
        if (x > 0){
            numberRow(x);
        }
    }


    public static void main(String[] args){

        int a =10, b =20, c =30;
        System.out.println( "The middle number is : " + findMiddleNumber(a,b,c));

        int number = 5;
        int exponent = 2;
        int result = calculateTheExponent(number,exponent);
        System.out.println("The result is :" + result);

        int n = 2546;
        separatingDigits(n);

        int num = 8;
        System.out.println("Factorial of " + num + " = " + factorial(num));

        int numberOfFibonacci = 6;
        System.out.println("N-th number of Fibonacci is " + findFibonacciNthNumber(numberOfFibonacci));

        int day = 5;
        convertDays(day);

        int factorialOfFibonacci = factorial(findFibonacciNthNumber(numberOfFibonacci));
        System.out.println("Factorial of Fibonacci's N-th number : " + factorialOfFibonacci);


        Scanner scannerInstance = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = scannerInstance.nextInt();
        numberRow(rows);
    }
}
