package com.example.cat.ui.dashboard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cat.R;

public class DashViewHolder {
    ImageView itemImage;
    TextView dashTitle;
    TextView dashDescription;

    DashViewHolder(View v){
        itemImage = v.findViewById(R.id.imageView);
        dashTitle = v.findViewById(R.id.textView1);
        dashDescription = v.findViewById(R.id.textView2);
    }


}
