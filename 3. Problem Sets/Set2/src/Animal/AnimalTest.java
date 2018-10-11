package Animal;
public class AnimalTest {

    public static void main(String[] args) {

        String[] continents = new String[] { "Africa", "Antarctica","Asia","Europe","North America","Central America and the Antilles","South America","Australia" };

        Animal animal1 = new Animal("Mammal",continents, 50, 12);
        Animal animal2 = new Animal("Fish",continents, 17, 5);
        Animal animal3 = new Animal("Bird",continents, 11.5, 3);

        //method 1
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}
