package com.example.e_suraksha;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    Button btn;


    private Uri ImageUri;
    private Bitmap bitmap;
    private ALodingDialog aLodingDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        img=findViewById(R.id.getimg);
        btn=findViewById(R.id.button);

        aLodingDialog = new ALodingDialog(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ImageUri!=null){
                    aLodingDialog.show();

                    Handler handler = new Handler();
                    Runnable runnable = new Runnable() {
                        @Override
                        public void run() {
                            aLodingDialog.cancel();
                        }
                    };
                    handler.postDelayed(runnable,5000);
                    Handler newhand=new Handler();
                    Runnable runa=new Runnable() {
                        @Override
                        public void run() {
                            startActivity(new Intent(MainActivity.this,Dataafterprocessing.class));
                            aLodingDialog.cancel();
                        }
                    };newhand.postDelayed(runa,500);
                }
                else{
                    Toast.makeText(MainActivity.this, "Select File", Toast.LENGTH_SHORT).show();
                }

            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickimage();
            }
        });

    }
    private void pickimage() {
        Intent intent =new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        launcher.launch(intent);
    }
    ActivityResultLauncher<Intent> launcher
            =registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            result ->{
                if(result.getResultCode()== Activity.RESULT_OK){
                    Intent data =result.getData();
                    if(data!=null && data.getData()!=null){
                        ImageUri=data.getData();

                        try {
                            bitmap= MediaStore.Images.Media.getBitmap(

                                    getApplication().getContentResolver(),
                                    ImageUri
                            );
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }


                    }

                    if(ImageUri!=null){
                        img.setImageBitmap(bitmap);
                    }
                }
            }
    );
}