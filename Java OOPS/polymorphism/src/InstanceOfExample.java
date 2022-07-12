public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof  Object);      // true
        System.out.println(animal instanceof  Animal);      // true
        System.out.println(animal instanceof  Bat);         // false 자손타입의 참조변수로 조상 인스턴스를 참조할 수 없음

        Animal cat = new Cat();
        System.out.println(cat instanceof  Object);         // true
        System.out.println(cat instanceof Animal);          // true
        System.out.println(cat instanceof Cat);             // true
        System.out.println(cat instanceof Bat);             // false
    }
}

class Animal {};
class Bat extends Animal{};
class Cat extends Animal{};