package Fraction;

public class FractionTest {
    public static void main(String[] args) {


        Fraction fraction1 = new Fraction(15,25);
        Fraction fraction2 = new Fraction(10,20);
        Fraction fraction3 = new Fraction();


        System.out.println("\nTesting the no-argument constructor.... " + fraction3.toString());
        System.out.println("Testing the 2-argument constructor.... " + fraction1.toString());

        System.out.println("\nValue of " + fraction1.toString() + " + " + fraction2.toString() + " is " + fraction1.add(fraction2));
        System.out.println("\nValue of " + fraction1.toString() + " - " + fraction2.toString() + " is " + fraction1.subtract(fraction2));
        System.out.println("\nValue of " + fraction1.toString() + " * " + fraction2.toString() + " is " + fraction1.multiply(fraction2));
        System.out.println("\nValue of " + fraction1.toString() + " / " + fraction2.toString() + " is " + fraction1.divide(fraction2));
    }
}
