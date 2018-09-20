package com.example.jeff.ec463swmp1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.example.jeff.ec463swmp1.DataSelectActvity;
import com.example.jeff.ec463swmp1.R;
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

public class PlotHumActivity extends AppCompatActivity {

    LineChart chart;
    FirebaseFirestore db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        chart = (LineChart) findViewById(R.id.linechart);

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

    }

    private void ReadRoom0() {
        DocumentReference user = db.collection("rooms").document("room0")
                .collection("climate").document("hum0");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);

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
                .collection("climate").document("hum1");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);
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
                .collection("climate").document("hum2");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);
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
                .collection("climate").document("hum3");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);

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
                .collection("climate").document("hum4");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);
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
                .collection("climate").document("hum5");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);
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
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);

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
                .collection("climate").document("hum7");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);
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
                .collection("climate").document("hum8");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);

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
                .collection("climate").document("hum9");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);

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
                .collection("climate").document("hum10");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    ArrayList<Entry> TempMain = new ArrayList<>();

                    String val = doc.get("00:00").toString();
                    float f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),0));
                    val = doc.get("01:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),1));
                    val = doc.get("02:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),2));
                    val = doc.get("03:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),3));
                    val = doc.get("04:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),4));
                    val = doc.get("05:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),5));
                    val = doc.get("06:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),6));
                    val = doc.get("07:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),7));
                    val = doc.get("08:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),8));
                    val = doc.get("09:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),9));
                    val = doc.get("10:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),10));
                    val = doc.get("11:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),11));
                    val = doc.get("12:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),12));
                    val = doc.get("13:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),13));
                    val = doc.get("14:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),14));
                    val = doc.get("15:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),15));
                    val = doc.get("16:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),16));
                    val = doc.get("17:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),17));
                    val = doc.get("18:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),18));
                    val = doc.get("19:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),19));
                    val = doc.get("20:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),20));
                    val = doc.get("21:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),21));
                    val = doc.get("22:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),22));
                    val = doc.get("23:00").toString();
                    f = Float.parseFloat(val);
                    TempMain.add(new Entry((f),23));


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
                    time.add("24:00");

                    chart.setData(new LineData(time,lDs));

                    chart.invalidate();

                    chart.setTouchEnabled(true);
                    chart.setDragEnabled(true);
                    chart.setScaleEnabled(true);
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
