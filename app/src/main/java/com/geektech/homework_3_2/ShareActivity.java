package com.geektech.homework_3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    TextView name_text_view_1_1;
    TextView second_name_text_view_2_2;
    TextView third_name_text_view_3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Intent intent = getIntent();
        String text = intent.getStringExtra(Intent.EXTRA_TEXT);

        name_text_view_1_1 = findViewById(R.id.name_text_view_1_1);
        name_text_view_1_1.setText(text);

        second_name_text_view_2_2 = findViewById(R.id.second_name_text_view_2_2);
        second_name_text_view_2_2.setText(text);

        third_name_text_view_3_3 = findViewById(R.id.third_name_text_view_3_3);
        third_name_text_view_3_3.setText(text);



    }
}
