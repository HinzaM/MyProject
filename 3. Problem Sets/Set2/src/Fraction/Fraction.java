package Fraction;

public class Fraction {

    //private variables
    private int numerator, denominator;


    //no arg cons...
    public Fraction()
    {
        this.numerator = 0;
        this.denominator = 1;
    }


    //arg cons...
    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    //accessor
    public void setNum(int numerator) { this.numerator = numerator; }
    public void setDen(int denominator) { this.denominator = denominator; }


    //mutator
    public int getNum() { return this.numerator; }
    public int getDen() { return this.denominator; }


    //toString method
    public String toString() {
           return getNum() + "/" + getDen();
    }


    //calculations
    public Fraction add(Fraction x)
    {
         Fraction sum = new Fraction();
         sum.numerator = numerator * x.denominator + x.numerator * denominator;
         sum.denominator = denominator * x.denominator;
         return sum;
    }

    public Fraction subtract(Fraction x) {
        Fraction sum = new Fraction();
        sum.numerator = numerator * x.denominator - x.numerator * denominator;
        sum.denominator = denominator * x.denominator;
        return sum;
    }

    public Fraction multiply(Fraction x) {
        Fraction sum = new Fraction();
        sum.numerator = numerator * x.numerator;
        sum.denominator = denominator * x.denominator;
        return sum;
    }

    public Fraction divide(Fraction x) {
        Fraction sum = new Fraction();
        sum.numerator = numerator * x.denominator;
        sum.denominator = denominator * x.numerator;
        return sum;
    }





}



