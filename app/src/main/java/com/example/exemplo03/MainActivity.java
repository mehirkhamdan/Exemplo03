package com.example.exemplo03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;




@SuppressLint("UseSwitchCompatOrMaterialCode")
public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private EditText editNome;
    private EditText editEmail;
    private EditText editTel;
    private RadioButton rbFem;
    private RadioButton rbMasc;
    private CheckBox cbMusica;
    private CheckBox cbCinema;
    private CheckBox cbEsporte;
    private CheckBox cbGastronomia;
    private Switch swtNotif;
    private Button btnExibir;
    private Button btnLimpar;
    private LinearLayout lnlExibir;
    private TextView txtNome;
    private TextView txtSexo;
    private TextView txtEmail;
    private TextView txtTel;
    private LinearLayout lnlCheck;
    private TextView txtMusica;
    private TextView txtCinema;
    private TextView txtGastronomia;
    private TextView txtNofif;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.edtNome);
        editEmail = findViewById(R.id.edtEmail);
        editTel = findViewById(R.id.edtTel);
        rbFem = findViewById(R.id.rdbFem);
        rbMasc = findViewById(R.id.rdbMasc);
        cbMusica = findViewById(R.id.ckbMusica);
        cbCinema = findViewById(R.id.ckbCinema);
        cbEsporte = findViewById(R.id.ckbEsporte);
        cbGastronomia = findViewById(R.id.ckbGastronomia);
        swtNotif = findViewById(R.id.swtNotif);
        btnExibir = findViewById(R.id.btnExibir);
        btnLimpar = findViewById(R.id.btnLimpar);
        lnlExibir = findViewById(R.id.lnlExibir);
        lnlCheck = findViewById(R.id.lnlCheck);
        txtNome = findViewById(R.id.txtNome);
        txtSexo = findViewById(R.id.txtSexo);
        txtEmail = findViewById(R.id.txtEmail);
        txtTel = findViewById(R.id.txtTel);
        txtMusica = findViewById(R.id.txtMusica);
        txtCinema = findViewById(R.id.txtCinema);
        txtGastronomia = findViewById(R.id.txtGastronomia);
        txtNofif = findViewById(R.id.txtNotif);

        btnExibir.setOnClickListener(this);
        btnLimpar.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnExibir){
            lnlExibir.setVisibility(View.VISIBLE);
            lnlCheck.setVisibility(View.VISIBLE);

            txtNome.setText(editNome.getText());

            boolean femChecked;
            if ((rbFem).isChecked()) femChecked = true;
            else femChecked = false;

            boolean mascChecked = (rbMasc).isChecked();

            if(femChecked) {
                txtSexo.setText(rbFem.getText());
            } else if(mascChecked){
                txtSexo.setText(rbMasc.getText());
            }

            txtEmail.setText(editEmail.getText());

            txtTel.setText(editTel.getText());

            boolean musChecked;
            if ((cbMusica).isChecked()) musChecked = true;
            else musChecked = false;

            boolean cinChecked;
            if ((cbCinema).isChecked()) cinChecked = true;
            else cinChecked = false;

            boolean gasChecked;
            if ((cbGastronomia).isChecked()) gasChecked = true;
            else gasChecked = false;


            if (musChecked) {
                txtMusica.setText(cbMusica.getText());
            } else if (cinChecked) {
                txtCinema.setText(cbCinema.getText());
            } else if (gasChecked) {
                txtGastronomia.setText(cbGastronomia.getText());
            }

            String statusOn , statusOff;
            if(swtNotif.isChecked()) {
                statusOn = swtNotif.getTextOn().toString();
            } else {
                statusOff = swtNotif.getTextOff().toString();
            }







        }
        else if (view.getId() == R.id.btnLimpar){
            lnlExibir.setVisibility(View.INVISIBLE);
            editNome.setText("");
            editEmail.setText("");
            editTel.setText("");
            rbFem.setChecked(false);
            rbMasc.setChecked(false);
            cbCinema.setChecked(false);
            cbEsporte.setChecked(false);
            cbGastronomia.setChecked(false);
            cbMusica.setChecked(false);
            swtNotif.setChecked(false);
        }

    }


}