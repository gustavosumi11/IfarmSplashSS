package com.example.ifarmsplashs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_primeira_intro.*
import kotlinx.android.synthetic.main.activity_segunda_intro.*

class SegundaIntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_intro)

           buttonPreview.setOnClickListener()
           {
               val intent = Intent(this, PrimeiraIntroActivity::class.java)
               startActivity(intent)
        }
        buttonNext.setOnClickListener(){
            intent = Intent(this, DuvidaActivity::class.java)
            startActivity(intent)
        }
    }
}