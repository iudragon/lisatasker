package np.ssamja.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import np.ssamja.myapplication.R;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        getSupportActionBar().setTitle("");
    }
}
