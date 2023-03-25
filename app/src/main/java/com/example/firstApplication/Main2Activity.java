package com.example.firstApplication;

import static android.content.ContentValues.TAG;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Main2Activity extends AppCompatActivity {
    private TextView nameText;
    private ActivityResultLauncher<Intent> activityLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameText = findViewById(R.id.textViewContent);
        Log.e(TAG, "onCreate");
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Toast.makeText(this, "Привет, " + name + "!", Toast.LENGTH_SHORT).show();

        Button buttonLake = findViewById(R.id.buttonLake);
        buttonLake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "LakeButtonOn");
                Intent intent = new Intent(Main2Activity.this, LakeActivity.class);
                intent.putExtra("name", name);
                activityLauncher.launch(intent);
            }
        });
        activityLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if(result.getResultCode() == RESULT_OK) {
                    Intent data = result.getData();
                    String lake = data.getStringExtra("item");
                    nameText.setText(lake);
                }

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
