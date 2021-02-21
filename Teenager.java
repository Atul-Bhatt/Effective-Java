public class Teenager {
    public static void main(String[] args) {
        new RoomCleaner(88);
        System.out.println("Peace Out.");
        // Without System.gc it won't clean the room.
        System.gc();
    }
}
