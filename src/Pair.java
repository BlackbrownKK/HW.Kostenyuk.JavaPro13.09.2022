public class Pair<T, C> {
    private final T left;
    public final C right;


    public Pair(T left, C right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public C getRight() {
        return right;
    }
}

