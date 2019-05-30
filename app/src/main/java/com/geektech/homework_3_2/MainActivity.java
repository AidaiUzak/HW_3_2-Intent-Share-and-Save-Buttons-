package com.geektech.homework_3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextSecondName;
    EditText editTextThirdName;
    Button share;
    Button save;

    static  public String textKey1 = "textKey_1";
    static  public String textKey2 = "textKey_2";
    static  public String textKey3 = "textKey_3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.name_text_view);
        editTextSecondName = findViewById(R.id.second_name_text_view);
        editTextThirdName = findViewById(R.id.third_name_text_view);
        share = findViewById(R.id.share);
        save = findViewById(R.id.save);

    }

    public void onButtonClick(View view) {
        if (view==save) {
            Intent intent = new Intent(this, SaveActivity.class);

            String nameText1 = editTextName.getText().toString();
            intent.putExtra (MainActivity.textKey1, nameText1);

            String nameText2 = editTextSecondName.getText().toString();
            intent.putExtra (MainActivity.textKey2, nameText2);

            String nameText3 = editTextThirdName.getText().toString();
            intent.putExtra (MainActivity.textKey3, nameText3);

            startActivity(intent);

        } else if (view == share) {
            Intent intent =new Intent ();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, (editTextName.getText().toString() + " "
                    + editTextSecondName.getText().toString() + " " +
                    editTextThirdName.getText().toString()));
            intent.setType("text/plain");

            if (intent.resolveActivity(getPackageManager()) !=null) {
                startActivity(intent);
            }

        }
    }
}
