
public class Demo {
    public static void main(String[] args) {

        Cat cat = new Cat("Лютик");
        Cat cat2 = new Cat("Томас");
        Dog dog = new Dog("Сорбонна");
        Dog dog2 = new Dog("Луна");

        cat.run(400);
        cat.swim(2);

        dog.run(600);
        dog.swim(5);

        cat2.run(30);
        cat2.swim(50);

        dog2.run(300);
        dog2.swim(60);

        System.out.println("Кількість котів: " + Cat.cats);
        System.out.println("Кількість собак: " + Dog.dogs);
        System.out.println("Кількість тварин: " + Animal.count);
    }
}
