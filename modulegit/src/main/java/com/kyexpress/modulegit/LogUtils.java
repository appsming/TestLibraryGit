package com.kyexpress.modulegit;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class LogUtils {

    public static  void log(String msg){
        Log.i("TSA","======"+msg);
    }

    public static  void show(Context context, String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
