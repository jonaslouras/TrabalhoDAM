package devapp.upt.siupt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.HandlerCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    ExecutorService executorService;
    Handler mainThreadHandler;
    TextView textViewLogin;
    TextView textViewPass;
    EditText txtUser;
    String user;
    EditText txtPass;
    String pass;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        executorService = Executors.newFixedThreadPool(4); //Define o número de threads
        mainThreadHandler = HandlerCompat.createAsync(Looper.getMainLooper());

        txtUser = findViewById(R.id.editTextTextPersonName); //selecionar o id da view para obter username
        user = txtUser.getText().toString(); //obter username

        txtPass = findViewById(R.id.editTextTextPassword); //seleciona o id da view para obter password
        pass = txtPass.getText().toString(); //obter password

        Button btnLogin = (Button) findViewById(R.id.buttonLogin); //seleciona o botão de login
        btnLogin.setOnClickListener(this::login); //chama função de login

        url = "http://alunos.upt.pt/~abilioc/dam.php?func=auth&login="+textViewLogin+"&password="+textViewPass;


    }

    public void login(View view) {

        url = "http://alunos.upt.pt/~abilioc/dam.php?func=auth&login="+user+"&password="+pass;
        Intent login = new Intent(this,MenuPrincipal.class); //indicação da atividade a abrir
        startActivity(login); //abertura da atividade
    }
}