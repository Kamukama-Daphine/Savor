package finalyearproject.ReducingFoodWaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DonorSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_settings);
    }

    public void editprofile(View view) {
        startActivity(new Intent(DonorSettings.this, EditProfile.class));
    }

    public void logout(View view) {
        startActivity(new Intent(DonorSettings.this, SignIn.class));
    }
}
