package com.example.firstApplication;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        TextView nameText = findViewById(R.id.textView);
        String text = getResources().getString(R.string.text_hello);
        nameText.setText(text);

        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.hello);

        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_LONG).show();
        Log.e(TAG,"onCreate");
    }

    public void onClickButton(View view) {
        Log.i(TAG,"ButtonOn");

        EditText nameText1 = findViewById(R.id.editTextTextPersonName);
        EditText nameText2 = findViewById(R.id.editTextTextPersonName2);
        String name = nameText1.getText().toString();
        String password = nameText2.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("name", name);
        intent.putExtra("password", password);
        startActivity(intent);
    }

}