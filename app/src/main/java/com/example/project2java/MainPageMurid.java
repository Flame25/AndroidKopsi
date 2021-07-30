package com.example.project2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
/*
import org.naishadhparmar.zcustomcalendar.CustomCalendar;
import org.naishadhparmar.zcustomcalendar.OnDateSelectedListener;
import org.naishadhparmar.zcustomcalendar.Property;
*/
import java.util.Calendar;
import java.util.HashMap;

public class MainPageMurid extends AppCompatActivity {

    //CustomCalendar customCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_murid);
/*
        customCalendar = findViewById(R.id.custom_calendar);
        
        //Default Settings
        HashMap<Object, Property> descHashMap = new HashMap<>();
        Property defaultProperty = new Property();
        defaultProperty.layoutResource = R.layout.default_calendar_view;
        defaultProperty.dateTextViewResource = R.id.tv_calendar;
        descHashMap.put("default", defaultProperty);

        //Current Date
        Property currentProps = new Property();
        currentProps.layoutResource = R.layout.current_calendar_layout;
        currentProps.dateTextViewResource = R.id.tv_calendar;
        descHashMap.put("current", currentProps);

        //For Present Date
        Property presentProps = new Property();
        presentProps.layoutResource = R.layout.present_calendar_view;
        presentProps.dateTextViewResource = R.id.tv_calendar;
        descHashMap.put("present", presentProps);

        //For Absent
        Property absentProps = new Property();
        absentProps.layoutResource = R.layout.absent_calendar_view;
        absentProps.dateTextViewResource = R.id.tv_calendar;
        descHashMap.put("absent", absentProps);

        customCalendar.setMapDescToProp(descHashMap);
        HashMap<Integer,Object> dateHashMap = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        dateHashMap.put(calendar.get(Calendar.DAY_OF_MONTH),"current");
        dateHashMap.put(1,"present");
        dateHashMap.put(2,"absent");
        dateHashMap.put(3,"present");
        dateHashMap.put(4,"default");
        customCalendar.setDate(calendar,dateHashMap);
        customCalendar.setOnDateSelectedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(View view, Calendar selectedDate, Object desc) {
                String sDate = selectedDate.get(Calendar.DAY_OF_MONTH) + "/" + (selectedDate.get(Calendar.MONTH) + 1) + "/" + selectedDate.get(Calendar.YEAR);

                Toast.makeText(getApplicationContext(),sDate, Toast.LENGTH_SHORT).show();

            }
        }); */


    }
}