package hr.fer.ruazosa.if47987.caraccident.caraccident;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class VehicleA extends AppCompatActivity {

    private static Button voziloBstep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_a);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        onClickButtonListenerB();
    }

    public void onClickButtonListenerB(){
        voziloBstep = (Button)findViewById(R.id.VoziloBButton);
        voziloBstep.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(VehicleA.this, VehicleB.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
