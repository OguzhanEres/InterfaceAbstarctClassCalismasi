public class App{
    public static void main(String[] args) {
        Duck duck = new Duck("Ördek");
        duck.move();
        duck.fly();
        duck.swim();

        Cat cat = new Cat("Kedi");
        cat.move();

        Eagle eagle = new Eagle("Kartal");
        eagle.move();
        eagle.fly();
    }
}
