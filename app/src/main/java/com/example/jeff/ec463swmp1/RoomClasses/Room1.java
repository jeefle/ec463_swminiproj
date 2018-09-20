package com.example.jeff.ec463swmp1.RoomClasses;

import android.content.Intent;

public class Room1 {
    public static final String RoomNum = "room number";

    Intent intent = new Intent(this, DataSelectActivity.class);
    intent.putExtra(RoomNum, 1);

    startActivity(intent);

}
