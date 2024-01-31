class Eagle extends Animal implements Moveable, Flyable {
    public Eagle(String name) {
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
}