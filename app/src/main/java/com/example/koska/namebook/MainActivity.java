package com.example.koska.namebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private People people;
    private EditText txtName, txtPhone, txtEmail, txtText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.etName);
        txtPhone = findViewById(R.id.etPhone);
        txtEmail = findViewById(R.id.etEmail);
        txtText = findViewById(R.id.etText);
    }

    public void onClear(View view) {}

    public void onSave(View view) {}

    public void onShow(View view) {
        Intent intent = new Intent( MainActivity.this, ShowActivity.class);
        intent.putExtra(name"persons" people);
        startActivity(intent);
    }

    public void clear{}{
        txtName.setText("");
        txtPhone.setText("");
        txt.setText("");
        txtName.setText("");

    }
public void clear(){....}
}

registerForContextMenu(view);
