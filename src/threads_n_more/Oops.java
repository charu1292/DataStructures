package threads_n_more;

public class Oops {

    public static void main(String[] args) {
        try {
            Animal animal = getAnimal("dog");
            animal.makeSound();
        } catch(Exception e) {
            System.out.println("incorrect animal type");
        }
    }

    public static Animal getAnimal(String type) {
        Animal a = null;
        switch (type) {
            case "dog" : a = new Dog();
                break;
            case "cat" : a = new Cat();
                break;
            default: a = null;
        }
        return a;
    }
}



interface  Animal {
    void makeSound();
}


class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("bhaw bhaw");
    }
    public void eat() {
        System.out.println("dog eats");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
    public void eat() {
        System.out.println("cat eats");
    }
}