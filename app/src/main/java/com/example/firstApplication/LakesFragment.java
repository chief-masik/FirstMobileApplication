package com.example.firstApplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class LakesFragment extends Fragment {

    static final private String TAG = "ThirdFr";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getContext(), "OnCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onCreate");
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Toast.makeText(getContext(), "OnCreateView", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onCreateView");
        return inflater.inflate(R.layout.fragment_lakes, container, false);
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
}