package com.shahid.krypton.auth.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.shahid.krypton.auth.model.AuthLayoutModel
import com.shahid.krypton.databinding.SimpleButtonViewBinding

class SimpleButtonViewHolder(val binding: SimpleButtonViewBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindItem(field: AuthLayoutModel.Field) {
        binding.buttonView.text = field.title
    }
}