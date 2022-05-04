package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Kurili extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurili);
    }
    public void onClickBack(View view){
        onBackPressed();
    }
    public void onClickImage(View view){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_dialog);
        TextView text = (TextView) dialog.findViewById(R.id.dialogText);
        text.setText("Кури́льские острова́ — цепь островов между полуостровом Камчатка и островом Хоккайдо," +
                " чуть выпуклой дугой отделяющая Охотское море от Тихого океана.");
        text.setTextSize(25);
        dialog.show();
    }
}