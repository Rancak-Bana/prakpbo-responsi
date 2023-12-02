package Suit;

import java.util.Scanner;

class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public void chooseHand() {
        Scanner scan = new Scanner(System.in);
        String input;

        do {
            System.out.print("Pilih opsi (Gunting/Batu/Kertas): ");
            input = scan.nextLine();
            if(!input.equalsIgnoreCase("gunting") &&
                    !input.equalsIgnoreCase("batu") &&
                    !input.equalsIgnoreCase("kertas")) {
                System.out.println("Pilihan tidak valid, Coba lagi.");
            }
        } while(!input.equalsIgnoreCase("gunting") &&
                !input.equalsIgnoreCase("batu") &&
                !input.equalsIgnoreCase("kertas"));

        if(input.equalsIgnoreCase("gunting")) {
            this.setHand("Gunting");
        } else if(input.equalsIgnoreCase("batu")) {
            this.setHand("Batu");
        } else {
            this.setHand("Kertas");
        }

        System.out.println(this.getName() + " memilih " + this.getHand());
    }

}