
public class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    static int count = 0;


    public Animal(int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public void run(int distance) {
        System.out.println("пробігає " + distance + " метрів.");
    }

    public void swim(int distance) {
        System.out.println(" пропливає " + distance + " метрів.");
    }
}
