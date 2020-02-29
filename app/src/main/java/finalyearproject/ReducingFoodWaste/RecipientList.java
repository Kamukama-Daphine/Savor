package finalyearproject.ReducingFoodWaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecipientList extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipients_list);
        View card1 = findViewById(R.id.makeappointment);

        card1.setOnClickListener(this);
//        View card2 = findViewById(R.id.calldoctor);
//        card2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.makeappointment:
                Intent intent = new Intent(RecipientList.this, RegisterRecipient.class);
                startActivity(intent);
                break;


        }
    }
}

