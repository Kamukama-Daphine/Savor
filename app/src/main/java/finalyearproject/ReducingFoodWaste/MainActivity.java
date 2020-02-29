package finalyearproject.ReducingFoodWaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextToSpeech tts1;
    private int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tts1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    result = tts1.setLanguage(Locale.UK);
                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "This Language is not supported");
                    }
                    speak("Welcome to Reducing Food Waste App");
                } else {
                    Log.e("TTS", "Initialization Failed");
                }
            }
        });

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(1700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(new Intent(MainActivity.this, SignIn.class));
                    finish();
                }
            }
        };
        timer.start();
    }
    private void speak(String text) {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            tts1.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
        }
        else {
            tts1.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        }

    }

    @Override
    public void onDestroy() {
        if (tts1 != null) {
            tts1.stop();
            tts1.shutdown();
        }
        super.onDestroy();
    }
}
