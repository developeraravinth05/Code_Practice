package Others;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass2 {

private final int id;
private final List<Integer> car;
private final String name;

    public int getId() {
        return id;
    }

    public List<Integer> getCar() {
        return new ArrayList<>(car);
    }

    public String getName() {
        return name;
    }

    public ImmutableClass2(int id, List<Integer> car, String name) {
        this.id = id;
        this.car = new ArrayList<>(car);
        this.name = name;
    }
}
