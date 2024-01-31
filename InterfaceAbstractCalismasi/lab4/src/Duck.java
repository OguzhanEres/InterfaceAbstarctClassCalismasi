class Duck extends Animal implements Moveable, Flyable, Swimmable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}