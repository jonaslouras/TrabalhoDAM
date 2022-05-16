package devapp.upt.siupt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void onClickUcsPage(View view){
        Intent ucs = new Intent(this, UCsInscrito.class);
        startActivity(ucs);
    }

    public void onClickSchedule(View view){
        Intent ucs = new Intent(this, Horario.class);
        startActivity(ucs);
    }

}