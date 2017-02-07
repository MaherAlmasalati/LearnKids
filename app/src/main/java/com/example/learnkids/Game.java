package com.example.learnkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Game extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    ArrayList<pic> p,p2;
    pic item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        p=new ArrayList<pic>();
        p2=new ArrayList<pic>();
        p.add(new pic(R.drawable.lionp,R.raw.alf));
        p.add(new pic(R.drawable.duckp,R.raw.ba));
        p.add(new pic(R.drawable.tajp,R.raw.ta));
        p.add(new pic(R.drawable.snakep,R.raw.tha));
        p.add(new pic(R.drawable.jamalp,R.raw.jamal));
        p.add(new pic(R.drawable.hamamap,R.raw.hamama));
        p.add(new pic(R.drawable.kharofp,R.raw.kharof));
        p.add(new pic(R.drawable.dopp,R.raw.dob));
        p.add(new pic(R.drawable.zorap,R.raw.zora));
        p.add(new pic(R.drawable.romanp,R.raw.roman));
        p.add(new pic(R.drawable.zahrap,R.raw.zahra));
        p.add(new pic(R.drawable.solhfap,R.raw.solhofa));
        p.add(new pic(R.drawable.shamsp,R.raw.shams));
        p.add(new pic(R.drawable.saqerp,R.raw.saqer));
        p.add(new pic(R.drawable.dabetp,R.raw.dabet));
        p.add(new pic(R.drawable.tarahp,R.raw.tarah));
        p.add(new pic(R.drawable.zarfp,R.raw.zarf1));
        p.add(new pic(R.drawable.alamp,R.raw.alan));
        p.add(new pic(R.drawable.orabp,R.raw.orab));
        p.add(new pic(R.drawable.fahedp,R.raw.fahed));
        p.add(new pic(R.drawable.kerdp,R.raw.kerd));
        p.add(new pic(R.drawable.kalebp,R.raw.kaleb));
        p.add(new pic(R.drawable.lemonp,R.raw.lemon));
        p.add(new pic(R.drawable.mozp,R.raw.moz));
        p.add(new pic(R.drawable.nemrp,R.raw.nemr));
        p.add(new pic(R.drawable.hodhodp,R.raw.hodhod));
        p.add(new pic(R.drawable.wezap,R.raw.wza));
        p.add(new pic(R.drawable.yadp,R.raw.yad));
        p2.add(new pic(R.drawable.lionp));
        p2.add(new pic(R.drawable.duckp));
        p2.add(new pic(R.drawable.tajp));
        p2.add(new pic(R.drawable.snakep));
        p2.add(new pic(R.drawable.jamalp));
        p2.add(new pic(R.drawable.hamamap));
        p2.add(new pic(R.drawable.kharofp));
        p.add(new pic(R.drawable.dopp));
        p2.add(new pic(R.drawable.zorap));
        p2.add(new pic(R.drawable.romanp));
        p2.add(new pic(R.drawable.zahrap));
        p2.add(new pic(R.drawable.solhfap));
        p2.add(new pic(R.drawable.shamsp));
        p2.add(new pic(R.drawable.saqerp));
        p2.add(new pic(R.drawable.dabetp));
        p2.add(new pic(R.drawable.tarahp));
        p2.add(new pic(R.drawable.zarfp));
        p2.add(new pic(R.drawable.alamp));
        p2.add(new pic(R.drawable.orabp));
        p2.add(new pic(R.drawable.fahedp));
        p2.add(new pic(R.drawable.kerdp));
        p2.add(new pic(R.drawable.kalebp));
        p2.add(new pic(R.drawable.lemonp));
        p2.add(new pic(R.drawable.mozp));
        p2.add(new pic(R.drawable.nemrp));
        p2.add(new pic(R.drawable.hodhodp));
        p2.add(new pic(R.drawable.wezap));
        p2.add(new pic(R.drawable.yadp));
        ImageView up= (ImageView) findViewById(R.id.up);
        ImageView mid= (ImageView) findViewById(R.id.mid);
        ImageView bot= (ImageView) findViewById(R.id.bot);

        Random random=new Random();
        int i=random.nextInt(p.size());
        item = p.get(i);
        mediaPlayer = new MediaPlayer().create(Game.this,item.voice);
        mediaPlayer.start();

        up.setImageResource(item.pic);
        int x=random.nextInt(p2.size());
        int y=random.nextInt(p2.size());
      //  pic item2 = p2.get(y);
        mid.setImageResource(p2.get(y).pic);
        bot.setImageResource(p2.get(x).pic);

        ImageView home= (ImageView) findViewById(R.id.homep);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Game.this,Home.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
