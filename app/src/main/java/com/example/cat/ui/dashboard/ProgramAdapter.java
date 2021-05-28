package com.example.cat.ui.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.cat.R;

import java.util.Collections;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class ProgramAdapter extends ArrayAdapter<String> {

    Context context;
    int[] images;
    String[] dashName;
    String[] dashDescription;
    public ProgramAdapter(Context context, String[] dashName, int[] images, String[] dashDescription) {
        super(context, R.layout.single_item, R.id.textView1, dashName);
        this.context = context;
        this.dashName = dashName;
        this.images = images;
        this.dashDescription = dashDescription;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View singleItem = convertView;
        DashViewHolder holder = null;

        if(singleItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.single_item, parent, false);
            holder = new DashViewHolder(singleItem);
            singleItem.setTag(holder);
        }
        else {
            holder = (DashViewHolder) singleItem.getTag();
        }
        holder.itemImage.setImageResource(images[position]);
        holder.dashTitle.setText(dashName[position]);
        holder.dashDescription.setText(dashDescription[position]);
        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You Clicked: "+dashName[position], Toast.LENGTH_SHORT);
            }
        });

        return singleItem;
    }
}
