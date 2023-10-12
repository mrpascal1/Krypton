package com.shahid.krypton.auth.ui

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.core.view.marginTop
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shahid.krypton.auth.adapters.AuthFieldsAdapter
import com.shahid.krypton.auth.model.AuthLayoutModel
import com.shahid.krypton.auth.types.FieldTypes
import com.shahid.krypton.auth.types.KAlignmentTypes
import com.shahid.krypton.auth.types.KGravityTypes
import com.shahid.krypton.base.LinearCustomLayout
import com.shahid.krypton.databinding.LoginViewBinding

class LoginView : LinearCustomLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initView()
    }

    private var authLayoutModel: AuthLayoutModel? = null
    private var adapter: AuthFieldsAdapter? = null

    private val binding = LoginViewBinding.inflate(LayoutInflater.from(context))

    override fun initView() {

    }

    /**
     * Call before initComponent()
    * */
    fun setAuthLayoutModel(authLayoutModel: AuthLayoutModel) {
        this.authLayoutModel = authLayoutModel
    }

    fun initComponent() {
        bindAuthModelToUI()
        initRecyclerview()
        setDataToAdapter()
    }


    private fun bindAuthModelToUI() {
        authLayoutModel?.backgroundImages?.loginBackground?.let {
            binding.imageView.setImageDrawable(it)
        }

        authLayoutModel?.title?.let {
            when(it.type) {
                FieldTypes.TITLE -> {
                    binding.titleTextView.text = it.title
                    setTitleUIProperties(it.uiProperties)
                }
                else -> {}
            }
        }
    }

    private fun setTitleUIProperties(uiProperties: AuthLayoutModel.UIProperties?) {
        uiProperties?.textSize?.let {
            binding.titleTextView.textSize = it
        }
        binding.titleTextView.apply {

            textSize = uiProperties?.textSize ?: 14f

            when(uiProperties?.alignment) {
                KAlignmentTypes.START -> {
                    textAlignment = TEXT_ALIGNMENT_TEXT_START
                }
                KAlignmentTypes.END -> {
                    textAlignment = TEXT_ALIGNMENT_TEXT_END
                }
                KAlignmentTypes.CENTER -> {
                    textAlignment = TEXT_ALIGNMENT_CENTER
                }
                else -> {}
            }

            when(uiProperties?.gravity) {
                KGravityTypes.START -> {
                    gravity = Gravity.START
                }
                KGravityTypes.END -> {
                    gravity = Gravity.END
                }
                KGravityTypes.CENTER -> {
                    gravity = Gravity.CENTER
                }
                KGravityTypes.TOP -> {
                    gravity = Gravity.TOP
                }
                KGravityTypes.BOTTOM -> {
                    gravity = Gravity.BOTTOM
                }
                else -> {}
            }
            setPadding(
                uiProperties?.padding?.start ?: 0,
                uiProperties?.padding?.top ?: 0,
                uiProperties?.padding?.top ?: 0,
                uiProperties?.padding?.top ?: 0
            )
        }
    }

    private fun initAdapter() {
        adapter = AuthFieldsAdapter()
    }
    private fun initRecyclerview() {
        initAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.recyclerView.adapter = adapter
    }

    private fun setDataToAdapter() {
        authLayoutModel?.fields?.let {
            adapter?.setData(it)
        }
    }

}