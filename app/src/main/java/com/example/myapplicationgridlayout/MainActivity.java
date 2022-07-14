package com.example.myapplicationgridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView= findViewById(R.id.textView);
        Switch switch1 = findViewById(R.id.switch1);
        ImageButton imageButton= findViewById(R.id.imageButton);
        Button button = findViewById(R.id.button);
        CheckBox checkBox = findViewById(R.id.checkBox);
        TextView textView2 = findViewById(R.id.textView2);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               textView.setText(textView2.getText());
                Toast.makeText(MainActivity.this, getResources().getString(R.string.toast_message), Toast.LENGTH_SHORT).show();
            }
        });

        CheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String text = "";
                if (b) text = "on";
                else text = "off";

                Snackbar snackbar = Snackbar
                        .make(coordinatorLayout, "The Checkbox is now " + text, Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                myCheckBox.setChecked(!b);
                            }
                        });

                snackbar.show();
            }