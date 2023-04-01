package com.example.firstApplication;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
    private static final String TAG = "FirstFr";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getContext(), "OnCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate");
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Toast.makeText(getContext(), "OnCreateView", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onCreateView");
        return inflater.inflate(R.layout.fragment_authentication, container, false);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
        Toast.makeText(getContext(), "OnViewCreated", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onViewCreated");
    }
    public void onViewStateRestored( @Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Toast.makeText(getContext(), "onViewStateRestored", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onViewStateRestored");
    }
    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(), "OnStart", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onStart");
    }
    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getContext(), "OnStop", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getContext(), "OnDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onDestroy");
    }
    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getContext(), "OnPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onPause");
    }
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getContext(), "OnResume", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onResume");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getContext(), "OnDestroyView", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onDestroyView");
    }
    public void onSaveInstanceState( @Nullable Bundle outState) {
        super.onViewStateRestored(outState);
        Toast.makeText(getContext(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onSaveInstanceState");
    }
    /*
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
    */

}