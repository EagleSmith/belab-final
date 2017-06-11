package dots.adrianhsu.bioexp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btlistBtn;
    Button showChartBtn;
    Button disconBtn;
    Button weightBtn;
    Button oxygenBtn;
    Button bpmBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btlistBtn = (Button) findViewById(R.id.btlistBtn);
        showChartBtn = (Button) findViewById(R.id.showChartBtn);
        disconBtn = (Button) findViewById(R.id.disconBtn);
        weightBtn = (Button) findViewById(R.id.weightBtn);
        oxygenBtn = (Button) findViewById(R.id.oxygenBtn);
        bpmBtn = (Button) findViewById(R.id.bpmBtn);
        btlistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(), BtlistActivity.class);
                startActivity(intent);
            }
        });
        showChartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(), ShowChartActivity.class);
                startActivity(intent);
            }
        });

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(intent);
            }
        });

        oxygenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(), OxygenActivity.class);
                startActivity(intent);
            }
        });

        bpmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(), BPMActivity.class);
                startActivity(intent);
            }
        });
    }
}
