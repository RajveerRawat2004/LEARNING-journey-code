import java.util.Scanner;

public class CWH_19_PracticeSet_Chapter4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Question 1
//        int age  = 10 ;
//        if (age == 11) {              // wrong code:- assignment operator(=) can't use in if statement
//            System.out.println("I am 11");
//        }else {
//            System.out.println("I am not 11");
//        }
        // ans-->  I am not 11

        // Question 2
//        System.out.println("hindi Marks");
//        byte hindi = sc.nextByte();
//        System.out.println("english Marks");
//        byte english = sc.nextByte();
//        System.out.println("math Marks");
//        byte math = sc.nextByte();
//        int sum = hindi+english+math;
//        float totalMarksPercentage = sum*100/300;
//        System.out.println("Your percentage :"+totalMarksPercentage);
//        if (hindi >= 33 && english >= 33 && math >= 33 && totalMarksPercentage >= 40){
//            System.out.println("pass");
//        }else {
//            System.out.println("fail");
//        }

        // Question 3
        // My solution
//        System.out.println("your income in lakh");
//        float income =sc.nextFloat();
//        if (income>=10.0){
//            System.out.println("your income tax is 30%");
//        }else if(income>=5.0 && income<10.0) {
//            System.out.println("your income tax is 10%");
//        }else if(income>=2.5 && income<5.0) {
//            System.out.println("your income tax is 10%");
//        }else{
//            System.out.println("your income is tax free");
//        }
        // Harry solution
//        float tax=0;
//        System.out.println("Enter your income in lakhs per annum");
//        float income = sc.nextFloat();
//        if (income <= 2.5) {
//            tax = tax+0;
//        }else if (income > 2.5 && income <= 5.0) {
//            tax = tax + 0.05f * (income-5.0f);
//        }else if (income > 5.0 && income <= 10.0) {
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (income-10.0f);
//        }else if (income < 10.0) {
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (10.0f-5.0f);
//            tax = tax + 0.3f * (income-5.0f);
//        }
//        System.out.println("total tax paid by the employee :"+ tax);

        //  Question 4
//        int number = sc.nextInt();
//        switch (number){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }

        // Question 5
//        System.out.println("Enter the year");
//        int year = sc.nextInt();
//        if (year%4==0) {
//            System.out.println("this is a leap year");
//        }else {
//            System.out.println("this is NOT a leap year");
//        }

        // Question 6
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("this is  an organisational website");
//        }else if(website.endsWith(".com")){
//            System.out.println("this is  an commercial website");
//        }else if(website.endsWith(".in")){
//            System.out.println("this is  an indian website");
//        }
    }
}
