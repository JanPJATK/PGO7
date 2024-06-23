import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}

public class item {
    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "Laptop"));
        itemList.add(new Item(2, "Smartphone"));
        itemList.add(new Item(3, "Tablet"));
        itemList.add(new Item(4, "Smartwatch"));
        itemList.add(new Item(5, "Camera"));


        for (int i = 0; i < itemList.size(); i++) {
            itemList.get(i).show();
        }


        Map<Integer, String> itemMap = new HashMap<>();
        for (Item item : itemList) {
            itemMap.put(item.getId(), item.getName());
        }


        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
