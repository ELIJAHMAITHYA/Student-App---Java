package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Integer x, y, z;
    EditText editText;
    EditText editText2;
    Button button;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        button = findViewById(R.id.button);
        editText3 = findViewById(R.id.editTextText3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student();
                student.name = "Sila";
                student.idno = Integer.parseInt(editText2.getText().toString());
                student.gender = "Male";
                editText.setText(student.Display());
                Toast.makeText(MainActivity.this, "Student Id is" + student.idno.toString(), Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "The sum  is" + Add(24, 4).toString(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                String NetIncome = String.valueOf(editText3.getText());
                if (NetIncome.isEmpty()) {
                    editText3.setError("Input Error");
                    editText3.requestFocus();
                    return;
                }
                intent.putExtra("NetIncome", NetIncome);


            }
        });


    }

    Integer Add(int first, int second) {
        return (first + second);
    }
}