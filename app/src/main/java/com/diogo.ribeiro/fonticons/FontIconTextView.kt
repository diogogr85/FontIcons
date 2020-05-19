package com.diogo.ribeiro.fonticons

import android.content.Context
import android.graphics.Typeface
import android.os.Build
import android.util.AttributeSet
import android.view.Gravity
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.res.ResourcesCompat

class FontIconTextView(
    context: Context,
    attrs: AttributeSet? = null
) : AppCompatTextView(context, attrs) {

    init {
        gravity = Gravity.CENTER
//        typeface = when {
//            Build.VERSION.SDK_INT >= Build.VERSION_CODES.O ->
//                resources.getFont(R.font.font_awesome)
//            else ->
//                Typeface.createFromAsset(context.assets, "font_awesome_assets.otf")
//        }

        typeface = ResourcesCompat.getFont(context, R.font.font_awesome)

    }

}