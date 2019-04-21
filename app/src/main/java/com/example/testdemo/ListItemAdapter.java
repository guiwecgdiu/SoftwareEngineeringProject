package com.example.focusassistant;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemAdapter extends ArrayAdapter<ListItem> {


   public ListItemAdapter(Activity context, ArrayList<ListItem> ListItems){
       super(context,0,ListItems);
   }



    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
            View itemView=convertView;
            if(itemView==null){
                itemView= LayoutInflater.from(getContext()).inflate(R.layout.listitem_view,parent,false);
            }

            ListItem listItem=getItem(position);
        TextView tx=itemView.findViewById(R.id.textView);
        ImageView imageView=itemView.findViewById(R.id.imageView);
        tx.setText(listItem.getWord1());
        imageView.setImageResource(listItem.imageViewid);
        return  itemView;

    }
}
