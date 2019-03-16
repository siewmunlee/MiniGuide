package com.miniguide.user.miniguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.Button;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.text.method.ScrollingMovementMethod;
public class ContentActivity extends AppCompatActivity {
    MediaPlayer mp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_content);

        TextView textView = (TextView) findViewById(R.id.text_info);
        textView.setMovementMethod(new ScrollingMovementMethod());

        final Button button = findViewById(R.id.exit_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mySuperIntent = new Intent(ContentActivity.this, MapActivity.class);
                startActivity(mySuperIntent);
            }
        });
        mp = MediaPlayer.create(this, R.raw.legends);
    }
    public void playSong(View v){
        mp.start();
    }

    public void stopSong(View v) {
        mp.stop();
        mp=MediaPlayer.create(this, R.raw.legends);
    }

}