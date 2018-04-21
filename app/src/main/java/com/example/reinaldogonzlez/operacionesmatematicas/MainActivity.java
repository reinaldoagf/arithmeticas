package com.example.reinaldogonzlez.operacionesmatematicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etFirst, etSecond;
    TextView tvResult;
    Button btnSuma, btnResta, btnMultiplicacion, btnDivision;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst= (EditText) findViewById(R.id.etFirst);
        etSecond= (EditText) findViewById(R.id.etSecond);

        tvResult= (TextView) findViewById(R.id.tvResult);

        Toast.makeText(getApplicationContext(),"Operaciones Matematicas",Toast.LENGTH_LONG).show();
    }
    public void sumar(){
        int result=a+b;
        tvResult.setText(""+result);
    }
    public void restar(){
        int result=a-b;
        tvResult.setText(""+result);
    }
    public void multiplicar(){
        int result=a*b;
        tvResult.setText(""+result);
    }
    public void dividir(){
        int result=a/b;
        tvResult.setText(""+result);
    }

    public void operacion(View view) {
        a=Integer.parseInt(etFirst.getText().toString());
        b=Integer.parseInt(etSecond.getText().toString());
        switch (view.getId()){
            case R.id.btnSuma: sumar();
                break;
            case R.id.btnResta: restar();
                break;
            case R.id.btnMultiplicacion: multiplicar();
                break;
            case R.id.btnDivision: dividir();
                break;

        }

    }
}
