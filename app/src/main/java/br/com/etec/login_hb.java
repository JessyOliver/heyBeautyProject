package br.com.etec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login_hb extends AppCompatActivity {

    Button btnEntrar;
    TextView txCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_hb);

            //Ir para a tela Home
      /*  btnEntrar = (Button)findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip = new Intent(login_hb.this, home.class);
                startActivity(ip);
            }
        });*/

     /* txCadastro = (TextView) findViewById(R.id.txtCadastro);

      txCadastro.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent cd = new Intent(login_hb.this, Cadastro.class);
              startActivity(cd);
          }
      });*/
    }
}
