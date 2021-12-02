package Chapter2;

public class TapeDeck {
    boolean canRecord = false;

    void playTape() {
        System.out.println("Type is plaing");
    }

    void recordTape() {
        System.out.println("Its tape recording");
    }
}

class TapeDeckTestDrive {
    public static void main(String [] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if(t.canRecord == true) {
            t.recordTape();
        }
    }

}


