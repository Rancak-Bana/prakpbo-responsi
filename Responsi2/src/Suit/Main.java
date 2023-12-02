package Suit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("========== Permainan Suit ==========");
        System.out.print("Masukkan Nama: ");
        String namaPlayer = scan.nextLine();

        HumanPlayer player1 = new HumanPlayer(namaPlayer);
        ComputerPlayer player2 = new ComputerPlayer("Komputer");

        player1.chooseHand();
        player2.chooseHand();

        penentuan(player1, player2);
    }

    public static void penentuan(Player player1, Player player2) {
        System.out.println("\nHasil Permainan :");
        if(player1.getHand().equals(player2.getHand())) {
            System.out.println("Hasilnya seri!");
        } else if(player1.getHand().equals("Gunting") &&
                player2.getHand().equals("Kertas")) {
            System.out.println(player1.getName() + " menang! GGEZ!");
        } else if(player1.getHand().equals("Batu") &&
                player2.getHand().equals("Gunting")) {
            System.out.println(player1.getName() + " menang! GGEZ!");
        } else if(player1.getHand().equals("Kertas") &&
                player2.getHand().equals("Batu")) {
            System.out.println(player1.getName() + " menang! GGEZ!");
        } else {
            System.out.println("Komputer menang, Nice Try bro!");
        }


    }

}