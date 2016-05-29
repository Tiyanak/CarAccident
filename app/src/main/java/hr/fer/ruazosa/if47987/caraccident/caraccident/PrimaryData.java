package hr.fer.ruazosa.if47987.caraccident.caraccident;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class PrimaryData extends AppCompatActivity {

    private static Button voziloAstep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_data);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        onClickButtonListenerA();

    }

    public void onClickButtonListenerA(){
        voziloAstep = (Button)findViewById(R.id.VoziloAButton);
        voziloAstep.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(PrimaryData.this, VehicleA.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
