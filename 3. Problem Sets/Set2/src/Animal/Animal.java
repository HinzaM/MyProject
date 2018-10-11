package Animal;
public class Animal {

    //private variables
    private String _type;
    private String[] _continents;
    private double _weight;
    private int _age;

    //no-argument constructor
    public Animal(){}

    //...
    public Animal(String type, String[] continents, double weight, int age)
    {
        _type = type;
        _continents = continents;
        _weight = weight;
        _age = age;
    }

    //mutator
    public void setType(String type) { _type = type; }
    public void setContinents(String[] continents) { _continents = continents; }
    public void setWeight(double weight) {
        _weight = weight;
    }
    public void setAge(int age) { _age = age; }

    //accessor
    public String getType() { return _type; }
    public String[] getContinents() { return _continents; }
    public double getWeight() { return _weight; }
    public int getAge() { return _age; }

    //toString method
    public String toString()
    {
        String tempStr = " ";

        for(int i=0; i<_continents.length; i++)
        {
            tempStr += _continents[i] + "\n\t\t\t";
        }
        return "\n\nType: " + getType() + "\nContinents: " + tempStr +
                "\nWeight: " + getWeight() + " kg\nAge: " + getAge();
    }
}
