package com.tanvir.training.actioninputsbatch04

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:setFavoriteIcon")
fun setFavoriteIcon(imageView: ImageView, favorite: Boolean) {
    if (favorite) {
        imageView.setImageResource(R.drawable.ic_baseline_favorite_24_red)
    } else {
        imageView.setImageResource(R.drawable.ic_baseline_favorite_24_grey)
    }
}