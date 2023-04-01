package com.example.firstApplication;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AuthenticationFragment extends Fragment {
    private static final String TAG = "MyApp";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getContext(), "OnCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate");
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