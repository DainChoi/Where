package com.dproject.where;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Frag2 extends Fragment {

    private View view;
    private TextView tv;
    private RecyclerView recyclerView;
    List<GroupMember> memberList;
    GroupMemberAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.frag2, container, false);

        tv = (TextView) view.findViewById(R.id.tv);
       /*
        recyclerView = view.findViewById(R.id.rv1);
        recyclerView.setHasFixedSize(true);
        //layoutManager = new LinearLayoutManager(getActivity());
        //recyclerView.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        memberList = new ArrayList<>();

        adapter = new GroupMemberAdapter(getActivity(), memberList);
        recyclerView.setAdapter(adapter);

        */



       return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.menu2, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.add){
           Toast.makeText(getActivity(), "Add btn is Clicked", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getActivity(), GroupActivity.class);
            //startActivityForResult(i,1);
            startActivityForResult(i, 2);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==2)
        {
            String message = data.getStringExtra("MESSAGE");
            tv.setText(message);
            //GroupMember memberList = new GroupMember(message);
           // memberList.add(message);
           // adapter.notifyDataSetChanged();

        }
    }




}
