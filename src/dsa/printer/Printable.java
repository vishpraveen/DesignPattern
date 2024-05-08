package dsa.printer;

@FunctionalInterface
public interface Printable<T> {
    void printNode(T node);
}
