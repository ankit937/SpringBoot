package Models;

public class BoseSpeaker implements  Speaker{

    @Override
    public void makeSound() {
        System.out.println("This is BoseSpeaker");
    }
}
