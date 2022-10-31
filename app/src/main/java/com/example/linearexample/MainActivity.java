package com.example.linearexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txtUsername, txtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Lier les objets composants aux réferences déclarés

        txtUsername = findViewById(R.id.txtusername);
        txtPassword = findViewById(R.id.txtpassword);

        btnLogin = findViewById(R.id.btnlogin);


        txtUsername.setText("new text ");

        //Associer mon ecouteur au bouton
        //Sol1
      //  btnLogin.setOnClickListener(new BtnListener(txtUsername));

       //Sol2
        // btnLogin.setOnClickListener(this);

        //sol3-classe interne
       // btnLogin.setOnClickListener(new BtnListener());

        //Sol4
        //classe interne anonyme
      /*  btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "le username anonyme: "+txtUsername.getText().toString(),
                        Toast.LENGTH_LONG).show();
            }
        });*/
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),
                "le username : "+txtUsername.getText().toString(),
                Toast.LENGTH_LONG).show();
    }

    public void cliquerBTNLogin(View v) {

        Toast.makeText(v.getContext(),
                "le username xml: "+txtUsername.getText().toString(),
                Toast.LENGTH_LONG).show();

        Intent intent =new Intent(this, CibleActivity.class);
        intent.putExtra("cle","text envoye a CibleActivite");
        startActivity(intent);
    }

    //classe interne
    class BtnListener implements View.OnClickListener {


        @Override
        public void onClick(View v) {

            Toast.makeText(v.getContext(), "le username : "+txtUsername.getText().toString(), Toast.LENGTH_LONG).show();
        }
    }
}


//La classe Ecouteur
class BtnListener implements View.OnClickListener {

    private EditText edit;
    public BtnListener(EditText edit)
    {
        this.edit=edit;
    }
    @Override
    public void onClick(View v) {

        Toast.makeText(v.getContext(), "le username : "+edit.getText().toString(), Toast.LENGTH_LONG).show();
    }
}