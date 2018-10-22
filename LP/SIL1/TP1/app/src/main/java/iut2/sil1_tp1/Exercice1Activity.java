package iut2.sil1_tp1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.*;
import android.view.MenuItem;
import android.widget.TextView;


public class Exercice1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On charge le XML pour créer l'arbre graphique
        setContentView(R.layout.activity_exercice1);

    }

    public void exercice1Valider(View view){
        TextView hello=(TextView) findViewById(R.id.exercice1_p);
        TextView prenom=(TextView) findViewById(R.id.exercice1_prenom);
        if (!TextUtils.isEmpty(prenom.getText())){
            hello.setText("Hello "+prenom.getText());
        }
    }
}
