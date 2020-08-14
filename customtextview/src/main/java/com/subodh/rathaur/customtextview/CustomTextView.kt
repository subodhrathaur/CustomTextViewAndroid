package com.subodh.rathaur.customtextview

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

/**
 * Created by Subodh Rathaur on 13/07/20.
 *
 * @Author Subodh Rathaur
 * @Email rathaurshivomsingh@gmail.com
 */
class CustomTextView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : AppCompatTextView(context, attrs) {
    private fun setCustomTypeFace(context: Context, path_font: String) {
        val typeFaces = Typeface.createFromAsset(context.assets, path_font)
        this.typeface = typeFaces
    }

    init {
        val array = context.obtainStyledAttributes(attrs,
                R.styleable.CustomTextViewStyle, 0, 0)
        val path_font = array.getString(R.styleable.CustomTextViewStyle_fontPath)
        array.recycle()
        if (path_font != null) {
            setCustomTypeFace(context, path_font)
        } else {
            setCustomTypeFace(context, "fonts/poppins_bold.ttf")
        }
    }
}