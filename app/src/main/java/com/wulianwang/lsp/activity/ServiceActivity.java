package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


import com.wulianwang.lsp.R;

public class ServiceActivity extends AppCompatActivity {
    private ImageButton btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        btn=findViewById(R.id.btn);
        tv=findViewById(R.id.tv_3);
        tv.setMovementMethod(ScrollingMovementMethod.getInstance());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent =new Intent(ServiceActivity.this,MainActivity.class);
                //startActivity(intent);
                onBackPressed();


            }
        });
    }
}

