import java.lang.ref.Cleaner;

// An autocloaseable class using a cleaner as a safety net
public class RoomCleaner implements AutoCloseable {
    private static final Cleaner cleaner = Cleaner.create();

    // Resource that requires cleaning. Must not refer to RoomCleaner!
    private static class State implements Runnable {
        int numJunkPiles; // NUmber of junk piles in this Room

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        // Invoked by close method or cleaner
        @Override
        public void run() {
            System.out.println("Cleaning room");
            numJunkPiles = 0;
        }
    }

    // The state of this room, shared with our cleanable
    private final State state;

    // our Cleanable. Cleans the room when it's eligible for gc
    private final Cleaner.Cleanable cleanable;

    public RoomCleaner(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() {
        cleanable.clean();
    }
}
