package Suit;

import java.util.Random;

class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);
        this.setHand("");
    }

    @Override
    public void chooseHand() {
        Random random = new Random();
        int pilihan = random.nextInt(3) + 1;

        if(pilihan == 1) {
            this.setHand("Gunting");
        } else if(pilihan == 2) {
            this.setHand("Batu");
        } else {
            this.setHand("Kertas");
        }

        System.out.println("Komputer memilih " + this.getHand());
    }

}
