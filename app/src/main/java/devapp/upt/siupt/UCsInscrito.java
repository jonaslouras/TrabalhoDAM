package devapp.upt.siupt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UCsInscrito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucs_inscrito);
    }

    public void onClickBackArrowUcs(View view){
        Intent menuPrincipal = new Intent(this, MenuPrincipal.class);
        startActivity(menuPrincipal);
    }

}