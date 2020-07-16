package design.Constants;

public enum Attractions {

    LIGHT_DRINK("LightDrink", 3),
    MEDIUM_DRINK("MediumDrink", 5),
    HEAVY_DRINK("HeavyDrink", 7),
    ALCOHOLFREE_DRINK("AlcoholfreeDrink", 2),
    LIGHT_MEAL("LightMeal", 6),
    LIGHT_VEGAN_MEAL("LightVeganMeal", 7),
    BIG_MEAL("BigMeal", 9),
    BIG_VEGAN_MEAL("BigVeganMeal", 10),
    DARTS("Darts", 3),
    FUSSBALL("Fussball", 4),
    MINI_GOLF("MiniGolf", 4),
    MINI_POOL("MiniPool", 3),
    DANCEFLOOR_ACCESS("DancefloorAccess", 1),
    TAXI("Taxi", 6);


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
