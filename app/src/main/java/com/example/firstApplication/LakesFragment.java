package com.example.firstApplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.firstApplication.model.CustomListAdapter;
import com.example.firstApplication.model.Item;

import java.util.ArrayList;

public class LakesFragment extends Fragment {
    static final private String TAG = "LakesFr";
    private ListView listView;
    private String name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        name = getArguments().getString("name");
        Log.d(TAG,"onCreate");
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment_lakes,container,false);
        listView = (ListView) view1.findViewById(R.id.listview);
        ArrayList<Item> arrayList = new ArrayList<>();
        for(int i = 0; i < 67; i++) {
            arrayList.add(new Item(R.drawable.lake_bobrovoe,"Бобровое озеро"));
            arrayList.add(new Item(R.drawable.lake_parshino,"Озеро Паршино"));
            arrayList.add(new Item(R.drawable.lake_peschanoe,"Песчаное озеро"));
        }
        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.list_items, arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapter.getItem(i).getNameItem();
                Bundle bundle = new Bundle();
                bundle.putString("item", item);
                bundle.putString("name", name);
                getParentFragmentManager().beginTransaction().setReorderingAllowed(true)
                        .replace(R.id.fragmentContainerView, BookingFragment.class, bundle).commit();
                Log.i("ListView", "element number " + i +" click");
            }
        });
        Toast.makeText(getContext(), "Эксклюзивный список для " + name, Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onCreateView");
        return view1;
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