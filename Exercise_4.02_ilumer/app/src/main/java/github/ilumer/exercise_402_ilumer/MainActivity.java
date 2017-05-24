package github.ilumer.exercise_402_ilumer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.JokeSmith;
import com.example.JokeWizard;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView textView = (TextView) findViewById(R.id.text);
    textView.setText(JokeSmith.getJoke());
    TextView wizard = (TextView) findViewById(R.id.wizard);
    wizard.setText(JokeWizard.getJoke());
  }
}
