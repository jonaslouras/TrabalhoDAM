package devapp.upt.siupt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Horario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);
    }


    public void onClickBackArrowHorario(View view){
        Intent menuPrincipal = new Intent(this, MenuPrincipal.class);
        startActivity(menuPrincipal);
    }

}