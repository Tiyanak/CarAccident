package hr.fer.ruazosa.if47987.caraccident.caraccident;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class VehicleB extends AppCompatActivity {

    private static Button okolnosti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        onClickButtonListenerON();

    }

    public void onClickButtonListenerON(){
        okolnosti = (Button)findViewById(R.id.VoziloBButton);
        okolnosti.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(VehicleB.this, OkolnostiNesrece.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
