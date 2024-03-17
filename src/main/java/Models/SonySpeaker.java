package Models;

public class SonySpeaker implements  Speaker{

    @Override
    public void makeSound() {
        System.out.println("This is Sony Speaker");
    }
}
