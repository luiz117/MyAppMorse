package com.luizao.myapplicationmorse.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.luizao.myapplicationmorse.R;
import com.luizao.myapplicationmorse.Utils.Dictionary;


public class MainActivity extends AppCompatActivity {

    private EditText txt;
    private TextView plainTextTranslated;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txtInput);
        plainTextTranslated = findViewById(R.id.PlainTextTranslated);
        Dictionary d = new Dictionary();
        txt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Dictionary d = new Dictionary();
                String morsed="";
                if(getInput()){

                    if(d.returnCode(txt.getText().toString())!=null){
                    plainTextTranslated.setText(d.returnCode(txt.getText().toString()));
                    }
                    else{
                        plainTextTranslated.setText("Invalid input2");
                    }
                }
                else{
                    plainTextTranslated.setText("Invalid input");
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }


    public boolean getInput(){
        if(txt.getText()== null && txt.getText().toString().equals(" ")&& txt.getText().toString().equals(null)) {
            {
                return false;
            }
        }
        return true;
    }

    public void aba(){
        Dictionary d = new Dictionary();
        //String morsed = getInput().toUpperCase();
        //plainTextTranslated.setText(d.returnCode(morsed));
    }
}