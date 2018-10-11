package Bicycle;

public class Bicycle {

    //private variables
    private String _name;
    private int _value;

    //no-argument constructor
    public Bicycle(){}

    //argument constructor
    public Bicycle(String name, int value)
    {
        _name = name;
        _value = value;
    }

    //accessor
    public void setName(String name) { _name = name; }
    public void setValue(int value) { _value = value; }

    //mutator
    public String getName() { return _name; }
    public int getValue() { return _value; }


    //toString
    public String toString()
    {
        return "\nName: " + getName() + "\nValue: " + getValue();
    }

}



