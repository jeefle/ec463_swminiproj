package com.example.jeff.ec463swmp1.RoomClasses;

import android.content.Intent;

public class Room5 {
    public static final String RoomNum = "room number";

    Intent intent = new Intent(this, DataSelectActivity.class);
    intent.putExtra(RoomNum, 5);

    startActivity(intent);

}