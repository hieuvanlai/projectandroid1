package tabian.com.actionbartest;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    Button start;
    Spinner spinner;



    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
//        spinner = (Spinner) findViewById(R.id.spinner1);
//        ArrayList<PCTYPE> pctypes = new ArrayList<>();
//        pctypes.add(new PCTYPE(R.drawable.gamepad,"PC Gaming"));
//        pctypes.add(new PCTYPE(R.drawable.video_player,"PC Multimedia"));
//        pctypes.add(new PCTYPE(R.drawable.workstation,"PC Gaming"));
//        pctypes.add(new PCTYPE(R.drawable.fax,"PC Office"));
//
//        PcTypeAdapter pctypeAdapter = new PcTypeAdapter();
//        spinner.setAdapter();



        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner

        spinner.setAdapter(adapter);

        start = (Button) findViewById(R.id.bt_startReading);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startReading();
            }
        });


    }

    private void setupViewPager(ViewPager viewPager) {


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_startReading:
                startReading();
                break;

        }

    }

    private void startReading() {
        startActivity(new Intent(MainActivity.this,Main3Activity.class));

    }
}
