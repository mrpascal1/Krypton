package com.shahid.krypton.auth.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.shahid.krypton.auth.model.AuthLayoutModel
import com.shahid.krypton.auth.types.FieldTypes
import com.shahid.krypton.auth.viewholders.NothingViewHolder
import com.shahid.krypton.auth.viewholders.SimpleButtonViewHolder
import com.shahid.krypton.auth.viewholders.SimpleEdittextViewHolder
import com.shahid.krypton.auth.viewholders.SimpleTextViewHolder
import com.shahid.krypton.databinding.EdittextViewBinding
import com.shahid.krypton.databinding.SimpleButtonViewBinding
import com.shahid.krypton.databinding.SimpleTextViewBinding

class AuthFieldsAdapter : RecyclerView.Adapter<ViewHolder>() {

    private val items = ArrayList<AuthLayoutModel.Field>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when(viewType) {
            FieldTypes.EMAIL.ordinal -> {
                SimpleEdittextViewHolder(EdittextViewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
            FieldTypes.BUTTON.ordinal -> {
                SimpleButtonViewHolder(SimpleButtonViewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
            FieldTypes.TITLE.ordinal -> {
                SimpleTextViewHolder(SimpleTextViewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
            else -> {
                NothingViewHolder(View(parent.context))
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when(holder) {
            is SimpleTextViewHolder -> {
                holder.bindItem(items[position])
            }
            is SimpleButtonViewHolder -> {
                holder.bindItem(items[position])
            }
            is SimpleEdittextViewHolder -> {
                holder.bindItem(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return when(items[position].type) {
            FieldTypes.EMAIL -> {
                FieldTypes.EMAIL.ordinal
            }

            FieldTypes.TITLE -> {
                FieldTypes.TITLE.ordinal
            }

            FieldTypes.BUTTON -> {
                FieldTypes.BUTTON.ordinal
            }

            else -> {
                FieldTypes.NOTHING.ordinal
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(items: ArrayList<AuthLayoutModel.Field>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }
}