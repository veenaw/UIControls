package com.example.android.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText editName, password;
    private Button btnClick;
    private CheckBox chkIos, chkAndroid, chkWindows;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnClickButton();
        addListenerOnSubmitButton();
        addListenerOnChkIos();

    }
    public void addListenerOnClickButton() {

        editName = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.txtPassword);
        btnClick = (Button) findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String str1 = password.getText().toString()+editName.getText().toString();
                Toast.makeText(MainActivity.this, str1,
                        Toast.LENGTH_SHORT).show();

            }

        });

    }
    public void addListenerOnSubmitButton() {


        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        chkIos = (CheckBox) findViewById(R.id.chkIos);
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkWindows = (CheckBox) findViewById(R.id.chkWindows);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            //Run when button is clicked
            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("IPhone check : ").append(chkIos.isChecked());
                result.append("\nAndroid check : ").append(chkAndroid.isChecked());
                result.append("\nWindows Mobile check :").append(chkWindows.isChecked());

                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();

            }
        });

    }
    public void addListenerOnChkIos() {

        chkIos = (CheckBox) findViewById(R.id.chkIos);

        chkIos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Try Android:),Android users are more honest and humble, A survey says!", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
