package com.dimensiva.ecommerce.bindings

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.dimensiva.ecommerce.R

@BindingAdapter("android:setImage")
fun setItemImage(view: ImageView, image: String) {
    try {

        Glide.with(view.context).load(image)
            .thumbnail(0.5f)
            .dontAnimate()
            .placeholder(R.drawable.ic_launcher_background)
            .into(view)

    } catch (e: Exception) {
        println("No se puede cargar la imagen")
    }
}