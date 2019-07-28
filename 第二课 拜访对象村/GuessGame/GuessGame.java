public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isright = true;
            }
            if (guessp2 == targetNumber) {
                p2isright = true;
            }
            if (guessp3 == targetNumber) {
                p3isright = true;
            }

            if (p1isright || p2isright || p3isright) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isright);
                System.out.println("Player two got it right? " + p2isright);
                System.out.println("Player three got it right " + p3isright);
                System.out.println("Game is over!");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}