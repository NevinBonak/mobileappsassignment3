package com.murach.tester;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class TesterService extends Service{

    private Timer timer;

    @Override
    public void onCreate() {
        Log.d("Test Service", "Service Created");
        //startTimer();
    }

    private void startTimer() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Log.d("Test Service", "Timer Task Executed");
            }
        };

        timer = new Timer(true);
        int delay = 1000 * 10; //10 seconds
        int interval = 1000 * 10; //10 seconds
        timer.schedule(task, delay, interval);

    }

    private void stopTimer(){
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("Test Service", "Service Started");
        //Log.d("Test Service", "Task Completed");
        //stopSelf();
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("Test Service", "Service Bound");
        return null;
    }

    @Override
    public void onDestroy() {
        Log.d("Test Service", "Service Ended");
        //stopTimer();
    }
}
