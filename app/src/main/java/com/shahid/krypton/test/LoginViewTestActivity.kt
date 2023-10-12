package com.shahid.krypton.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shahid.krypton.auth.model.AuthLayoutModel
import com.shahid.krypton.auth.types.FieldTypes
import com.shahid.krypton.databinding.LoginTestActivityBinding

class LoginViewTestActivity : AppCompatActivity() {
    private lateinit var binding: LoginTestActivityBinding
    private lateinit var data: AuthLayoutModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginTestActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buildData()
        initComponent()
    }

    private fun buildData() {
        val fields = ArrayList<AuthLayoutModel.Field>()
        fields.add(
            AuthLayoutModel.Field(
            title = "This is inside adapter",
            type = FieldTypes.TITLE,
        ))
        fields.add(
            AuthLayoutModel.Field(
            hint = "Enter Email",
            type = FieldTypes.EMAIL,
        ))
        fields.add(
            AuthLayoutModel.Field(
            hint = "Click to continue",
            type = FieldTypes.BUTTON,
        ))
        data = AuthLayoutModel(title = AuthLayoutModel.Field(
            title = "Login to continue"
        ), fields = fields)
    }

    private fun initComponent() {
        binding.loginView.setAuthLayoutModel(data)
        binding.loginView.initComponent()
    }
}