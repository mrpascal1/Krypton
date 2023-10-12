package com.shahid.krypton.auth.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.shahid.krypton.auth.model.AuthLayoutModel
import com.shahid.krypton.databinding.EdittextViewBinding

class SimpleEdittextViewHolder(private val binding: EdittextViewBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bindItem(field: AuthLayoutModel.Field) {
        binding.edittextView.hint = field.hint
    }
}