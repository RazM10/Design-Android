package org.myself.designandroidapptwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSignUpActivity(View view) {
        startActivity(new Intent(this, SignUpActivity.class));
    }

    public void goToHomeActivity(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }

    public void goToProductActivity(View view) {
        startActivity(new Intent(this, ProductActivity.class));
    }
}
