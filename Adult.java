public class Adult {
    public static void main(String[] args) {
        try (RoomCleaner myRoom = new RoomCleaner(7)) {
            System.out.println("Goodbye");
        }
    }
}
