package com.example.zhoumq.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEdtUser,mEdtPwd;
    private FireworkView mFireworkView,fireworkView_pwd;
    private RelativeLayout layout;
    private TextView day;
    private TextView night;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        layout = (RelativeLayout) findViewById(R.id.main_layout);
        day = (TextView)findViewById(R.id.day);
        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(0xFFFFFFFF);
            }
        });
        night = (TextView) findViewById(R.id.night);
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(0xFF000000);
            }
        });

        mEdtUser = (EditText) findViewById(R.id.edt_user);
        mEdtPwd = (EditText) findViewById(R.id.edt_pwd);
        mFireworkView = (FireworkView) findViewById(R.id.fire_work);
        fireworkView_pwd = (FireworkView) findViewById(R.id.fire_work_pwd);
        mFireworkView.bindEditText(mEdtUser);
        fireworkView_pwd.bindEditText(mEdtPwd);
    }
}
