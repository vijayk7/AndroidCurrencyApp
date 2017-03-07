package com.vijaylohana.android.androidap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText edi = (EditText) findViewById(R.id.editt);

        Double dollarAmount = Double.parseDouble(edi.getText().toString());

        Double poundAmount = dollarAmount * 104;
        Log.i("dollarField", poundAmount.toString());
        Toast.makeText(getApplicationContext(), "Rs" + poundAmount.toString(), Toast.LENGTH_LONG).show();







    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
