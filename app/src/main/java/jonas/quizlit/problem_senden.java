package jonas.quizlit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class problem_senden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_senden);
        Button btSenden;
        final EditText eTFrage;
         final EditText eTAntworten;

       final Intent emailintent = new Intent(Intent.ACTION_SEND);
            btSenden = (Button) findViewById(R.id.btSenden);
            eTFrage = (EditText) findViewById(R.id.eTFrage);
            eTAntworten = (EditText) findViewById(R.id.eTAntwort);





            btSenden.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String betreff = eTFrage.getText().toString();
                    String details = eTAntworten.getText().toString();




                    emailintent.setType("plain/text");
                    emailintent.putExtra(Intent.EXTRA_EMAIL , new String[]{"teamquizlit@gmail.com"});
                    emailintent.putExtra(Intent.EXTRA_SUBJECT, betreff);
                    emailintent.putExtra(Intent.EXTRA_TEXT, details);

                    startActivity(Intent.createChooser(emailintent, "Sende diese Nachricht über: "));
                }
            });


        }



    private void backtohome() {
        Intent intent = new Intent(problem_senden.this, MainActivity.class);
        startActivity(intent);
    }
    }

