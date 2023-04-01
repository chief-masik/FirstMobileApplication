package com.example.firstApplication;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LakeActivity extends AppCompatActivity {
    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.e(TAG, "onCreate");

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Toast.makeText(this, "Эксклюзивный список для " + name, Toast.LENGTH_SHORT).show();
    }

    public void onClickButtomBack(View view) {
        Log.i(TAG,"ButtomBackOn");

        EditText nameText = findViewById(R.id.editTextTextPersonName3);
        String nameLake = nameText.getText().toString();
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("item", nameLake);
        setResult(RESULT_OK, intent);
        finish();
    }
    */
}
