package com.shahid.krypton.auth.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.shahid.krypton.auth.model.AuthLayoutModel
import com.shahid.krypton.databinding.SimpleTextViewBinding

class SimpleTextViewHolder(val binding: SimpleTextViewBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindItem(field: AuthLayoutModel.Field) {
        binding.textView.text = field.title
    }
}