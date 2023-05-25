package lesson_09.alCustom;

public class MyCollectionImpl implements Collection {
    private String[] array;
    private int size;
    private int capacity;

    public MyCollectionImpl() {
        capacity = 5;
        array = new String[capacity];
        size = 0;

    }

    @Override
    public boolean add(String value) {
        return add(size, value);

    }

    @Override
    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;

        }
        if (size == capacity) {
            capacity *= 2;
            String[] newArray = new String[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = value;
        size++;
        return true;
    }

    @Override
    public boolean delete(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;

                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public boolean contain(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        return false;
    }

    @Override
    public boolean clear() {
        array = new String[capacity];
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }
}
