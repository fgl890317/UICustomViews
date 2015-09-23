package com.example.administrator.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/8/28.
 */
public class TitleLayout extends LinearLayout implements View.OnClickListener {
    public TitleLayout(Context context,AttributeSet attris){
        super(context, attris);
        LayoutInflater.from(context).inflate(R.layout.title, this);
       findViewById(R.id.title_back).setOnClickListener(this);
        findViewById(R.id.title_edit).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.title_back:
                ((Activity)getContext()).finish();
            case  R.id.title_edit:
                Toast.makeText(getContext(),"You clicked Edit button",Toast.LENGTH_SHORT).show();

        }
    }
}
