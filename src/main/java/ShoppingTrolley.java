import java.util.ArrayList;

public class ShoppingTrolley {

    // Declare ArrayList variable
    private ArrayList<String> trolleyItems;

    // create empty list in constructor so that you start with an empty trolley
    public ShoppingTrolley() {
        this.trolleyItems = new ArrayList<>();
    }

    // method for adding items to trolley
    public void addItem(String item) {
        trolleyItems.add(item);
    }

    public ArrayList<String> getTrolleyItems() {
        return this.trolleyItems;
    }

    // method for getting number of items in the trolley
    public int getTrolleySize() {
        return this.trolleyItems.size();
    }

    // method for checking if item is in trolley
    public boolean itemIsInTrolley(String item) {
        for (String itemToCheck : this.trolleyItems) {
            if (item.equalsIgnoreCase(itemToCheck)) {
                return true;
            }
        }
        return false;
    }
}
