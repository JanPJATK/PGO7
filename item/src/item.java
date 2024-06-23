import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Item{id=" + id + ", name='" + name + "'}";
    }
}

public class item {
    public static void main(String[] args) {
        // Tworzenie listy ArrayList i dodawanie obiektów klasy Item
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "Laptop"));
        itemList.add(new Item(2, "Smartphone"));
        itemList.add(new Item(3, "Tablet"));
        itemList.add(new Item(4, "Smartwatch"));
        itemList.add(new Item(5, "Camera"));
        itemList.add(new Item(6, "Headphones"));
        itemList.add(new Item(7, "Keyboard"));
        itemList.add(new Item(8, "Mouse"));
        itemList.add(new Item(9, "Monitor"));
        itemList.add(new Item(10, "Printer"));

        // Wyłuskiwanie pięciu pierwszych elementów z listy za pomocą metody subList()
        List<Item> firstFiveItems = itemList.subList(0, 5);

        // Tworzenie HashSet i dodawanie do niej pięciu pierwszych elementów z listy
        Set<Item> itemSet = new HashSet<>(firstFiveItems);

        // Wyświetlanie elementów w HashSet
        for (Item item : itemSet) {
            System.out.println(item);
        }
    }
}
