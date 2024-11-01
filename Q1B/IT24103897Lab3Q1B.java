import java.util.Scanner;
public class IT24103897Lab3Q1B
{
public static void main(String[]args)
{
double pricePerkg,quantityKg,totalAmount,discountAmount,finalAmount;
Scanner input = new Scanner(System.in);

System.out.println("Enter the price of 1kg of rice :");
pricePerkg = input.nextDouble();

System.out.println("Enter the kilograms you want to buy :");
quantityKg = input.nextDouble();

totalAmount = pricePerkg*quantityKg;
discountAmount = totalAmount*0.1;
finalAmount = totalAmount-discountAmount;

System.out.printf("The total amount with 10%% discount is: %.2f\n", finalAmount);

}
}