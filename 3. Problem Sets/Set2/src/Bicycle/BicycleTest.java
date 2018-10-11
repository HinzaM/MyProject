package Bicycle;


import javax.swing.*;

public class BicycleTest {

    public static void main(String[] args) {

        //bicycle1
        Bicycle bicycle1 = new Bicycle();
        bicycle1.setValue(bicycle1.getValue() + 10);

        //bicycle2
        String name, valueAsString;
        int value, total = 0;

        name = JOptionPane.showInputDialog("Enter name: ");
        valueAsString = JOptionPane.showInputDialog("Enter value: ");
        value = Integer.parseInt(valueAsString);

        Bicycle bicycle2 = new Bicycle(name,value);

        total = bicycle1.getValue() + bicycle2.getValue();

        //println
        System.out.println(bicycle1);
        System.out.println(bicycle2);

        System.out.println("\n\nTotal value of the 2 Bicycles: " + total);


    }
}
