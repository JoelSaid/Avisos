package com.example.avisos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   Log.i(TAG, "onCreate");
     //   Toast.makeText(this, "La aplicacion acendio", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "La aplicacion acendio";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

    }
    public void sendMessage(View view) {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent ira2 = new Intent(MainActivity.this, Activity2.class);
                startActivity(ira2);
            }
        });

    }

    @Override

    protected void onStart(){
        super.onStart();
     //   Log.i(TAG,"OnStart");
     //   Toast.makeText(this, "La aplicacion acendio", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "La aplicacion ya jala";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }
    @Override
    protected void onResume(){
        super.onResume();
      //  Log.i(TAG,"onResume");
      //  Toast.makeText(this, "La aplicacion ta trabajando", Toast.LENGTH_SHORT).show();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_personalizado_onresume, (ViewGroup) findViewById(R.id.toast_on_resume));
        TextView texto_Toast = (TextView) layout.findViewById(R.id.texto_Toast);
        texto_Toast.setText("La aplicacion se ha recuoerado");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
    @Override
    protected void onPause(){
        super.onPause();
       // Log.i(TAG,"onPause");
       // Toast.makeText(this, "La aplicacion ta pausada", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "La aplicacion ta pausada";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }
    @Override
    protected void onStop(){
        super.onStop();
       // Log.i(TAG,"onStop");
       // Toast.makeText(this, "Weeeeyyyyyy La aplicacion se detuvo 7_7", Toast.LENGTH_SHORT).show();

        Context context = getApplicationContext();
        CharSequence text = "Weeeeyyyyyy La aplicacion se detuvo 7_7";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
      //  Log.i(TAG,"onDestroy");
      //  Toast.makeText(this, "La mataste prro 7n7", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "La mataste prro 7n7, que crees que no cuesta programarla";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

    }
    /*
    onCreate
    onStart
    onResume
    -.-.-.-.-.-.
    onPause
    onStop
    oonDestroy

    * */

}