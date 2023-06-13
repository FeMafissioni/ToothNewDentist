package br.pro.mateus.authnotify.emergency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.pro.mateus.authnotify.R
import br.pro.mateus.authnotify.databinding.ActivityEmergenciaBinding

class EmergenciaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmergenciaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEmergenciaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}