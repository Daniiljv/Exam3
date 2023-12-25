package firstTask;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<String> allInventory = new ArrayList<>();

    public Inventory() {
    }

    public void addIntoInventory(String nameOfProduct){
        allInventory.add(nameOfProduct);
    }

    public void deleteFromInventory(String nameOfProduct){
        allInventory.remove(nameOfProduct);
    }

    public boolean checkProductInInventory(String nameOfProduct){
        return allInventory.contains(nameOfProduct);
    }

    public ArrayList<String> getAllInventory() {
        return allInventory;
    }
}
