package com.example.jeff.ec463swmp1.RoomClasses;

import android.content.Intent;

public class Room8 {
    public static final String RoomNum = "room number";

    Intent intent = new Intent(this, DataSelectActivity.class);
    intent.putExtra(RoomNum, 9);

    startActivity(intent);

}
