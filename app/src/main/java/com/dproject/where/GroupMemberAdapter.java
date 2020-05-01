package com.dproject.where;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class GroupMemberAdapter extends RecyclerView.Adapter<GroupMemberAdapter.ContactViewHolder> {
    Context mContext;
    List<GroupMember> memberList;


    public GroupMemberAdapter(Context mContext, List<String> contactList) {
        this.mContext = mContext;
        this.memberList = memberList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.group_item_member, parent, false);

        ContactViewHolder holder = new ContactViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {

        GroupMember groupMember = memberList.get(position);
        holder.group_member.setText(groupMember.getName());

    }

    @Override
    public int getItemCount() {
        return 0;
        //return memberList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView group_member;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            group_member = itemView.findViewById(R.id.group_member);
        }
    }

}
