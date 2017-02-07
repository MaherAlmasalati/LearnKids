package com.example.learnkids;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.provider.MediaStore;
import android.widget.ImageView;

/**
 * Created by PMC on 1/27/2017.
 */

public class pic {
    int letter,word,pic,voice;

    public pic(int letter, int word, int pic,int voice) {
        this.letter = letter;
        this.word = word;
        this.pic = pic;
        this.voice=voice;
    }

    public pic(int pic, int voice) {
        this.pic = pic;
        this.voice = voice;
    }

    public pic(int pic) {
        this.pic = pic;
    }
}
