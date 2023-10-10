package com.shahid.krypton

import android.util.Log
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.FragmentActivity

class Krypton {
    companion object {
        private var fragmentActivity: FragmentActivity? = null

        @JvmStatic
        fun withContext(fragmentActivity: FragmentActivity) {
            this.fragmentActivity = fragmentActivity
        }

        @JvmStatic
        fun requestPermission(permission: String?) {
            val launcher = fragmentActivity?.registerForActivityResult(ActivityResultContracts.RequestPermission()) {
                Log.d("Krypton", "requestPermission: $it")
            }
            launcher?.launch(permission)
        }

        @JvmStatic
        fun requestPermissions(permissions: Array<String>) {
            val launcher = fragmentActivity?.registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) {
                Log.d("Krypton", "requestPermission: $it")
            }
            launcher?.launch(permissions)
        }
    }
}