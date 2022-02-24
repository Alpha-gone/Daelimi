package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class ModDialog extends Activity {
    String themColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_mod_dialog);
    }
    public void btclose(View view) {
        finish();
    }

    public void rblight(View view) {
        themColor =ThemeUtil.LIGHT_MODE;
        ThemeUtil.applyTheme(themColor);
        ThemeUtil.modSave(getApplicationContext(),themColor);
    }

    public void rbdark(View view) {
        themColor =ThemeUtil.DARK_MODE;
        ThemeUtil.applyTheme(themColor);
        ThemeUtil.modSave(getApplicationContext(),themColor);
    }
}