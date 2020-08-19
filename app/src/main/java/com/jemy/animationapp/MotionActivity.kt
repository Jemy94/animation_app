package com.jemy.animationapp

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_motion.*

class MotionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion)
        title = "MotionLayout"
    }

   /* private fun rotateTheStar(){
        val rotate = ObjectAnimator.ofFloat(
            star, View.ROTATION,
             0f,1800f
        )
        rotate.duration = 20000
        rotate.start()
    }*/
}