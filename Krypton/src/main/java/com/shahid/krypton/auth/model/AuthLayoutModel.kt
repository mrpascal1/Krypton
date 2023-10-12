package com.shahid.krypton.auth.model

import android.graphics.drawable.Drawable
import com.shahid.krypton.auth.types.FieldTypes
import com.shahid.krypton.auth.types.KAlignmentTypes
import com.shahid.krypton.auth.types.KGravityTypes

data class AuthLayoutModel(
    var fields: ArrayList<Field>? = null,
    var title: Field? = null,
    var backgroundImages: BackgroundImages? = null,
    var uiProperties: UIProperties? = null
) {
    data class Field(
        var title: String? = null,
        var hint: String? = null,
        var type: FieldTypes? = null,
        var uiProperties: UIProperties? = null,
        var clickAction: String? = null
    )

    data class BackgroundImages(
        var registrationBackground: Drawable? = null,
        var loginBackground: Drawable? = null
    )

    data class UIProperties(
        var margin: KMargin? = null,
        var padding: KPadding? = null,
        var alignment: KAlignmentTypes? = null,
        var gravity: KGravityTypes? = null,
        var textSize: Float? = null,
        var hintSize: Float? = null
    ) {
        data class KMargin(
            var top: Float? = null,
            var bottom: Float? = null,
            var start: Float? = null,
            var end: Float? = null
        )
        data class KPadding(
            var top: Int? = null,
            var bottom: Int? = null,
            var start: Int? = null,
            var end: Int? = null
        )
    }
}