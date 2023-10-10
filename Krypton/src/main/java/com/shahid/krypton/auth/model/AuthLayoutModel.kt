package com.shahid.krypton.auth.model

import android.graphics.drawable.Drawable
import com.shahid.krypton.auth.types.FieldTypes
import com.shahid.krypton.auth.types.KAlignmentTypes
import com.shahid.krypton.auth.types.KGravityTypes

data class AuthLayoutModel(
    val fields: ArrayList<Fields>? = null,
    val title: Fields? = null,
    val backgroundImages: BackgroundImages? = null,
    val uiProperties: UIProperties? = null
) {
    data class Fields(
        val title: String? = null,
        val hint: String? = null,
        val type: FieldTypes? = null,
        val uiProperties: UIProperties? = null,
        val clickAction: String? = null
    )

    data class BackgroundImages(
        val registrationBackground: Drawable? = null,
        val loginBackground: Drawable? = null
    )

    data class UIProperties(
        val margin: KMargin? = null,
        val padding: KPadding? = null,
        val alignment: KAlignmentTypes? = null,
        val gravity: KGravityTypes? = null,
        val textSize: Float? = null,
        val hintSize: Float? = null
    ) {
        data class KMargin(
            val top: Float? = null,
            val bottom: Float? = null,
            val start: Float? = null,
            val end: Float? = null
        )
        data class KPadding(
            val top: Int? = null,
            val bottom: Int? = null,
            val start: Int? = null,
            val end: Int? = null
        )
    }
}