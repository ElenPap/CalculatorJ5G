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
        // just for test
        Button addButton = findViewById(R.id.addButton);
        Button substrButton = findViewById(R.id.substrButton);
        Button multButton = findViewById(R.id.multButton);
        Button divButton = findViewById(R.id.divButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText firstNumberText = findViewById(R.id.firstNumberText);
                EditText secondNumberText = findViewById(R.id.secondNumberText);
                TextView resultTextView = findViewById(R.id.resultTextView);

                double number1 = Double.parseDouble(firstNumberText.getText().toString());
                double number2 = Double.parseDouble(secondNumberText.getText().toString());
                double result = number1 + number2 ;

                resultTextView.setText(String.format("%s", result));
            }
        });
        substrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText firstNumberText = findViewById(R.id.firstNumberText);
                EditText secondNumberText = findViewById(R.id.secondNumberText);
                TextView resultTextView = findViewById(R.id.resultTextView);

                double number1 = Double.parseDouble(firstNumberText.getText().toString());
                double number2 = Double.parseDouble(secondNumberText.getText().toString());
                double result = number1 - number2 ;

                resultTextView.setText(String.format("%s", result));
            }
        });
        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText firstNumberText = findViewById(R.id.firstNumberText);
                EditText secondNumberText = findViewById(R.id.secondNumberText);
                TextView resultTextView = findViewById(R.id.resultTextView);

                double number1 = Double.parseDouble(firstNumberText.getText().toString());
                double number2 = Double.parseDouble(secondNumberText.getText().toString());
                double result = number1 * number2 ;

                resultTextView.setText(String.format("%s", result));
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText firstNumberText = findViewById(R.id.firstNumberText);
                EditText secondNumberText = findViewById(R.id.secondNumberText);
                TextView resultTextView = findViewById(R.id.resultTextView);

                double number1 = Double.parseDouble(firstNumberText.getText().toString());
                double number2 = Double.parseDouble(secondNumberText.getText().toString());
                double result = number1 / number2 ;

                resultTextView.setText(String.format("%s", result));
            }
        });

    }
}
