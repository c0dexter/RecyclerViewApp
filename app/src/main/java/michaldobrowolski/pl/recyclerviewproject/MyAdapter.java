package michaldobrowolski.pl.recyclerviewproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


// COMPLETED: Step #10: Create an * Adapter * class
// COMPLETED: Step #11: Extend this class by using a * ViewHolder *
// COMPLETED: Step #12: As generic type enter <MyAdapter.ViewHolder> because MyAdapter will contain a ViewHolder class

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    //COMPLETED: Step #19: Use a model class (ListItem) for getting data to "bind data action"
    private List<ListItem> listItems;
    private Context context;

    //COMPLETED: Step #20: make constructor for List and Context objects (Alt+Instert -> Constructor)
    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    // COMPLETED: Step #15: Implement methods for adapter (Alt+Enter)
    // (1) This method will be call when the instance of ViewHolder class is creating
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //return null; -> Here we need to return a ViewHolder object
        // COMPLETED: Step #16: Create a View object and inflate the layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    // (2) This method will be calling after executing method onCreateViewHolder,
    // data will be bind and and sent to the ViewHolder instance. Next we will displaying data
    // on the RecyclerView
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //COMPLETED: Step #21: Inside this we need get the current List object bu using the [get(position)] of list
        ListItem listItem = listItems.get(position);
        //COMPLETED: Step #22: By using [holder] object get the HEAD and DESCRIPTION data and set value into a proper textView
        holder.textViewHead.setText(listItem.getHead());
        holder.textViewDescription.setText(listItem.getDescription());
    }

    // (3) This means that instance of this class is created
    @Override
    public int getItemCount() {
        //COMPLETED: Step #21: Here we have to return size of list "List<ListItem> listItems"
        return listItems.size();
    }

    // COMPLETED: Step #13: Extend this class by using a RecyclerView.ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {

        // COMPLETED: Step #17: Define a view objects (form list_item.xml) into ViewHolder
        public TextView textViewHead;
        public TextView textViewDescription;


        // COMPLETED: Step #14: Create a constructor matching super
        public ViewHolder(View itemView) {
            super(itemView);

            //COMPLETED: Step #18: Make mapping fields by using the [itemView]
            textViewHead = (TextView) itemView.findViewById(R.id.textViewHeader);
            textViewDescription = (TextView) itemView.findViewById(R.id.textViewDescription);

        }
    }


}
