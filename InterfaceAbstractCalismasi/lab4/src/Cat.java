class Cat extends Animal implements Moveable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving.");
    }
}