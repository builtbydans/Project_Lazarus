package Part04_01_IntroToOOP.Whistle;

public class Whistle {
    private String sound;

    // constructor
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(sound);
    }
}

