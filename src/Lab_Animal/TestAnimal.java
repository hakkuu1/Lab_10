package Lab_Animal;

public class TestAnimal {
    public static void main(String[] args){
        Dog balto = new Dog("Balto");
        Cat leo = new Cat("Leopold");
        System.out.println("dog run: " + balto.run(500));
        System.out.println("cat run: " + leo.run(19.60));
        System.out.println("dog swim: " + balto.swim(99));
        System.out.println("cat swim: " + leo.swim(0));
        System.out.println("dog jump: " + balto.jump(5));
        System.out.println("cat jump: " + leo.jump(10));
    }
}

