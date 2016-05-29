package hr.fer.ruazosa.if47987.caraccident.caraccident;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button NovoIzvj;
    private static Button StaroIzvj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onClickButtonListener1();
    }

    public void onClickButtonListener1(){
        NovoIzvj = (Button)findViewById(R.id.NovoIzvjButton);
        NovoIzvj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, PrimaryData.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
