package com.example.myapptamar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private Button btn1,btn2,btn3,btn4;
    private TextView tv;
    private FrameLayout fl;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count=0;
        img=findViewById(R.id.imageView);
        tv=findViewById(R.id.textView2);
        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button7);
        btn3=findViewById(R.id.button6);
        btn4=findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.barbie);
                img.setY(img.getY()-15);
                if(img.getY()<0||img.getY()>630){
                    count++;
                    tv.setText(count+"");
                    img.setImageResource(R.drawable.sad);
                }
                if(count==5){
                    finish();
                    System.exit(0);}

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.barbie);
                img.setY(img.getY() + 15);
                if(img.getY()>615){
                    count++;
                    tv.setText(count + "");
                    img.setImageResource(R.drawable.sad);
                }
                if(count==5){
                    finish();
                    System.exit(0);}

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.barbie);
                img.setX(img.getX()-15);
                if(img.getX()<-90){
                    count++;
                    tv.setText(count + "");
                    img.setImageResource(R.drawable.sad);
                }
                if(count==5){
                    finish();
                    System.exit(0);}

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.barbie);
                img.setX(img.getX()+15);
                if(img.getX()>300){
                    count++;
                    tv.setText(count + "");
                    img.setImageResource(R.drawable.sad);
                }
                if(count==5){
                    finish();
                    System.exit(0);
                }
            }
        });


    }
}
