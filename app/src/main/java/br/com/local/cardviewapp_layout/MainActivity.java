package br.com.local.cardviewapp_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cardTerra, cardUrano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardTerra = findViewById(R.id.idCardView_Terra);

        cardUrano = findViewById(R.id.idCardView_Urano);

        cardTerra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MostraPlaneta_Activity.class));
            }
        });
        cardUrano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no cartão de Urano",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}