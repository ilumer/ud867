package github.ilumer.androidjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.SampleJoke;

public class JokeActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView displayJoke = (TextView) findViewById(R.id.display_joke);
    displayJoke.setText(SampleJoke.disPlayJoke());
  }
}
