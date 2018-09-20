package com.example.jeff.ec463swmp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DataSelectActvity extends AppCompatActivity {
    public static final String RoomNum = "room number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_select_actvity);
    }

    public void showTemp(View view) {
        Intent intent = new Intent(this, PlotTempActivity.class);
        int room = getIntent().getIntExtra(RoomSelectionActivity.RoomNum, 0);
        intent.putExtra(RoomNum, room);
        startActivity(intent);
    }

    public void showHumidity(View view) {
        Intent intent = new Intent(this, PlotHumActivity.class);
        int room = getIntent().getIntExtra(RoomSelectionActivity.RoomNum, 0);
        intent.putExtra(RoomNum, room);
        startActivity(intent);
    }
}
