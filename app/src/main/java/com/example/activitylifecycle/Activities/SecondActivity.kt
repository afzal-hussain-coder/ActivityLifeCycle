package com.example.activitylifecycle.Activities

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitylifecycle.Fragment.OneFragment
import com.example.activitylifecycle.Fragment.SecondFragment
import com.example.activitylifecycle.R
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

        btnOpenOneFragment.setOnClickListener { addFirtsFragment() }
        btnOpenSecondFragment.setOnClickListener {addSecondFragment() }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")

    }

    fun addFirtsFragment(){
        val fragementMetanager=supportFragmentManager
        val transition= fragementMetanager.beginTransaction()
        val oneFragment=OneFragment()
        transition.add(R.id.container,oneFragment)
        transition.addToBackStack(null)
        transition.commit()
    }
    fun addSecondFragment(){
        val fragementMetanager=supportFragmentManager
        val transition= fragementMetanager.beginTransaction()
        val oneFragment=SecondFragment()
        transition.add(R.id.container,oneFragment)
        transition.addToBackStack(null)
        transition.commit()
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