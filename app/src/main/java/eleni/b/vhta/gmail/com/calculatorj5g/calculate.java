package eleni.b.vhta.gmail.com.calculatorj5g;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        // just a test
        Button addButton = (Button) findViewById(R.id.addButton);
        Button substrButton = (Button) findViewById(R.id.substrButton);
        Button multButton = (Button) findViewById(R.id.multButton);
        Button divButton = (Button) findViewById(R.id.divButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText fisrtNumberText = (EditText) findViewById(R.id.firstNumberText);
                EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double number1 = Double.parseDouble(fisrtNumberText.getText().toString());
                double number2 = Double.parseDouble(secondNumberText.getText().toString());
                double result = number1 + number2 ;

                resultTextView.setText(result + "");
            }
        });
        substrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText fisrtNumberText = (EditText) findViewById(R.id.firstNumberText);
                EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double number1 = Double.parseDouble(fisrtNumberText.getText().toString());
                double number2 = Double.parseDouble(secondNumberText.getText().toString());
                double result = number1 - number2 ;

                resultTextView.setText(result + "");
            }
        });
        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText fisrtNumberText = (EditText) findViewById(R.id.firstNumberText);
                EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double number1 = Double.parseDouble(fisrtNumberText.getText().toString());
                double number2 = Double.parseDouble(secondNumberText.getText().toString());
                double result = number1 * number2 ;

                resultTextView.setText(result + "");
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText fisrtNumberText = (EditText) findViewById(R.id.firstNumberText);
                EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double number1 = Double.parseDouble(fisrtNumberText.getText().toString());
                double number2 = Double.parseDouble(secondNumberText.getText().toString());
                double result = number1 / number2 ;

                resultTextView.setText(result + "");
            }
        });

    }
}
