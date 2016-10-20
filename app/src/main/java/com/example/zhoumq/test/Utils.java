package com.example.zhoumq.test;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
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
        final Snackbar mSnackbar = Snackbar.make(v,snackbarStr,Snackbar.LENGTH_LONG);
                mSnackbar.setAction("删除", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mSnackbar.dismiss();
                    }
                })
                .show();
    }

    public enum NETWORK_TYPE{
        WIFI,MOBILE
    }

    public static boolean isNetworkAvailable(Context context) {
        boolean isNet = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if( null != connectivityManager){
            NetworkInfo mNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if( null != mNetworkInfo && mNetworkInfo .isConnected()){
                if( mNetworkInfo.getState() == NetworkInfo.State.CONNECTED){
                    isNet = true;
                }
            }
        }
        return isNet;
    }

    public static String isNetFor(Context context){
        String isNet = "";
        if(!isNetworkAvailable(context)) return context.getString(R.string.nonetwork);
        ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
        if(mNetworkInfo.getType() == ConnectivityManager.TYPE_WIFI){
            isNet = context.getString(R.string.wifi);
        }else if( mNetworkInfo.getType() == ConnectivityManager.TYPE_MOBILE){
            isNet = context.getString(R.string.mobile);
        }
        if(App.DEBUG) System.out.println(isNet);
        return isNet;
    }


}
