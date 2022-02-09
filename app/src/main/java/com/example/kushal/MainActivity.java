package com.example.kushal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginFragment(View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View customView = layoutInflater.inflate(R.layout.fragment_login, null);
        alertDialog.setView(customView);
        AlertDialog dialog = alertDialog.create();
        dialog.show();

        customView.findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText username = customView.findViewById(R.id.username);
                EditText password = customView.findViewById(R.id.password);

                if(username.getText().toString().equals("admin@gmail.com")) {
                    if(password.getText().toString().equals("admin")) {
                        Toast.makeText(getApplicationContext(), "Login Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                        intent.putExtra("username", username.getText().toString());
                        startActivity(intent);
                        dialog.dismiss();
                    }
                }
                dialog.dismiss();
            }
        });

    }

    public void goActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(intent);
    }
}