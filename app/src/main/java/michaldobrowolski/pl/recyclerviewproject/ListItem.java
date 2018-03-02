package michaldobrowolski.pl.recyclerviewproject;

/**
 * Created by c0dexter on 02.03.18.
 */
// COMPLETED: Step #7: Add a class for manipulating the list_item on the view
public class ListItem {
    private String head;
    private String description;

    // COMPLETED: Step #8: Create a class constructor
    public ListItem(String head, String description) {
        this.head = head;
        this.description = description;
    }

    // COMPLETED: Step #9: Create getters
    public String getHead() {
        return head;
    }

    public String getDescription() {
        return description;
    }
}
