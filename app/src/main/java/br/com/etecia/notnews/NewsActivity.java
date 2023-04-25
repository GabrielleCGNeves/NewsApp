package br.com.etecia.notnews;

import androidx.appcompat.app.AppCompatActivity;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.SurfaceControl;
import android.view.View;


import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;


public class NewsActivity extends AppCompatActivity {

    TextView titMob;
    TextView titFar;
    TextView textMob;
    TextView textFar;

    LinearLayout layMob;
    LinearLayout layFar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_news);

        titMob = findViewById(R.id.idTitMob);
        textMob = findViewById(R.id.idTextMob);
        layMob = findViewById(R.id.idLayMob);

        titFar = findViewById(R.id.idTitFar);
        textFar = findViewById(R.id.idTextFar);
        layFar = findViewById(R.id.idLayFar);


    }

    public void expand(View view){
        int v = (textMob.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(layMob, new AutoTransition());
        titMob.setVisibility(v);
        textMob.setVisibility(v);

    }

    public void expand1(View view){
        int v = (textFar.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(layFar, new AutoTransition());
        titFar.setVisibility(v);
        textFar.setVisibility(v);
    }
}