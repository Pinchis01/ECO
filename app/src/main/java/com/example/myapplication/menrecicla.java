package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class menrecicla extends AppCompatActivity {


    String[] items =  {"Plastico","Papel y Carton"};
    AutoCompleteTextView autoCompleteTxt;
    ArrayAdapter<String> adapterItems;

    private Button AlertaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menrecicla);

        autoCompleteTxt = findViewById(R.id.auto_complete_txt);

        adapterItems = new ArrayAdapter<String>(this,R.layout.lista_item,items);
        autoCompleteTxt.setAdapter(adapterItems);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Item: "+item,Toast.LENGTH_SHORT).show();
            }
        });


    AlertaBtn = (Button) findViewById(R.id.ingreso);

    AlertaBtn.setOnClickListener(new View.OnClickListener(){

        public void onClick (View view){

            AlertDialog.Builder alerta = new AlertDialog.Builder(menrecicla.this);
            alerta.setMessage("¿Quieres seguir reciclando?")
                    .setCancelable(true)
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {

                            dialog.cancel();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {

                            finish();

                        }
                    });

            AlertDialog totalreciclado = alerta.create();
            totalreciclado.setTitle("Felicitaciones ganaste $$$");
            totalreciclado.show();


        }

    });




    }
    public void onClick2 (View view){

        Intent miInten=new Intent(menrecicla.this,menuapp.class);
        startActivity(miInten);

    }
}