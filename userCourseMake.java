package com.example.pre;

import androidx.appcompat.app.AppCompatActivity;
import java.io.OutputStream;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.EditText;
import android.view.SurfaceView;
import android.content.Intent;

public class userCourseMake extends AppCompatActivity {

    Button goToMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_course_make);
        goToMain = (Button)findViewById(R.id.goToMain);

        goToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userCourseMake.this, MainActivity.class);
                startActivity(intent);
            }
        });
        final ArrayList<String> midList = new ArrayList<String>();
        ListView list = (ListView) findViewById(R.id.courseListView);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, midList);
        list.setAdapter(adapter);

        final EditText editItem = (EditText) findViewById(R.id.editItem);
        Button addButton = (Button) findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            midList.add(editItem.getText().toString());
            adapter.notifyDataSetChanged();
            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                midList.remove(position);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }
}