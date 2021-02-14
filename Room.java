public class Room {
    String name;
    int numberOfDoors;
    String paintColor;
    int numberOfBulbs;
    boolean TV;

    // Builder Pattern
    public static class Builder {
        // Required Parameters
        String name;
        int numberOfDoors;
        String paintColor;

        // Optional Parameters
        int numberOfBulbs = 0;
        boolean TV = false;

        public Builder(String name, int numberOfDoors, String paintColor) {
            this.name = name;
            this.numberOfDoors = numberOfDoors;
            this.paintColor = paintColor;
        }

        public Builder numberOfBulbs(int numberOfBulbs) {
            this.numberOfBulbs = numberOfBulbs;
            return (this);
        }

        public Builder TV(boolean TV) {
            this.TV = TV;
            return (this);
        }

        public Room build() {
            return (new Room(this));
        }
    }

    private Room(Builder builder) {
        this.name = builder.name;
        this.numberOfDoors = builder.numberOfDoors;
        this.paintColor = builder.paintColor;
        this.numberOfBulbs = builder.numberOfBulbs;
        this.TV = builder.TV;
    }

    public void displayRoomInfo() {
        System.out.printf(" %s\n Number Of Doors: %d\n Room Paint: %s\n Number Of Bulbs: %d\n TV: %B\n\n", this.name,
                this.numberOfDoors, this.paintColor, this.numberOfBulbs, this.TV);
    }
}
