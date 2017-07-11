package com.example.glaube_nikesh.dynamictablelayoutcreation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){

        TableLayout ll = (TableLayout) findViewById(R.id.displayLinear);

        for (int i = 0; i <100; i++) {

            TableRow row= new TableRow(this);
            TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
            row.setLayoutParams(lp);
            t1 = new TextView(this);
            t1.setText("hello");
            t1.setGravity(Gravity.CENTER);
            t1.setTextSize(16);
            t2 = new TextView(this);
            t2.setGravity(Gravity.CENTER);
            t2.setText("Voucher");
            t2.setTextSize(16);
            t3 = new TextView(this);
            t3.setText("BCV");
            t3.setTextSize(16);
            t3.setGravity(Gravity.CENTER);
            t4 = new TextView(this);
            t4.setText("SUPPLIER");
            t4.setGravity(Gravity.CENTER);
            t4.setTextSize(16);
            t5 = new TextView(this);
            t5.setText("10,000");
            t5.setGravity(Gravity.CENTER);
            t5.setTextSize(16);
            row.addView(t1);
            row.addView(t2);
            row.addView(t3);
            row.addView(t4);
            row.addView(t5);
            row.setGravity(Gravity.CENTER_HORIZONTAL);
            ll.addView(row,i);
        }
    }
}
