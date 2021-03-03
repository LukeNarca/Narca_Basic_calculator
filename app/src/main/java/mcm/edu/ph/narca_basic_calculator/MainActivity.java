package mcm.edu.ph.narca_basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_addition, btn_subtraction, btn_division, btn_multiplication, btn_modulo;


        btn_addition = findViewById(R.id.btn_addition);
        btn_subtraction = findViewById(R.id.btn_subtraction);
        btn_division = findViewById(R.id.btn_division);
        btn_multiplication = findViewById(R.id.btn_multiplication);
        btn_modulo = findViewById(R.id.btn_modulo);

        btn_addition.setOnClickListener(this);
        btn_subtraction.setOnClickListener(this);
        btn_division.setOnClickListener(this);
        btn_multiplication.setOnClickListener(this);
        btn_modulo.setOnClickListener(this);
    }
    public void onClick(View v) {
        EditText txtOperand1, txtOperand2;

        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtOperand2 = findViewById(R.id.txtOperand2);
        txtAnswer = findViewById(R.id.txtAnswer);

        Double op1 = 0.0;
        Double op2 = 0.0;
        Double answer = 0.0;

        op1 = Double.parseDouble(txtOperand1.getText().toString());
        op2 = Double.parseDouble(txtOperand2.getText().toString());

        switch (v.getId()) {
            case R.id.btn_addition:
                answer = op1 + op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btn_subtraction:
                answer = op1 - op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btn_division:
                answer = op1 / op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btn_modulo:
                answer = op1 % op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btn_multiplication:
                answer = op1 * op2;
                txtAnswer.setText(Double.toString(answer));

                break;


        }
    }

}