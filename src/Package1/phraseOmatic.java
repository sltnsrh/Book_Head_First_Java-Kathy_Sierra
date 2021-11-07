package Package1;

public class phraseOmatic {
    public static void main (String[] args) {
        String[] wordListOne = {"24/7", "multi-Tiered", "30000 foot", "B-to-B", "win-win", "smart", "front-end", "web-based", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value_added", "oriented", "centric", "disturbed", "focused", "branded", "aligned", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String ourPhrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + ourPhrase);

    }
}
