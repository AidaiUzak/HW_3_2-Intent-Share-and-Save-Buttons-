package com.geektech.homework_3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaveActivity extends AppCompatActivity {

    TextView name_text_view_1;
    TextView second_name_text_view_2;
    TextView third_name_text_view_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String nameText = getIntent().getStringExtra(MainActivity.textKey1);
        name_text_view_1 = findViewById(R.id.name_text_view_1);
        name_text_view_1.setText(nameText);

        String secondNameText = getIntent().getStringExtra(MainActivity.textKey2);
        second_name_text_view_2 = findViewById(R.id.second_name_text_view_2);
        second_name_text_view_2.setText(secondNameText);

        String thirdNameText = getIntent().getStringExtra(MainActivity.textKey3);
        third_name_text_view_3 = findViewById(R.id.third_name_text_view_3);
        third_name_text_view_3.setText(thirdNameText);






    }
}
