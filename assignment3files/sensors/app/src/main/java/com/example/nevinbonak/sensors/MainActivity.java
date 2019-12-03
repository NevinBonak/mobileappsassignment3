package com.example.nevinbonak.sensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView)findViewById(R.id.text);
        SensorManager mgr = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors = mgr.getSensorList(Sensor.TYPE_ALL);

        StringBuilder message = new StringBuilder(2048);
        message.append("The Sensors on this device are: + \n");
        message.append("============================================ \n\n");
        for(Sensor sensor : sensors) {
            message.append(sensor.getName() + "\n");
            message.append(" TYPE: " + sensorTypes.get(sensor.getType()) + "\n");
            message.append(" Vendor: " + sensor.getVendor() + "\n");
            message.append(" Version:" + sensor.getVersion() + "\n");
            message.append(" Resolution:" + sensor.getResolution() + "\n");
            message.append(" Max Range: " + sensor.getMaximumRange() + "\n");
            message.append(" Power: " + sensor.getPower() + "\n");

        }



        text.setText(message);
    }

    private HashMap<Integer, String> sensorTypes = new HashMap<Integer, String>();

    {
        sensorTypes.put(Sensor.TYPE_ACCELEROMETER, "TYPE_ACCELEROMETER");
        sensorTypes.put(Sensor.TYPE_AMBIENT_TEMPERATURE, "TYPE_AMBIENT_TEMPERATURE");
        sensorTypes.put(Sensor.TYPE_GRAVITY, "TYPE_GRAVITY");
    }
}
