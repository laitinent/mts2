package fi.hamk.riksu.mts2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    TextView tv;

    ArrayList<String> lisukkeet = new ArrayList<>();
    ArrayList<String> proteiinit = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)this.findViewById(R.id.button);
        tv = (TextView)this.findViewById(R.id.textView);
        creatLists();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = lisukkeet.get((int)(Math.random()*lisukkeet.size()));
                String b = proteiinit.get((int)(Math.random()*proteiinit.size()));
                tv.setText(b+" ja "+a);
            }
        });
    }

    private void creatLists() {
        lisukkeet.add("perunaa");
        lisukkeet.add("riisiä");
        lisukkeet.add("pastaa");
        lisukkeet.add("leipää");

        proteiinit.add("Nautaa");
        proteiinit.add("Kalaa");
        proteiinit.add("Kanaa");
        proteiinit.add("Possua");
        proteiinit.add("Makkaraa");
        proteiinit.add("Jauhelihaa");
    }
}
