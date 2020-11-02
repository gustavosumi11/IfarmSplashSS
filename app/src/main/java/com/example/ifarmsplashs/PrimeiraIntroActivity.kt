package com.example.ifarmsplashs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_primeira_intro.*
import kotlinx.android.synthetic.main.activity_segunda_intro.*

class PrimeiraIntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira_intro)

        button.setOnClickListener(){
            val intent = Intent(this, SegundaIntroActivity::class.java)
            mudarParaActivity()
        }

    }
    private fun mudarParaActivity() {
        val intent = Intent(this, SegundaIntroActivity::class.java)
        startActivity(intent)



    }

}