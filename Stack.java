import java.util.EmptyStackException;

public class Stack {
    /**
     * This is because the stack maintains obsolete references to these objects. An
     * obsolete reference is simply a reference that will never be dereferenced
     * again. In this case, any references outside of the “active portion” of the
     * element array are obsolete. The active portion consists of the elements whose
     * index is less than size. Memory leaks in garbage-collected languages (more
     * properly known as unintentional object retentions) are insidious. If an
     * object reference is unintentionally retained, not only is that object
     * excluded from garbage collection, but so too are any objects referenced by
     * that object, and so on.
     */
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    // Memory leak during a pop operation
    // public Object pop() {
    // if (size == 0)
    // throw new EmptyStackException();
    // return elements[--size];
    // }

    // Remove memory leak
    public Object pop() {
        if(size == 0)
            throw new EmptyStackException()
        Object temp = elements[--size];
        elements[--size] = null; // Eliminate Obsolete Reference
        return temp;
    }

    /**
     * Ensure space for at least one more element, roughly doubling the capacity
     * each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
