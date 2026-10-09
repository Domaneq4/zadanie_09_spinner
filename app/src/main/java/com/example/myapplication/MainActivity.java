package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sprawdz(View view){
        String tekst1 = "Odpowiedź prawidłowa";
        String tekst2 = "Odpowiedź błędna";
        int duration = Toast.LENGTH_SHORT;
        TextView tekst = findViewById(R.id.kolor);
        Toast toast = Toast.makeText (this, tekst1, duration) ;
        Toast toast2 = Toast.makeText(this, tekst2, duration) ;
        Spinner kolor = findViewById(R.id.spiner);
        String wybor = String.valueOf(kolor.getSelectedItem());
        if(wybor.equals("zielony")){
            toast.show();
        }else{
            toast2.show();
        }
        tekst.setText(wybor);

    }
}

