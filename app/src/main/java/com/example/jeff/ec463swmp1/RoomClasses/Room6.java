package com.example.jeff.ec463swmp1.RoomClasses;

import android.content.Intent;

public class Room6 {
    public static final String RoomNum = "room number";

    Intent intent = new Intent(this, DataSelectActivity.class);
    intent.putExtra(RoomNum, 6);

    startActivity(intent);

}
