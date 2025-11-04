import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {
    private List<E> list;

    public ListSortable() {
        list = new ArrayList<>();
    }

    public void add(E item) {
        list.add(item);
    }

    public void print() {
        Collections.sort(list);
        for (E item : list) {
            System.out.println(item);
        }
    }
}
