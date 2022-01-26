package homeWork3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> arrayList = new ArrayList<T>();

    public Box() {
    }

    public List<T> getArrayList() {
        return arrayList;
    }

    public boolean addFruit(T fruit) {
        return arrayList.add(fruit);
    }

    public T deleteFruit() {
        if (arrayList.isEmpty()) {
            System.out.println("Box is empty");
            return null;
        }
        return arrayList.remove(arrayList.size() - 1);
    }

    public float getWeight() {
        float weight = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            weight += arrayList.get(i).getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public boolean putIntoAnother(Box<T> another) {
        another.arrayList.addAll(arrayList);
        arrayList.clear();
        return true;
    }

}


