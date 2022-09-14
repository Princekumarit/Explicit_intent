package com.example.explicit_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var mmessageedittext:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var message=mmessageedittext.text.toString()
        mmessageedittext=findViewById(R.id.edittext_name)
    }

    fun launchSecondActivity(view: View) {
        Toast.makeText(this, "Button is clicked", Toast.LENGTH_LONG).show()
        Log.d("MainAcitivity", "button is clicked")
        val intent=Intent(this,SecondActivity::class.java)
        intent.putExtra("MainAcitivityone","message")
        startActivity(intent)

    }
}