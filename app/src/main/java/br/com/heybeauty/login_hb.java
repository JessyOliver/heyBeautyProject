package br.com.heybeauty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import br.com.heybeauty.cadastro.Cadastro;

public class login_hb extends AppCompatActivity {

    Button btnEntrar;
//    TextView txCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_hb);

            //Ir para a tela Home
        btnEntrar = (Button)findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip = new Intent(login_hb.this, Cadastro.class);
                startActivity(ip);
            }
        });

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
