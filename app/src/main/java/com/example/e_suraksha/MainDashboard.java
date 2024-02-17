package com.example.e_suraksha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainDashboard extends AppCompatActivity {
CardView cdr,bank,id,ip;
    private ALodingDialog aLodingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);
        cdr=findViewById(R.id.cdr);
        bank=findViewById(R.id.bankcard);
        id=findViewById(R.id.idcard);
        ip=findViewById(R.id.ip);
        aLodingDialog = new ALodingDialog(this);
        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fxnbank();
            }
        });
        id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fxnid();
            }
        });

        ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fxnip();
            }
        });
        cdr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

fxncdr();


            }
        });
    }

public void fxncdr(){
    aLodingDialog.show();

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            aLodingDialog.cancel();
        }
    };
    handler.postDelayed(runnable,700);
    Handler newhand=new Handler();
    Runnable runa=new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(MainDashboard.this,MainActivity.class));
            aLodingDialog.cancel();
        }
    };newhand.postDelayed(runa,500);
}

    public void fxnip(){
        aLodingDialog.show();

        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                aLodingDialog.cancel();
            }
        };
        handler.postDelayed(runnable,700);
        Handler newhand=new Handler();
        Runnable runa=new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainDashboard.this,IP.class));
                aLodingDialog.cancel();
            }
        };newhand.postDelayed(runa,500);
    }
    public void fxnid(){
        aLodingDialog.show();

        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                aLodingDialog.cancel();
            }
        };
        handler.postDelayed(runnable,700);
        Handler newhand=new Handler();
        Runnable runa=new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainDashboard.this,IDPR.class));
                aLodingDialog.cancel();
            }
        };newhand.postDelayed(runa,500);
    }
    public void fxnbank(){
        aLodingDialog.show();

        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                aLodingDialog.cancel();
            }
        };
        handler.postDelayed(runnable,700);
        Handler newhand=new Handler();
        Runnable runa=new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainDashboard.this,bank.class));
                aLodingDialog.cancel();
            }
        };newhand.postDelayed(runa,500);
    }
}