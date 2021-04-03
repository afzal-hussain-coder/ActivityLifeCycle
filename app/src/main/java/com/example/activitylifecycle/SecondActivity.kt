package com.example.activitylifecycle

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.custome_dialog.*

class SecondActivity : AppCompatActivity() {
  val TAG="SecondActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG,"onCreate")

        btnOpenDialog.setOnClickListener {
            openDialog()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }

    private fun openDialog(){
        val dialog = Dialog(this).apply {
            setTitle("Hello")
            setContentView(R.layout.custome_dialog)
            show()
        }
        dialog.imageView.setOnClickListener { dialog.dismiss() }

    }
}