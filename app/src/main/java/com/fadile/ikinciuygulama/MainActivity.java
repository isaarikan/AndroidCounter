package com.fadile.ikinciuygulama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt;
    Button btn;
    int sayi=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView) findViewById(R.id.textView);

        btn=(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             sayi++;
                if(sayi>10){

                    finish();
                }else {

                    txt.setText("" + sayi);
                }




            }
        });
    }
}
