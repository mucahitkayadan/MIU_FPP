package homeworks;

import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int size;

    public MyPersonList() {
        currentArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    public void add(Person person) {
        if (person == null) return;

        if (size == currentArray.length) resize();
        currentArray[size++] = person;
    }

    public Person get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        return currentArray[i];
    }

    public Person get(String lastName) {
        if (lastName.isBlank())
            return null;
        for (int i = 0; i < size; i++) {
            if (currentArray[i].getLast().equals(lastName))
                return currentArray[i];
        }
        return null;
    }

    private void resize() {
        System.out.println("resizing");
        int len = currentArray.length;
        int newLen = 2 * len;
        Person[] newArray = new Person[newLen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
    }

    public boolean find(Person person) {
        if (person == null) return false;
        for (Person test : currentArray) {
            if (test != null && test.equals(person))
                return true;
        }
        return false;
    }

    public void insert(Person person, int pos) {
        if (pos > size || pos < 0) return;
        if (pos == currentArray.length || size + 1 > currentArray.length) {
            resize();
        }
        Person[] temp = new Person[currentArray.length + 1];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = person;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - pos);
        currentArray = temp;
        ++size;
    }

    public boolean remove(Person person) {
        if (size == 0) return false;
        if (person == null) return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (currentArray[i] != null && currentArray[i].equals(person)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --size;
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[size - 1] + "]");
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object clone() {
        Person[] temp = Arrays.copyOf(currentArray, size);
        return temp;
    }

    public static void main(String[] args) {
        MyPersonList personList = new MyPersonList();
        personList.add(new Person("Doe", "John", 25));
        personList.add(new Person("Smith", "Alice", 30));
        personList.add(new Person("Johnson", "Robert", 35));
        personList.add(new Person("Brown", "Sarah", 40));
        personList.add(new Person("Davis", "Michael", 45));
        personList.insert(new Person("Johnson", "Olivia", 50), 2);
        System.out.println("Number of elements: " + personList.size());
        System.out.println("List of persons: " + personList);
    }
}

