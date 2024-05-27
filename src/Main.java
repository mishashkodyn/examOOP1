//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.makeSound();
        myDog.breathe();
        myDog.action();

        myCat.makeSound();
        myCat.breathe();
        myCat.action();
    }
}