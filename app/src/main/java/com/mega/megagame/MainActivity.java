package com.mega.megagame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText txtNumber;
    private Button btnComparer;
    private TextView lblResultat;
    private ProgressBar progressBar;
    private TextView lblHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //on initialise les attributs avec les donnees de lactivite
        txtNumber = (EditText) findViewById(R.id.txtNumber);
        btnComparer = (Button) findViewById(R.id.btnComparer);
        lblResultat = (TextView) findViewById(R.id.lblResultat);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        lblHistory = (TextView) findViewById(R.id.lblHistory);
        btnComparer.setOnClickListener(btnCompareListener);
        init();
    }

    private void init() {

    }

    private View.OnClickListener btnCompareListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i("DEBUG","Bouton clique");
        }
    };

}
