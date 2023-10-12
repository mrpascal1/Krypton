package com.shahid.krypton.auth.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.shahid.krypton.auth.model.AuthLayoutModel

/**
 * Just a plain Nothing View holder when the condition is matched with no valid UI
 */
class NothingViewHolder(itemView: View) : ViewHolder(itemView) {
    fun bindItem(field: AuthLayoutModel.Field) {

    }
}