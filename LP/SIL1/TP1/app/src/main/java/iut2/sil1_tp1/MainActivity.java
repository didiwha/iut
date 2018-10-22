package iut2.sil1_tp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    // ID REQUETES
    public final static int EXERCICE_1_ACTIVITY_REQUEST = 0;
    public final static int EXERCICE_2_ACTIVITY_REQUEST = 1;
    public final static int EXERCICE_3_ACTIVITY_REQUEST = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onExercice1(View view) {

        // Création d'un intent et lancement de la demande de changement d'activity
        Intent Exercice1ViewActivityIntent = new Intent(MainActivity.this, Exercice1Activity.class);
        startActivityForResult(Exercice1ViewActivityIntent, EXERCICE_1_ACTIVITY_REQUEST);
    }

    public void onExercice2(View view) {

        // Création d'un intent et lancement de la demande de changement d'activity
        Intent Exercice2EventActivityIntent = new Intent(MainActivity.this, Exercice2Activity.class);
        startActivityForResult(Exercice2EventActivityIntent, EXERCICE_2_ACTIVITY_REQUEST);
    }

    public void onExercice3(View view) {

        // Création d'un intent et lancement de la demande de changement d'activity
        Intent Exercice3EventActivityIntent = new Intent(MainActivity.this, Exercice3Activity.class);
        startActivityForResult(Exercice3EventActivityIntent, EXERCICE_3_ACTIVITY_REQUEST);
    }
}
