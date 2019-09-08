package com.example.ass5_sec1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.name

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v:View){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("empData", Employee(name.text.toString(), radioGroup.isSelected.toString(),email.text.toString(),
            salary.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(v: View){
        name.text.clear()
        radioGroup.clearCheck()
        email.text.clear()
        salary.text.clear()


    }
}
