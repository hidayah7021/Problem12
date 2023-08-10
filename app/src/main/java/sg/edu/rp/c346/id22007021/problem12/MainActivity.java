package sg.edu.rp.c346.id22007021.problem12;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCancel;
    Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCancel = findViewById(R.id.btnCancel);
        btnDelete = findViewById(R.id.btnDelete);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setTitle("Danger");
                myBuilder.setMessage("Are you sure you want to discard the changes");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("DISCARD", null);

                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setTitle("Danger");
                myBuilder.setMessage("Are you sure you want to delete the changes");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("DELETE", null);

                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
            }
    }