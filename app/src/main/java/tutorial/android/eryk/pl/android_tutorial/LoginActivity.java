package tutorial.android.eryk.pl.android_tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Arrays;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("gównoa");
        setContentView(R.layout.activity_login);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        MySpinnerAdapter spinnerAdapter= new MySpinnerAdapter(this);
        spinnerAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
        spinnerAdapter.setValues(Arrays.asList(new Dupa(), new Dupa(), new Dupa(), new Dupa()));

    }
}
