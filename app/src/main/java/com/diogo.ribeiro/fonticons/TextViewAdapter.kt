package com.diogo.ribeiro.fonticons

import android.graphics.Color
import android.graphics.Typeface
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class TextViewAdapter(
    private val icons: Array<String>
): RecyclerView.Adapter<TextViewAdapter.TextViewHolder>() {

    class TextViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.icon_item, parent, false) as TextView
//            .inflate(R.layout.icon_custom_item, parent, false) as TextView
        with(textView) {
            textSize = Random.nextDouble(14.0, 100.0).toFloat()
            setTextColor(Color.parseColor(colors[Random.nextInt(0, 5)]))
        }
        return TextViewHolder(textView)
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.textView.text = icons[position]
    }

    override fun getItemCount() = icons.size
}

private val colors = listOf<String>(
    "#00FF00", "#008000", "#00FFFF", "#00FFFF", "#FF0000", "#FFFF00"
)