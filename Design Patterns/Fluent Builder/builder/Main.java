package builder;


public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog.Builder("Ramzes")
                .age(4)
                .healty(true)
                .build();
        System.out.println(dog);
    }
}
