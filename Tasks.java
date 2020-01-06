import java.util.Scanner;

class Tasks {
    public static void main (String[] args){

    int fourDigitNumber = 1234;

    int lastIndex = (fourDigitNumber % 10) ;
    int thirdIndex = ((fourDigitNumber %100) /10);
    int secondIndex = ((fourDigitNumber %1000) / 100);
    int firstIndex = (( fourDigitNumber % 10000) / 1000);
    System.out.println("Separated Digits : ");
    System.out.println(lastIndex);
    System.out.println(thirdIndex);
    System.out.println(secondIndex);
    System.out.println(firstIndex);

    System.out.println("Reversed number : " + lastIndex+ thirdIndex+ secondIndex + firstIndex);


    System.out.println("Input number :");

    Scanner scannerInstance = new Scanner(System.in);
    int inputNumber = scannerInstance.nextInt();
    int theObtainedResult = 0;
    if (inputNumber > 0) {
        theObtainedResult = inputNumber * 10;
      }

    else{
    if (inputNumber == 0) {
        theObtainedResult = inputNumber - 10;
    }
    else {
    if (inputNumber < 0) {
        theObtainedResult = inputNumber / 10;
      }
     }
    }


    System.out.println(inputNumber);
    System.out.println("The result : " + theObtainedResult);


    System.out.println("Type a temperature -  ");

    double typeNumber = scannerInstance.nextDouble();
    double temperature = 1;


    if(typeNumber == 1){
        temperature = (typeNumber * 1.8) + 32;
    }
    else{
    if(typeNumber < 1){
        temperature = (typeNumber - 32) / 1.8;
    }

    else{
    if(typeNumber > 1) {
       temperature = (typeNumber - 32) / 1.8;
      }
     }
    }

    System.out.println("Converted temperature: " + temperature);


    System.out.println("Third digit after decimal point");
    double decimalNumber = 123.45678;
    double thirdDigitAfterDecimalPoint = (decimalNumber * 1000);
    int intNumber = (int) thirdDigitAfterDecimalPoint % 10;
    System.out.println(intNumber);


    int a = 5;
    int b = 7;
    int c = 10;
    boolean isTriangle = (a+b >=c) || (a+c >= b) || (b+c >= a);
    System.out.println("Check validity of triangle");

    if (isTriangle = true){
       System.out.println(" It is valid");
    }
    else {
          isTriangle = false;
       System.out.println("It is not valid");
    }



    int typedYear = scannerInstance.nextInt();
    boolean isLeapYear = ((typedYear % 4 == 0) || (typedYear % 100 != 0) && (typedYear % 400 ==0));
    System.out.println(isLeapYear);


    if (isLeapYear) {
       System.out.println("It is a leap year" );
    }
    else {
       System.out.println("It is a normal year" );
    }

    System.out.println("Swap value of variables 'A' and 'B'");
    int A =5;
    int B = 7;
    int swapValueOfA = (A+B) - A;
    int swapValueOfB = (A + B) - B;
    System.out.println("Swap value of 'A' = " + swapValueOfA);
    System.out.println("Swap value of 'B' = " + swapValueOfB);
    }
 }
