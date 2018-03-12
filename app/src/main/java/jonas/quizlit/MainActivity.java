package jonas.quizlit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bTFragen;
    Button btSpielen;
    TextView tVProblem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tVProblem = (TextView) findViewById(R.id.tVProblem);
        btSpielen= (Button) findViewById(R.id.btSpielen);
        bTFragen = (Button) findViewById(R.id.bTFragen);
        btSpielen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ModusWahl.class);
                startActivity(intent);
            }


        });
        bTFragen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,frage_einsenden.class);
                startActivity(intent);
            }
        });


    }
}
