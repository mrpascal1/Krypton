package com.shahid.krypton

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class KryptonActivity : AppCompatActivity() {

    val requestPermission = registerForActivityResult(ActivityResultContracts.RequestPermission()) {

    }

    val requestMultiplePermission = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }
}