package com.example.tengf.studentlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    LinearLayout mLinearLayout;
    ScrollView mScrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = (LinearLayout) findViewById(R.id.linear_layout);
        mScrollView = (ScrollView) findViewById(R.id.activity_main);
        addViews(R.layout.item, 30, mLinearLayout);

    }
    private void addViews(@LayoutRes int res, int count, ViewGroup parent) {
        for (int i = 0; i < count; i++) {
            View view = View.inflate(this, res, null);

            TextView textView = (TextView) view.findViewById(R.id.tv);
            textView.setText(String.valueOf("学生"+i+"    年级：大一"));
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this,RvActivity.class));
                }
            });
            parent.addView(view);
        }
    }

}


