package com.example.pre;

import java.io.OutputStream;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.view.SurfaceView;
import android.content.Intent;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraMetadata;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;

public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText edit;
    String inputName;
    Button cdmk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        edit = (EditText)findViewById(R.id.input);
        cdmk = (Button)findViewById(R.id.cdmk);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                inputName = edit.getText().toString();
                Toast.makeText(getApplicationContext(), inputName, Toast.LENGTH_SHORT).show();
            }

        });

        cdmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, userCourseMake.class);
                startActivity(intent);
            }
        });
    }
}