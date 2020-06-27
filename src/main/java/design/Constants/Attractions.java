package design.Constants;

public enum Attractions {

    LIGHT_DRINK("Light drink", 3),
    MEDIUM_DIRNK("Medium drunk", 5),
    HEAVY_DRINK("Heavy drink", 7),
    ALCOHOLFREE_DRINK("Alcoholfree drink", 2),
    LIGHT_MEAL("Light meal", 6),
    BIG_MEAL("Big meal", 9),
    DARTS("Darts", 3),
    FUSSBALL("Fussball", 4),
    MINI_GOLF("Mini golf", 11),
    DANCEFLOOR_ACCESS("Dancefloor access", 1);

    private String name;
    private int price;

    Attractions(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
