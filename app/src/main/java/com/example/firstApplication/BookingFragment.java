package com.example.firstApplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BookingFragment extends Fragment implements View.OnClickListener {
    static final private String TAG = "SecondFr";
    private String name;
    private String password;
    private String item;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        name = getArguments().getString("name");
        password = getArguments().getString("password");
        item = getArguments().getString("item");
        Log.d(TAG,"onCreate");
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment_booking,container,false);
        Button buttonLake = (Button) view1.findViewById(R.id.buttonLake);
        Button buttonRiver = (Button) view1.findViewById(R.id.buttonRiver);
        buttonLake.setOnClickListener(this);
        buttonRiver.setOnClickListener(this);
        if(item != null) {
            TextView nameText = (TextView) view1.findViewById(R.id.textViewContent);
            nameText.setText(item);
        }
        if (name != null)
            Toast.makeText(getContext(),"Привет, " + name + "!", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onCreateView");
        return view1;
    }
    @Override
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("name",name);
        Intent intent = new Intent(view.getContext(), MyService.class);
        getContext().startService(intent);
        switch (view.getId()) {
            case R.id.buttonRiver:
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragmentContainerView, RiversFragment.class, bundle).commit();
                break;
            case R.id.buttonLake:
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragmentContainerView, LakesFragment.class, bundle).commit();
                break;
        }
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
        Log.d(TAG,"onViewCreated");
    }
    public void onViewStateRestored( @Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(TAG,"onViewStateRestored");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG,"onDestroyView");
    }
    public void onSaveInstanceState( @Nullable Bundle outState) {
        super.onViewStateRestored(outState);
        Log.d(TAG,"onSaveInstanceState");
    }
}