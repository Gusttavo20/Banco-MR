package com.meuprimeiro.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.meuprimeiro.bancomr.databinding.ActivityMainBinding
import com.meuprimeiro.bancomr.databinding.ActivityPoupancaBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageSaldo.setOnClickListener {

            val intent = Intent(this,Saldo::class.java)
            startActivity(intent)
        }

        binding.imageFaturas.setOnClickListener {
            val intent = Intent(this,Fatura::class.java)
            startActivity(intent)
        }

        binding.imageTransferencia.setOnClickListener {
            val intent = Intent(this,Activity_Transferencia:: class.java)
            startActivity(intent)
        }

        binding.imagePoupanca.setOnClickListener {
            val intent = Intent(this, Activity_Poupanca::class.java)
            startActivity(intent)
        }


    }
}