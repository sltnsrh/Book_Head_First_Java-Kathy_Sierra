package Chapter2;

class DrumKit {

    boolean snare = true;

    void playTopHat() {
        System.out.println("Ding ding ding di-ding");
    }

    void playSnare() {
        System.out.println("Boom boom boom bo-boom");
    }
}

class DrumsKitTestDrive {
    public static void main(String [] args) {

        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if(d.snare) {
            d.playSnare();
        }
    }
}








