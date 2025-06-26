import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to lab1");
//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
//        question7();
//        question8();
//        question9();
//        question10();
//        question11();
//        question12();
//        question13();
//        question14();
//        question15();
//        question16();
//        question17();
//        question18();
    }

    static void question1(){
        System.out.println("""
                \nQuestion 1:
                This program will require two numbers and will
                print the sum (addition), multiply, subtract, divide and remainder of two numbers""");
        System.out.print("\ninput the first number:");
        int num1 = scanner.nextInt();
        System.out.print("input the second number:");
        int num2 = scanner.nextInt();
        System.out.println(num1+"+"+num2+"="+(num1+num2)+
                            "\n"+num1+"-"+num2+"="+(num1-num2)+
                            "\n"+num1+"X"+num2+"="+(num1*num2)+
                            "\n"+num1+"/"+num2+"="+(num1/num2)+
                            "\n"+num1+"mod"+num2+"="+(num1%num2));
    }

    static void question2(){
        System.out.println("""
                \nQuestion 2:
                This program will take an input and will print
                multiplication table up to 10.""");
        System.out.print("input: ");
        int num1 = scanner.nextInt();
        int num2 = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(num1+" X "+num2+"= "+(num1*num2));
            num2++;
        }
    }

    static void question3(){
        System.out.println("""
                \nQuestion 3:
                This program will calculate the\s\s
                area and perimeter of a circle based on the input
               \s""");
        System.out.print("input: ");
        double radius = scanner.nextDouble();
        double pi = Math.PI;
        double cirArea = Math.pow(pi*radius,2);
        double cirPerimeter = 2*(pi*radius);

        System.out.println("\nPerimeter is = "+ cirPerimeter+
                "\nArea is = "+cirArea);


    }

    static void question4(){
        System.out.println("""
                Question 4:
                This program will find out the average
                of a set of integers\s""");
        String input = "";
        double sum = 0;
        double counter=0;

        while (true){
            System.out.print("\nEnter an integer (or write EXIT to stop):");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            int num1 = Integer.parseInt(input);
            sum +=num1;
            counter++;
        }
        System.out.println("The average is: "+(double)(sum/counter));

    }

    static void question5(){
        System.out.println("""
                Question 4:
                this program will accepts three integers as input, adds the first two integers
                together, and then determines whether the sum is equal to the third integer.\s""");

        System.out.print("enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("enter the third number: ");
        int num3 = scanner.nextInt();

        int sum = num1+num2;

        if (sum ==num3) {
            System.out.println("The result is: "+true);
        } else {
            System.out.println("The result is: "+false);
        }

    }

    static void question6(){
        System.out.println("""
                Question 6:
                This program will\s
                reverse each word you enter""");


        while (true){
            System.out.print("\ninput(write !wq to exit):");
            String input = scanner.nextLine();
            if (input.contains("!wq")) {
                System.out.println("bye");
                break;
            }
            StringBuilder sb = new StringBuilder(input);
            String reversed = String.valueOf(sb.reverse());
            System.out.println("Reverse word: "+reversed);
        }
    }

    static void question7(){
        System.out.println("""
                Question 7:
                this program will check\s
                whether the given number is even or odd
                """ );

        while (true){
            System.out.print("\ninput (write !wq to exit):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("!wq")) {
                System.out.println("bye");
                break;
            }
            int num1 =Integer.parseInt(input);
            if (num1 % 2 ==0) {
                System.out.println("The number is even");
            }else{
                System.out.println("The number is odd");
            }
        }
    }

    static void question8(){
        System.out.println("""
                Question 8:
                This program will convert\s
                the temperature in Centigrade to Fahrenheit\s""");

        while (true){
            System.out.print("\ntemperature in Centigrade(write !wq to exit):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("!wq")) {
                System.out.println("bye");
                break;
            }
            double centigrade = Double.parseDouble(input);
            double fahrenheit = (centigrade*9/5)+32;
            System.out.println("\nTemperature in Fahrenheit is: "+fahrenheit);
        }



    }
static void question9(){
    System.out.println("""
            Question 9:
            this program will take a string and a number from the use\s
            then prints the character in the given index.\s""");

    while (true){
        System.out.print("\ninput a string(to EXIT write !wq):");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("!wq")) {
            System.out.println("bye");
            break;
        }

        System.out.print("input an index:");
        int index = scanner.nextInt();

        System.out.println("Expected Output: "+ input.charAt(index));
    }
}

static void question10(){
    System.out.println("""
            Question 10
            this program will\s\s
            print the area and perimeter of a rectangle.\s""");
    System.out.print("enter the width:");
    double width = scanner.nextDouble();
    System.out.print("enter the height:");
    double height = scanner.nextDouble();
    System.out.println("Area is "+width+" * "+height+" = "+(width*height));
    System.out.println("Perimeter is "+"2"+"("+width+"+"+height+")"+"="+2*(5.6+8.5));
}

static void question11(){
    System.out.println("""
            Question 11:
            this program will compare two numbers.\s
            """);

    System.out.print("\ninput first number:");
    int num1 = scanner.nextInt();
    System.out.print("input second number:");
    int num2 = scanner.nextInt();

    if (num1 == num2) {
        System.out.println(num1+" = "+num2);
    }else if(num1>num2){
        System.out.println(num1+"!="+num2);
        System.out.println(num1+">"+num2);
    } else {
        System.out.println(num1+"!="+num2);
        System.out.println(num1+"<"+num2);
    }
}

static void question12(){
    System.out.println("""
            Question 12:
            this program will convert seconds to hours, minutes and seconds.\s""");
    System.out.print("input:");
    int secondsInput = scanner.nextInt();
    int hour = secondsInput/3600;
    int reminingSeconds = secondsInput%3600;
    int mins = reminingSeconds/60;
    int seconds = reminingSeconds %60;

    System.out.println(hour+":"+mins+":"+seconds);
}


    static void question13(){
        System.out.println("""
                Question 13:
                this program will accepts four integers from the user
                and prints equal if all four are equal, and not equal otherwise.\s""");

        System.out.print("input the first number:");
        int num1 = scanner.nextInt();
        System.out.print("input the second number:");
        int num2 = scanner.nextInt();
        System.out.print("input the third number:");
        int num3 = scanner.nextInt();
        System.out.print("input the fourth number:");
        int num4 = scanner.nextInt();

        if (num1 == num2 && num1 == num3 && num1 == num4 ) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("numbers are not equal");
        }
    }

    static void question14(){
        System.out.println("""
                Question 14:
                this program will reads an integer\s
                and check whether it is negative, zero, or
                positive.""");
        System.out.print("input a number:");
        int num1 = scanner.nextInt();
        if (num1 == 0) {
            System.out.println("Number equals zero");
        } else if (num1 > 0) {
            System.out.println("Number is positive");
        }else {
            System.out.println("number is negative");
        }

    }

    static void question15(){
        System.out.println("""
                Question 15:
                this program will count the positive, negative and zeros""");

        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        while (true){
            System.out.print("input(write -1 to exit):");
            int input = scanner.nextInt();
            if (input == -1) {
                System.out.println("bye");
                break;
            }

            if (input == 0) {
                zeroCounter++;
            }else if(input>0){
                positiveCounter++;
            }else{
                negativeCounter++;
            }

        }
        System.out.println("\nzeros: "+zeroCounter+
                "\nnegatives:"+negativeCounter+
                "\npositive:"+positiveCounter);
    }

    static void question16(){
        System.out.println("""
                Question 16:
                this program will reverse ints""");
        System.out.print("input: ");
        int num1 = scanner.nextInt();
        int reversed = 0;

        while (num1!=0){
            int digit = num1%10;
            reversed = (reversed * 10) + digit;
            num1 = num1/10;
        }
        System.out.println(reversed);
    }


    static void question17(){
        System.out.println("""
                Question 17:
                program to enter the numbers till the user wants and at the end the
                program should display the largest and smallest numbers entered.\s""");

        int large= 0;
        int small = 0;
        while (true){
            System.out.print("input(!wq to exit):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("!wq")) {
                break;
            }
            int num = Integer.parseInt(input);
            if (num > large) {
                large = num;
            } else {
                small = num;
            }
        }

        System.out.println("large: "+large+"\nsmall: "+small);
    }

    static void question18(){
        System.out.println("""
                Question 18:
                Determine and print the number of times the character ‘a’ appears in the input
                entered by the user.\s""");
        int charCount =0;
        System.out.print("input:");
        String input= scanner.nextLine();
        String[] splitedString = input.split("");

        for (int i = 0; i < input.length(); i++) {
            if (splitedString[i].contains("a")) {
                charCount++;
            }
        }
        System.out.println("Number of a : "+charCount);
    }

}
