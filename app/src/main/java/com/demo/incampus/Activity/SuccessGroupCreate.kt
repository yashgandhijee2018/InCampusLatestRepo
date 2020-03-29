package com.demo.incampus.Activity

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.demo.incampus.R

class SuccessGroupCreate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //if the system api is below marshmallow, set status bar to default black
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            window.statusBarColor = Color.BLACK
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_group_create)
    }

    fun done (view : View) {
        val intent = Intent(this,HomeActivity::class.java)
        startActivity(intent)
    }
}