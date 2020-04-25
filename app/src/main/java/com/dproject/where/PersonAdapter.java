package com.dproject.where;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * ViewHolder란 view를 꼽아두는 객체이다. 주의할 점은 하나의 view만 관리하는 객체이다.
 */
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.MyViewHolder> {

    private static final String TAG = "PersonAdapter";

    private List<Person> list = new ArrayList<>();

    private int createI = 1;
    private int bindI = 1;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivProfile;
        private TextView tvName;
        private TextView tvPhone;

        public MyViewHolder(View personItemView) {
            super(personItemView);
            ivProfile = personItemView.findViewById(R.id.ivProfile);
            tvName = personItemView.findViewById(R.id.tvName);
            tvPhone = personItemView.findViewById(R.id.tvPhone);
        }

        public void setItem(Person person) {
            ivProfile.setImageResource(person.getImage());
            tvName.setText(person.getName());
            tvPhone.setText(person.getPhone());
        }
    }

    public void addItem(Person person) {
        list.add(person);
    }

    public void addItems(List<Person> list) {
        this.list = list;
    }

    //뷰 홀더를 생성하고 뷰를 붙여주는 부분
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        Log.d(TAG, "onCreateViewHolder: 실행 " + createI);
        createI++;

        LayoutInflater inflater1 = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v1 = inflater1.inflate(R.layout.list_view, viewGroup, false);

        // LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        // View v2 = inflater.inflate(R.layout.person_item, viewGroup, false);

        return new MyViewHolder(v1);
    }

    //재활용 되는 뷰가 호출하여 실행되는 메소드, 뷰 홀더를 전달하고 어댑터는 position의 데이터를 ui에 결합시킨다.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Log.d(TAG, "onBindViewHolder: 실행 " + bindI);
        bindI++;
        Person person = list.get(i);
        myViewHolder.setItem(person);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
