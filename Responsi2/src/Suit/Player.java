package Suit;

abstract class Player {
    private String name;
    private String hand;

    public Player(String name) {
        this.name = name;
    }

    public abstract void chooseHand();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }
}