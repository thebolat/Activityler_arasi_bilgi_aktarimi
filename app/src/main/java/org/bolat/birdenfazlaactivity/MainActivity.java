package org.bolat.birdenfazlaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String username;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);

    }

    public void sayfaDegistir(View view) {

        username=editText.getText().toString();
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("userInput",username);
        startActivity(intent);



    }

}
