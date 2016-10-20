package com.example.zhoumq.test;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

/**
 * Created by zhoumq on 16-10-20.
 */

public class Utils {

    public static void showToast(Context context,String toastStr){
        Toast.makeText(context,toastStr,Toast.LENGTH_LONG).show();
    }

    public static void showSnackbar(View v, String snackbarStr){
        Snackbar.make(v,snackbarStr,Snackbar.LENGTH_LONG).show();
    }


}
