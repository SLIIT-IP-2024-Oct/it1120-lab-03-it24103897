import java.util.Scanner;
public class IT24103897Lab3Q3
{
public static void main(String[]args)
{

int amount = 0;
int count5000 = 0;
int count1000 = 0;
int count500 = 0;
int count200 = 0;
int count100 = 0;
int count50 = 0;
int count20 = 0;
int count10 = 0;
int count05 = 0;
int count02 = 0;
int count01 = 0;

Scanner input = new Scanner(System.in);
System.out.println("Enter the rupee amount :");
amount= input.nextInt();


count5000 = amount/5000;
amount %= 5000;
count1000 = amount/1000;
amount %= 1000;
count500 = amount/500;
amount %= 500;
count200 = amount/200;
amount %= 200;
count100 = amount/100;
amount %= 100;
count50 = amount/50;
amount %= 50;
count20 = amount/20;
amount %= 20;
count10 = amount/10;
amount %= 10;
count05 = amount/05;
amount %= 05;
count02 = amount/02;
amount %= 02;
count01 = amount/01;
amount %= 01;

System.out.println("5000 Notes - "+ count5000);
System.out.println("1000 Notes - "+ count1000);
System.out.println("500 Notes - "+ count500);
System.out.println("200 Notes - "+ count200);
System.out.println("100 Notes - "+ count100);
System.out.println("50 Notes - "+ count50);
System.out.println("20 Notes - "+ count20);
System.out.println("10 Notes - "+ count10);
System.out.println("05 Notes - "+ count05);
System.out.println("02 Notes - "+ count02);
System.out.println("01 Notes - "+ count01);

}
}







