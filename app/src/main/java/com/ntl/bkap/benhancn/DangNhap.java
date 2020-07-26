package com.ntl.bkap.benhancn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangNhap extends AppCompatActivity {
    private Button btnDn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        btnDn = findViewById(R.id.btn_dang_nhap);
        btnDn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangNhap.this, HomePageAct.class);
                startActivity(intent);
            }
        });
    }
}
