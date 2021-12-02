package Package1;

public class DVDplayer {
    boolean canRecord = false;

    void playDVD() {
        System.out.println("DVD is playing");
    }

    void recordDVD() {
        System.out.println("Its DVD recording");
    }
}

class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDplayer d = new DVDplayer();
        d.canRecord = true;
        d.playDVD();

        if(d.canRecord) {
            d.recordDVD();
        }
    }
}
