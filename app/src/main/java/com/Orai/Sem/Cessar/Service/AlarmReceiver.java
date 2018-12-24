package com.Orai.Sem.Cessar.Service;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class AlarmReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context arg0, Intent arg1) {
        // For our recurring task, we'll just display a message


        int tempoT = arg1.getIntExtra("tempo", 1);

        tempoT--;

        Toast.makeText(arg0, "I'm running", Toast.LENGTH_SHORT).show();

    }

}
