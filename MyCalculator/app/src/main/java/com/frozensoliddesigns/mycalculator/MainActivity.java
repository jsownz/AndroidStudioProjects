package com.frozensoliddesigns.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;

    private Button buttonAdd;
    private Button buttonSubtract;
    private Button buttonDivide;
    private Button buttonMultiply;
    private Button buttonClr;

    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);

        buttonAdd = (Button) findViewById(R.id.button_add);
        buttonSubtract = (Button) findViewById(R.id.button_subtract);
        buttonDivide = (Button) findViewById(R.id.button_divide);
        buttonMultiply = (Button) findViewById(R.id.button_multiply);
        buttonClr = (Button) findViewById(R.id.button_clr);

        result = (TextView) findViewById(R.id.result);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                boolean isEmpty = checkForEmptyFields(operand1.getText().toString(),operand2.getText().toString());
                if (!isEmpty) {
                    double sum = Double.parseDouble(operand1.getText().toString()) + Double.parseDouble(operand2.getText().toString());
                    result.setText(Double.toString(sum));
                }
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isEmpty = checkForEmptyFields(operand1.getText().toString(),operand2.getText().toString());
                if (!isEmpty) {
                    double sum = Double.parseDouble(operand1.getText().toString()) - Double.parseDouble(operand2.getText().toString());
                    result.setText(Double.toString(sum));
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isEmpty = checkForEmptyFields(operand1.getText().toString(),operand2.getText().toString());
                if (!isEmpty) {
                    double sum = Double.parseDouble(operand1.getText().toString()) / Double.parseDouble(operand2.getText().toString());
                    result.setText(Double.toString(sum));
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isEmpty = checkForEmptyFields(operand1.getText().toString(),operand2.getText().toString());
                if (!isEmpty) {
                    double sum = Double.parseDouble(operand1.getText().toString()) * Double.parseDouble(operand2.getText().toString());
                    result.setText(Double.toString(sum));
                }
            }
        });

        buttonClr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                operand1.setText("");
                operand2.setText("");
                result.setText("0.00");
            }
        });
    }

    public boolean checkForEmptyFields(String text1, String text2) {
        if (text1.length() < 1 || text2.length() < 1) {
            Toast toastMessage = Toast.makeText(MainActivity.this, "Must not have empty fields", Toast.LENGTH_SHORT);
            toastMessage.show();
            return true;
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
