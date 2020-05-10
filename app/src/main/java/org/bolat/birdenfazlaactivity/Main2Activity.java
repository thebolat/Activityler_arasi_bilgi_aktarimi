package org.bolat.birdenfazlaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class Main2Activity extends AppCompatActivity {
    TextView textView;
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView4);
        Intent intent=getIntent();

        userName= intent.getStringExtra("userInput");
        textView.setText(userName);
    }

    public void ilkSayfayaDon(View view) {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}
