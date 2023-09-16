package Homework.HW10.pair;

public class Pair<T> {
    private T one;
    private T two;

    public Pair(T one, T two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public T getTwo() {
        return two;
    }

    void swap() {
        T temp = one;
        one = two;
        two = temp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "one=" + one +
                ", two=" + two +
                '}';
    }

    void replaceFirst(T newElement) {
        one = newElement;
    }

    void replaceSecond(T newElement) {
        two = newElement;
    }
}
