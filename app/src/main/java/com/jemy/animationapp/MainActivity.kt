package com.jemy.animationapp

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Property Animation"
        startVerticalAnimation()
        startHorizontalAnimation()
    }

    private fun throwTheStarVertical() {
        val container = star.parent as ViewGroup
        val containerW = container.width
        val containerH = container.height
        val newStar = AppCompatImageView(this)
        newStar.setImageResource(R.drawable.ic_star)
        newStar.layoutParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        val starW: Float = star.width.toFloat()
        val starH: Float = star.height.toFloat()
        container.addView(newStar)
        newStar.translationX = (containerW / 2f) - (starW / 2f)
        val verticalAnimate = ObjectAnimator.ofFloat(
            newStar, View.TRANSLATION_Y,
            -starH, (containerH / 2.0f) - (starH / 2f)
        )
        verticalAnimate.duration = 4500
        val rotate = ObjectAnimator.ofFloat(
            newStar, View.ROTATION,
            -1800f, 0f
        )
        rotate.duration = 12000
        verticalAnimate.start()
        rotate.start()
    }

    private fun throwTheStarHorizontal() {
        val container = star.parent as ViewGroup
        val containerW = container.width
        val containerH = container.height
        val newStar = AppCompatImageView(this)
        newStar.setImageResource(R.drawable.ic_star)
        newStar.layoutParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        val starWidth: Float = star.width.toFloat()
        val starHeight: Float = star.height.toFloat()
        container.addView(newStar)
        newStar.translationY = (containerH / 2f) - (starHeight / 2f)
        val horizontalAnimate = ObjectAnimator.ofFloat(
            newStar, View.TRANSLATION_X,
            -starWidth, (containerW / 2.0f) - (starWidth / 2f)
        )
        horizontalAnimate.duration = 2500
        val rotate = ObjectAnimator.ofFloat(
            newStar, View.ROTATION,
            -1800f, 0f
        )
        rotate.duration = 12000
        horizontalAnimate.start()
        rotate.start()
    }

    private fun startVerticalAnimation() {
        verticalAnimateButton.setOnClickListener {
            throwTheStarVertical()
        }
    }

    private fun startHorizontalAnimation() {
        horizontalAnimateButton.setOnClickListener {
            throwTheStarHorizontal()
        }
    }
}