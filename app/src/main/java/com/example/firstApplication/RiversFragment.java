package com.example.firstApplication;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.Manifest;

import com.example.firstApplication.model.Item;
import com.example.firstApplication.model.ItemAdapter;

import java.util.ArrayList;

public class RiversFragment extends Fragment {
    private final static String TAG = "RiversFr";
    private final static String CHANNEL_ID = "River channel";
    private final static int NOTIFY_ID = 101;
    private RecyclerView recyclerView;
    private String name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        name = getArguments().getString("name");
        Log.d(TAG,"onCreate");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Channel 2";
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, name, NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = getContext().getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment_rivers,container,false);
        recyclerView = (RecyclerView) view1.findViewById(R.id.RecyclerView);
        ArrayList<Item> arrayList = new ArrayList<>();
        for(int i = 0; i < 67; i++) {
            arrayList.add(new Item(R.drawable.river_ob,"Река Обь"));
            arrayList.add(new Item(R.drawable.river_volga,"Река Волга"));
            arrayList.add(new Item(R.drawable.river_yenisey,"Река Енисей"));
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        ItemAdapter adapter = new ItemAdapter(getActivity(), arrayList, new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String item = arrayList.get(position).getNameItem();
                Bundle bundle = new Bundle();
                bundle.putString("item", item);
                bundle.putString("name", name);
                getParentFragmentManager().beginTransaction().setReorderingAllowed(true)
                        .replace(R.id.fragmentContainerView, BookingFragment.class, bundle).commit();

                NotificationCompat.Builder builder = new
                        NotificationCompat.Builder(getContext(), CHANNEL_ID)
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentTitle(getString(
                                R.string.content_title_rivers))
                        .setContentText(item + " выбрана!")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(getContext());
                if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
                    notificationManager.notify(NOTIFY_ID, builder.build());
                }

                Log.i("ListView", "element number " + position +" click");
            }
        });
        recyclerView.setAdapter(adapter);

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