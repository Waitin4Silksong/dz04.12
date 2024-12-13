class Animal {
    protected String name;
    protected String habitat;
    protected String diet;

    public Animal(String name, String habitat, String diet) {
        this.name = name;
        this.habitat = habitat;
        this.diet = diet;
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Місце проживання: " + habitat);
        System.out.println("Раціон: " + diet);
    }
}

class Tiger extends Animal {
    private int speed;

    public Tiger(String name, String habitat, String diet, int speed) {
        super(name, habitat, diet);
        this.speed = speed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Швидкість: " + speed + " км/год");
    }
}

class Crocodile extends Animal {
    private int teethCount;

    public Crocodile(String name, String habitat, String diet, int teethCount) {
        super(name, habitat, diet);
        this.teethCount = teethCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кількість зубів: " + teethCount);
    }
}

class Kangaroo extends Animal {
    private int jumpHeight;

    public Kangaroo(String name, String habitat, String diet, int jumpHeight) {
        super(name, habitat, diet);
        this.jumpHeight = jumpHeight;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Висота стрибка: " + jumpHeight + " м");
    }
}

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Тигр", "Джунглі", "М'ясо", 60);
        Crocodile crocodile = new Crocodile("Крокодил", "Річки", "М'ясо", 64);
        Kangaroo kangaroo = new Kangaroo("Кенґуру", "Саванна", "Фрукти", 3);

        System.out.println("Інформація про тварин:");
        tiger.displayInfo();
        System.out.println(" ");
        crocodile.displayInfo();
        System.out.println(" ");
        kangaroo.displayInfo();
    }
}
