package com.example.jeff.ec463swmp1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class PlotTempActivity extends AppCompatActivity {

    LineChart chart;
    FirebaseFirestore db;
    ArrayList<Entry> TempMain = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int room = getIntent().getIntExtra(DataSelectActvity.RoomNum, 0);
        db = FirebaseFirestore.getInstance();

        switch(room) {
            case 0:
                ReadRoom0();
                break;
            case 1:
                ReadRoom1();
                break;
            case 2:
                ReadRoom2();
                break;
            case 3:
                ReadRoom3();
                break;
            case 4:
                ReadRoom4();
                break;
            case 5:
                ReadRoom5();
                break;
            case 6:
                ReadRoom6();
                break;
            case 7:
                ReadRoom7();
                break;
            case 8:
                ReadRoom8();
                break;
            case 9:
                ReadRoom9();
                break;
            case 10:
                ReadRoom10();
                break;
        }

        chart = (LineChart) findViewById(R.id.linechart);

        LineDataSet lDs = new LineDataSet(TempMain,"Temperature");
        lDs.setColor(Color.BLUE);

        ArrayList<String> time = new ArrayList<>();
        time.add("0:00");
        time.add("1:00");
        time.add("2:00");
        time.add("3:00");
        time.add("4:00");
        time.add("5:00");
        time.add("6:00");
        time.add("7:00");
        time.add("8:00");
        time.add("9:00");
        time.add("10:00");
        time.add("11:00");
        time.add("13:00");
        time.add("14:00");
        time.add("15:00");
        time.add("16:00");
        time.add("17:00");
        time.add("18:00");
        time.add("19:00");
        time.add("20:00");
        time.add("21:00");
        time.add("22:00");
        time.add("23:00");

        chart.setData(new LineData(time,lDs));

        chart.setTouchEnabled(true);
        chart.setDragEnabled(true);
        chart.setScaleEnabled(true);
    }

    private void ReadRoom0() {
        DocumentReference user = db.collection("rooms").document("room0")
                .collection("climate").document("temp0");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    private void ReadRoom1() {
        DocumentReference user = db.collection("rooms").document("room1")
                .collection("climate").document("temp1");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    private void ReadRoom2() {
        DocumentReference user = db.collection("rooms").document("room2")
                .collection("climate").document("temp2");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    private void ReadRoom3() {
        DocumentReference user = db.collection("rooms").document("room3")
                .collection("climate").document("temp3");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    private void ReadRoom4() {
        DocumentReference user = db.collection("rooms").document("room4")
                .collection("climate").document("temp4");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    private void ReadRoom5() {
        DocumentReference user = db.collection("rooms").document("room5")
                .collection("climate").document("temp5");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    private void ReadRoom6() {
        DocumentReference user = db.collection("rooms").document("room6")
                .collection("climate").document("hum6");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    private void ReadRoom7() {
        DocumentReference user = db.collection("rooms").document("room7")
                .collection("climate").document("temp7");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    private void ReadRoom8() {
        DocumentReference user = db.collection("rooms").document("room8")
                .collection("climate").document("temp8");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    private void ReadRoom9() {
        DocumentReference user = db.collection("rooms").document("room9")
                .collection("climate").document("temp9");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    private void ReadRoom10() {
        DocumentReference user = db.collection("rooms").document("room10")
                .collection("climate").document("temp10");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> Temp = new ArrayList<>();

                    Temp.add(new Entry((float)(doc.get("00:00")),0));
                    Temp.add(new Entry((float)(doc.get("01:00")),1));
                    Temp.add(new Entry((float)(doc.get("02:00")),2));
                    Temp.add(new Entry((float)(doc.get("03:00")),3));
                    Temp.add(new Entry((float)(doc.get("04:00")),4));
                    Temp.add(new Entry((float)(doc.get("05:00")),5));
                    Temp.add(new Entry((float)(doc.get("06:00")),6));
                    Temp.add(new Entry((float)(doc.get("07:00")),7));
                    Temp.add(new Entry((float)(doc.get("08:00")),8));
                    Temp.add(new Entry((float)(doc.get("09:00")),9));
                    Temp.add(new Entry((float)(doc.get("10:00")),10));
                    Temp.add(new Entry((float)(doc.get("11:00")),11));
                    Temp.add(new Entry((float)(doc.get("12:00")),12));
                    Temp.add(new Entry((float)(doc.get("13:00")),13));
                    Temp.add(new Entry((float)(doc.get("14:00")),14));
                    Temp.add(new Entry((float)(doc.get("15:00")),15));
                    Temp.add(new Entry((float)(doc.get("16:00")),16));
                    Temp.add(new Entry((float)(doc.get("17:00")),17));
                    Temp.add(new Entry((float)(doc.get("18:00")),18));
                    Temp.add(new Entry((float)(doc.get("19:00")),19));
                    Temp.add(new Entry((float)(doc.get("20:00")),20));
                    Temp.add(new Entry((float)(doc.get("21:00")),21));
                    Temp.add(new Entry((float)(doc.get("22:00")),22));
                    Temp.add(new Entry((float)(doc.get("23:00")),23));
                    TempMain = Temp;
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }

}
