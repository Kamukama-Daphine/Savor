package finalyearproject.ReducingFoodWaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homeuser extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeuser);
        View card1 = findViewById(R.id.card1);
        View card6 = findViewById(R.id.card6);

        card1.setOnClickListener(this);
        card6.setOnClickListener(this);


    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.card1:
                Intent intent = new Intent(Homeuser.this, RecipientList.class);
                startActivity(intent);
                break;
            case R.id.card6:
                Intent i = new Intent(Homeuser.this, DonorSettings.class);
                startActivity(i);
                break;

        }
    }
}

