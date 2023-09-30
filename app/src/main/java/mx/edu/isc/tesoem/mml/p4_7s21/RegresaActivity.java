package mx.edu.isc.tesoem.mml.p4_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegresaActivity extends  AppCompatActivity{

    Button btnok, btncancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regresa);

        btnok = findViewById(R.id.p4btnok);
        btncancel = findViewById(R.id.p4btncancel);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_OK);
                finish();
            }
        });

        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }

}
