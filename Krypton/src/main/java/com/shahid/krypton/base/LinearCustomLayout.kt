package com.shahid.krypton.base

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

abstract class LinearCustomLayout : LinearLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
    }

    abstract fun initView()

}