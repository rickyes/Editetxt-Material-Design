package com.example.zhoumq.test;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText mEdtUser,mEdtPwd;
    private FireworkView mFireworkView,fireworkView_pwd;
    private RelativeLayout layout;
    private TextView day;
    private TextView night;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Utils.showToast(this,Utils.isNetFor(this));

    }

    private void initView() {

        fab = (FloatingActionButton) findViewById(R.id.btnFloatingAction);
        layout = (RelativeLayout) findViewById(R.id.main_layout);
        day = (TextView)findViewById(R.id.day);
        night = (TextView) findViewById(R.id.night);

        night.setOnClickListener(this);
        day.setOnClickListener(this);
        fab.setOnClickListener(this);

        mEdtUser = (EditText) findViewById(R.id.edt_user);
        mEdtPwd = (EditText) findViewById(R.id.edt_pwd);
        mFireworkView = (FireworkView) findViewById(R.id.fire_work);
        fireworkView_pwd = (FireworkView) findViewById(R.id.fire_work_pwd);

        mFireworkView.bindEditText(mEdtUser);
        fireworkView_pwd.bindEditText(mEdtPwd);
    }

        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.day:
                    layout.setBackgroundColor(0xFFFFFFFF);
                    break;
                case R.id.night:
                    layout.setBackgroundColor(0xFF000000);
                    break;
                case R.id.btnFloatingAction:
                    Utils.showSnackbar(v,getString(R.string.logining));
                    break;
            }
        }
}
