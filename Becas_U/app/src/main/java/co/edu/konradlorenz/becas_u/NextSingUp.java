package co.edu.konradlorenz.becas_u;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextSingUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Set up the login form.
        //Copiar estas lineas
        Intent intent = getIntent();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setTitle("Selecciona las notificaciones");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_sing_up);

        final Button Next_but = (Button) findViewById(R.id.Next_button);
        Next_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InfoBeca.class);
                startActivity(intent);
                //LoginActivity.this.startActivity(intent);
            }
        });
    }
}
