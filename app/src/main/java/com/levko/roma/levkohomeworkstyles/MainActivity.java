package com.levko.roma.levkohomeworkstyles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public Button btnPlus, btnMinus;
    public EditText edt1, edt2;
    public TextView tv_results;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        edt1 = (EditText) findViewById(R.id.edt);
        edt2 = (EditText) findViewById(R.id.edt2);
        tv_results = (TextView) findViewById(R.id.tv_results);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int a = Integer.parseInt(String.valueOf(edt1.getText()));
        int b = Integer.parseInt(String.valueOf(edt2.getText()));

        switch (v.getId()) {
            case R.id.btnPlus:
                tv_results.setText((a + b) + "");
                break;
            case R.id.btnMinus:
                tv_results.setText((a - b) + "");
                break;

        }

    }

}
