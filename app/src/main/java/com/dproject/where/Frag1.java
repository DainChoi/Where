package com.dproject.where;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Frag1 extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.frag1, container, false);

        rvSetting();
        rvDataSetting();


        return view;
    }

    private void rvSetting(){
        recyclerView = view.findViewById(R.id.rv1);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
    }

    private void rvDataSetting(){
        PersonAdapter adapter = new PersonAdapter();

        adapter.addItem(new Person(R.drawable.icon_user, "김가나", "01011113333"));
        adapter.addItem(new Person(R.drawable.icon_user, "이나다", "01022224444"));
        adapter.addItem(new Person(R.drawable.icon_user, "박다라", "01033335555"));
        adapter.addItem(new Person(R.drawable.icon_user, "최라마", "01044446666"));
        adapter.addItem(new Person(R.drawable.icon_user, "김마바", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "이바사", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "박사아", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "최아자", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "김자차", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "이차카", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "박카타", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "최타파", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "김파하", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "이하가", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "박가나", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "최나다", "01022228888"));



        recyclerView.setAdapter(adapter);
    }




}
