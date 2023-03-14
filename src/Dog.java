public class Dog extends Animal {

    static int dogs = 0;

    public Dog(String name) {
        super(500, 10);
        this.name = name;
        dogs++;
    }

    public static int getDogs() {
        return dogs;
    }

    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(this.name + " пробігла " + distance + " метрів.");
        } else {
            System.out.println(this.name + " не хоче бігати, тому вирішила піти поїсти.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(this.name + " проплила " + distance + " метрів.");
        } else {
            System.out.println("Не так вже й " + this.name + " любить плавати.");
        }
    }
}
