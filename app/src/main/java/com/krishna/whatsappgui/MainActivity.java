package com.krishna.whatsappgui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    AdapterChat adapterChat;

    String[] name = {"Bhagesh Bhosle","Sarvesh Kadlag","Jayesh Bhadane","Riddhesh G","Mahesh Thakre","Ullas Rathod","Chinamy","Chetan Jadhav","Siddu "};

    int[] imgs = {R.drawable.vedant,R.drawable.i2,R.drawable.sarvesh1,R.drawable.ascii,R.drawable.i5,R.drawable.uk,R.drawable.i7,R.drawable.i3,R.drawable.vedant};

    String[] msg = {"Hello","Good Morning","how are you","Nice ","Good night","Cool","Good Job","Kuthe aahes","Yalii Eddi"};

    String[] time = {"12:01 pm","10:15 am","02 :30 pm","5:45 pm","yesterday","9:30 pm","7:40 pm","9:00 pm","7:34 pm"};

    int[] tiks = {R.drawable.d2,R.drawable.dbl2,R.drawable.single,R.drawable.dbl2,R.drawable.single,R.drawable.dbl2,R.drawable.single,R.drawable.d2,R.drawable.dbl2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapterChat = new AdapterChat(MainActivity.this,name,imgs,msg,time,tiks);

        listView = findViewById(R.id.listview);

        listView.setAdapter(adapterChat);






    }
}