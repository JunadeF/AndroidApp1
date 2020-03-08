package zm.hashcode.appctivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        message = getIntent().getStringExtra("KEY");
        TextView textView = findViewById(R.id.second_textView);
        textView.setText(message);

        final Button button = findViewById(R.id.second_button);
        final String text = " Second  Message  Added ";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                Log.d(" SECOND", " EROOR!!!!!!");
                message = message+","+ text ;
                intent.putExtra("KEY", message);
                startActivity(intent);
            }
        });

    }
}
