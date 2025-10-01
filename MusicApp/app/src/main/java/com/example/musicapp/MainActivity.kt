package com.example.musicapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private var isPlaying = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlayPause: ImageButton = findViewById(R.id.btnPlayPause)

        btnPlayPause.setOnClickListener {
            isPlaying = !isPlaying
            if (isPlaying) {
                btnPlayPause.setImageResource(R.drawable.ic_play)
            } else {
                btnPlayPause.setImageResource(R.drawable.ic_pause)
            }
        }
    }
}