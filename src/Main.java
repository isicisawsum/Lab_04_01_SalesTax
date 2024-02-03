//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double salesTax = 0.05; //defining variable
        double totalTax;//defining another variable
        System.out.println("What is the price of your purchase?"); //output to 'prompt' user
        int price = 15; //simulated input of 15
        System.out.println("You inputted a price of $15");
        totalTax = (price * salesTax) + price; //calculating totalTax
        System.out.println("The price of your item was $" + price + ", and there is a sales tax of 5%, bringing the total of the purchase to be $" + totalTax); //outputting the total tax
    }
}