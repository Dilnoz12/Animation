package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alpha.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha)
            image.startAnimation(animation)
        }
        combo.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_combo)
            image.startAnimation(animation)
        }
        rotate.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_rotate)
            animation.repeatCount=3
            animation.startOffset=2000
            image.startAnimation(animation)
        }
        scale.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale)
            image.startAnimation(animation)
        }
        trans.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_trans)
            image.startAnimation(animation)
        }
    }
}
