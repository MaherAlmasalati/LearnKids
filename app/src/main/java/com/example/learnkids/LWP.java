package com.example.learnkids;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

import static com.example.learnkids.R.drawable.next;


public class LWP extends AppCompatActivity {
    ArrayList<pic> p;
     int i=0;
    int y;
    int remaining = 10;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lwp);
         p=new ArrayList<pic>();
        p.add(new pic(R.drawable.a,R.drawable.lion,R.drawable.lionp,R.raw.alf));
        p.add(new pic(R.drawable.b,R.drawable.duck,R.drawable.duckp,R.raw.ba));
        p.add(new pic(R.drawable.c,R.drawable.taj,R.drawable.tajp,R.raw.ta));
        p.add(new pic(R.drawable.d,R.drawable.snak,R.drawable.snakep,R.raw.tha));
        p.add(new pic(R.drawable.jem,R.drawable.jamal,R.drawable.jamalp,R.raw.jamal));
        p.add(new pic(R.drawable.ha,R.drawable.hamama,R.drawable.hamamap,R.raw.hamama));
        p.add(new pic(R.drawable.ka,R.drawable.kharof,R.drawable.kharofp,R.raw.kharof));
        p.add(new pic(R.drawable.dal,R.drawable.dop,R.drawable.dopp,R.raw.dob));
        p.add(new pic(R.drawable.za,R.drawable.zora,R.drawable.zorap,R.raw.zora));
        p.add(new pic(R.drawable.ra,R.drawable.roman,R.drawable.romanp,R.raw.roman));
        p.add(new pic(R.drawable.zay,R.drawable.zahra,R.drawable.zahrap,R.raw.zahra));
        p.add(new pic(R.drawable.sen,R.drawable.solhfa,R.drawable.solhfap,R.raw.solhofa));
        p.add(new pic(R.drawable.shen,R.drawable.shams,R.drawable.shamsp,R.raw.shams));
        p.add(new pic(R.drawable.sad,R.drawable.saqer,R.drawable.saqerp,R.raw.saqer));
        p.add(new pic(R.drawable.dad,R.drawable.dabet,R.drawable.dabetp,R.raw.dabet));
        p.add(new pic(R.drawable.ta,R.drawable.tarah,R.drawable.tarahp,R.raw.tarah));
        p.add(new pic(R.drawable.zza,R.drawable.zarf,R.drawable.zarfp,R.raw.zarf1));
        p.add(new pic(R.drawable.en,R.drawable.alam,R.drawable.alamp,R.raw.alan));
        p.add(new pic(R.drawable.een,R.drawable.orab,R.drawable.orabp,R.raw.orab));
        p.add(new pic(R.drawable.fa,R.drawable.fahed,R.drawable.fahedp,R.raw.fahed));
        p.add(new pic(R.drawable.kaf,R.drawable.kerd,R.drawable.kerdp,R.raw.kerd));
        p.add(new pic(R.drawable.k,R.drawable.kaleb,R.drawable.kalebp,R.raw.kaleb));
        p.add(new pic(R.drawable.lam,R.drawable.lemon,R.drawable.lemonp,R.raw.lemon));
        p.add(new pic(R.drawable.mem,R.drawable.moz,R.drawable.mozp,R.raw.moz));
        p.add(new pic(R.drawable.non,R.drawable.nemr,R.drawable.nemrp,R.raw.nemr));
        p.add(new pic(R.drawable.haa,R.drawable.hodhod,R.drawable.hodhodp,R.raw.hodhod));
        p.add(new pic(R.drawable.waw,R.drawable.weza,R.drawable.wezap,R.raw.wza));
        p.add(new pic(R.drawable.ya,R.drawable.yad,R.drawable.yadp,R.raw.yad));


        final ImageView letter = (ImageView) findViewById(R.id.let);
        final ImageView word = (ImageView) findViewById(R.id.wor);
        final ImageView pic = (ImageView) findViewById(R.id.pic);
        ImageView next = (ImageView) findViewById(R.id.Next);

        letter.setImageResource(p.get(i).letter);
        word.setImageResource(p.get(i).word);
        pic.setImageResource(p.get(i).pic);
        mediaPlayer = new MediaPlayer().create(LWP.this,p.get(i).voice);
        mediaPlayer.start();
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.stop();
                    i++;
                  if(i<28) {
                      letter.setImageResource(p.get(i).letter);
                      word.setImageResource(p.get(i).word);
                      pic.setImageResource(p.get(i).pic);
                      mediaPlayer = new MediaPlayer().create(v.getContext(), p.get(i).voice);
                      mediaPlayer.start();
                  }else if(i==28){
                        i = 0;
                        letter.setImageResource(p.get(i).letter);
                        word.setImageResource(p.get(i).word);
                        pic.setImageResource(p.get(i).pic);
                        mediaPlayer = new MediaPlayer().create(v.getContext(), p.get(i).voice);
                        mediaPlayer.start();
                    }
                }
            });
        ImageView home= (ImageView) findViewById(R.id.homep);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LWP.this,Home.class);
                startActivity(intent);
                finish();
            }
        });

    }

}
