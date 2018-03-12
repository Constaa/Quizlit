package jonas.quizlit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class frage_einsenden extends AppCompatActivity {
    Button btSenden;
    EditText eTFrage;
    EditText eTAntworten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frage_einsenden);
        final Intent emailintent = new Intent(Intent.ACTION_SEND);
        btSenden = (Button) findViewById(R.id.btSenden);
        eTFrage = (EditText) findViewById(R.id.eTFrage);
        eTAntworten = (EditText) findViewById(R.id.eTAntwort);





        btSenden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = eTFrage.getText().toString();
                String details = eTAntworten.getText().toString();




                emailintent.setType("plain/text");
                emailintent.putExtra(Intent.EXTRA_EMAIL , new String[]{"jonas.dietsche@gmx.net"});
                emailintent.putExtra(Intent.EXTRA_SUBJECT, "Einsendung einer Frage");
                emailintent.putExtra(Intent.EXTRA_TEXT, "Frage:"+email+'\n'+"Antworten:"+'\n'+details);

                startActivity(Intent.createChooser(emailintent, "Sende diese Nachricht über: "));
            }
        });


    }



    private void backtohome() {
        Intent intent = new Intent(frage_einsenden.this, MainActivity.class);
        startActivity(intent);
    }
}

