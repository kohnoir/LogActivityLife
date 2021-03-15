package com.example.logactivitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        Log.d("Lifecycle","onCreate");
        if(savedInstanceState == null){
            Toast.makeText(this,"Тупа пустой бандл",Toast.LENGTH_SHORT).show();
        }

    }
    protected void onStart(){
        super.onStart();
        Log.d("Lifecycle","onStart");
        textView.append("\n" + "onStart");
    }
    protected void onResume(){
        super.onResume();
        Log.d("Lifecycle","onResume");
        textView.append("\n" + "onResume");
    }
    protected void onPause(){
        super.onPause();
        Log.d("Lifecycle","onPause");
        textView.append("\n" + "onPause");
    }
    protected void onStop(){
        super.onStop();
        Log.d("Lifecycle","onStop");
        textView.append("\n" + "onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Lifecycle","onDestroy");
        textView.append("\n" + "onDestroy");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", "onRestart");
        textView.append("\n" + "onRestart");
    }
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        Log.d("Lifecycle", "onPostCreate");
        textView.append("\n" + "onPostCreate");
    }
    protected void onPostResume(){
        super.onPostResume();
        Log.d("Lifecycle", "onPostResume");
        textView.append("\n" + "onPostResume");
    }
    public boolean onKeyDown(int keyCode, KeyEvent event){
        super.onKeyDown(keyCode,event);
        Log.d("Lifecycle", "onKeyDown");
        textView.append("\n" + "onKeyDown");
        return false;
    }
    public boolean onKeyLongPress(int keyCode, KeyEvent event){
        super.onKeyLongPress(keyCode,event);
        Log.d("Lifecycle", "onKeyLongPress");
        textView.append("\n" + "onKeyLongPress");
        return false;
    }

    public void onBackPressed(){
        super.onBackPressed();
        Log.d("Lifecycle", "onBackPressed");
        textView.append("\n" + "onBackPressed");
    }
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putString("text", textView.getText().toString());
        Log.d("Lifecycle", "onSaveInstanceState");
        textView.append("\n" + "onSaveInstanceState");
        super.onSaveInstanceState(savedInstanceState);
    }
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d("Lifecycle", "onRestoreInstanceState");
        textView.append("\n" + "onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }
}
