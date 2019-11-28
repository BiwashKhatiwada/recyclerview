package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class detailsActivity extends AppCompatActivity {
    CircleImageView crImg;
    TextView txtName,txtPHone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        crImg=findViewById(R.id.imageView);
        txtName=findViewById(R.id.txtName);
        txtPHone=findViewById(R.id.txtPhone);


        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            crImg.setImageResource(bundle.getInt("image"));
            txtPHone.setText(bundle.getString("phone"));
            txtName.setText(bundle.getString("name"));
        }
    }
}
