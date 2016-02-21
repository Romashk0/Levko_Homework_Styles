package com.levko.roma.levkohomeworkstyles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnFocusChangeListener {


    public Button btnPlus, btnMinus;
    public EditText edt1, edt2;
    public TextView tv_results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        findsViews();
        setListeners();
    }

    private void findsViews() {
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        tv_results = (TextView) findViewById(R.id.tv_results);
    }

    private void setListeners() {
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        edt1.setOnFocusChangeListener(this);
        edt2.setOnFocusChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        String sFirstNumber = edt1.getText().toString();
        String sSecondNumber = edt2.getText().toString();
        if (TextUtils.isEmpty(sFirstNumber) || TextUtils.isEmpty(sSecondNumber)) {
            Toast.makeText(this, "Please, enter the number", Toast.LENGTH_SHORT).show();
        } else {
            int a = Integer.parseInt(sFirstNumber);
            int b = Integer.parseInt(sSecondNumber);

            switch (v.getId()) {
                case R.id.btnPlus:
                    tv_results.setText(Integer.toString(a + b));
                    break;
                case R.id.btnMinus:
                    tv_results.setText(Integer.toString(a - b));
                    break;
            }
        }
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (hasFocus) {
            switch (v.getId()) {
                case R.id.edt1:
                    edt1.setText("");
                    break;
                case R.id.edt2:
                    edt2.setText("");
                    break;
            }
        }
    }
}
