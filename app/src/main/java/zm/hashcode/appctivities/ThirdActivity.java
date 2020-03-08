package zm.hashcode.appctivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        message = getIntent().getStringExtra("KEY");
        TextView textView = findViewById(R.id.third_textView);
        textView.setText(message);

        final Button button = findViewById(R.id.third_button);
        final String text = " Third Message  Added ";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                message = message+","+ text ;
                intent.putExtra("KEY" ,message);
                startActivity(intent);
            }
        });
    }
}
