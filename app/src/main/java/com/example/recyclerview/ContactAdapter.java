package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactsViewHolder> {

    Context mContext;
    List<Contacts> contactsList;
    public ContactAdapter (Context mContext,List<Contacts> contactsList){
        this.mContext=mContext;
        this.contactsList=contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contactview,parent,false);

        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
       final Contacts contacts=contactsList.get(position);
       holder.imgProfile.setImageResource(contacts.getImgId());
       holder.txtPhone.setText(contacts.getPhone());
       holder.txtName.setText(contacts.getName());

        holder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,detailsActivity.class);
                intent.putExtra("image",contacts.getImgId());
                intent.putExtra("phone",contacts.getPhone());
                intent.putExtra("name",contacts.getName());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
     CircleImageView imgProfile;
     TextView txtPhone, txtName;
     public ContactsViewHolder(@NonNull View itemView) {
         super(itemView);
         imgProfile=itemView.findViewById(R.id.imageView);
         txtName=itemView.findViewById(R.id.textView);
         txtPhone=itemView.findViewById(R.id.textView2);
     }

 }
}
