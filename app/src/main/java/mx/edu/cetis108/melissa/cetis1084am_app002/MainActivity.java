package mx.edu.cetis108.melissa.cetis1084am_app002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view)
    {
        Button btn1=(Button) findViewById(R.id.sumar);
        Button btn2=(Button) findViewById(R.id.restar);
        Button btn3=(Button) findViewById(R.id.mult);
        Button btn4=(Button) findViewById(R.id.div);
        EditText txtNum1 = (EditText) findViewById(R.id.txtNum1);
        EditText txtNum2 = (EditText) findViewById(R.id.txtNum2);
        TextView resultado = (TextView) findViewById(R.id.Resultado);
        double num1 = Double.valueOf(txtNum1.getText().toString());
        double num2 = Double.valueOf(txtNum2.getText().toString());
        double result;
        if (txtNum1.getText().toString()==""||txtNum2.getText().toString()=="") {
            Toast.makeText(getApplicationContext(),"Introduzca un número",Toast.LENGTH_LONG).show();
        }
        if (btn1.isPressed()) {
            result = num1 + num2;
            resultado.setText(Double.toString(result));
        }
        if (btn2.isPressed()) {
            result=num1-num2;
            resultado.setText(Double.toString(result));
        }
        if (btn3.isPressed()) {
            result=num1*num2;
            resultado.setText(Double.toString(result));
        }
        if (btn4.isPressed()) {
            result=num1/num2;
            resultado.setText(Double.toString(result));
        }
    }
}
