package udacity.nanodegree.android.p0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private View.OnClickListener onClickListener = new View.OnClickListener() {
        private static final String TAG = "MainActivity";

        @Override
        public void onClick(View v) {
            CharSequence projecdtName = ((Button) v).getText();
            Toast.makeText(MainActivity.this, "This button will launch " + projecdtName + " app", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onClick: " + v);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildButton(R.id.pop_movies_button, onClickListener);
        buildButton(R.id.stock_hawk_button, onClickListener);
        buildButton(R.id.built_it_bigger_button, onClickListener);
        buildButton(R.id.make_your_app_button, onClickListener);
        buildButton(R.id.go_ubiquitous_button, onClickListener);
        buildButton(R.id.capstone_button, onClickListener);
    }


    Button buildButton(int id, View.OnClickListener onClickListener) {
        Button button = (Button) findViewById(id);
        button.setOnClickListener(onClickListener);
        return button;
    }

}


