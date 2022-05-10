package com.example.enter_names;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.enter_names.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binder.getRoot());

        //code:
        binder.botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String trexonText = "";
                if (binder.names.getText() != null)
                    trexonText = binder.names.getText().toString();
                else
                    trexonText = "";

                String us = binder.username.getText().toString();
                String pass = binder.password.getText().toString();
                String up = us + "," + pass + "\n";
                trexonText = trexonText + up;

                binder.names.setText(trexonText);
                /*

                binder.names.setText(up);*/

            }

        });
        binder.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 binder.username.setText("");
                 binder.password.setText("");
                 binder.names.setText("");
            }
        });
        Log.e("hello" ,"welcome!!");

        binder.openfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // edw 8a anoigei to neo mou fragment!!! <3
                MyNewEpicFragment f = new MyNewEpicFragment();
                f.show(getSupportFragmentManager(),"tokaliterofragmentstonplaniti");
            }
        });
    }
}