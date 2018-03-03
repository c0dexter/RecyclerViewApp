package michaldobrowolski.pl.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //COMPLETED: Step #23: Define RecyclerView object
    private RecyclerView recyclerView;
    //COMPLETED: Step #24: Define Adapter object
    private RecyclerView.Adapter adapter;
    //COMPLETED: Step #28: Define List
    private List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //COMPLETED: Step #25: Go to the activity_main.xml and use the ID of the RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        //COMPLETED: Step #26: Decide if every element in RecycleView should have the same size
        recyclerView.setHasFixedSize(true);
        //COMPLETED: Step #27: Set the layout manager with a context as a parameter
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //COMPLETED: Step #29: Initialize [listItems (#28)]. Here will be contained all data which will be displayed on RecyclerView
        listItems = new ArrayList<>();
        //COMPLETED: Step #30: Add dummy data to listItems, in the future a specific data will be parsed from API
        for (int i = 0; i < 10; i++) {
            ListItem listItem = new ListItem(
                    getString(R.string.dummy_data_heading) + (i + 1),
                    getString(R.string.dummy_data_desc)
            );
            listItems.add(listItem); //Add the dummy listItem to the listItems
        }

        //COMPLETED: Step #31: initialize the adapter with [listItems] and [context] as parameters
        adapter = new MyAdapter(listItems, this);
        //COMPLETED: Step #32: Set the adapter to the RecyclerView
        recyclerView.setAdapter(adapter);


    }
}
