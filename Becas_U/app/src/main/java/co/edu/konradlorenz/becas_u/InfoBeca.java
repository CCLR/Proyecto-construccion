package co.edu.konradlorenz.becas_u;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoBeca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_beca);
        // Set up the login form.
        //Copiar estas lineas
        Intent intent = getIntent();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setTitle("Info de la Beca.");
        //ssssssss

        final Button butInfoCom = (Button) findViewById(R.id.buttonInfoCompleta);
        butInfoCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), infoEntidad.class);
                startActivity(intent);
            }
        });

    }
}
