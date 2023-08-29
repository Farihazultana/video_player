package com.fariha.video_player

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.fariha.video_player.databinding.ActivityMainBinding
import android.widget.VideoView
import java.time.OffsetTime.parse


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoView = binding.testView

        //creating mediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        //specify the location of media file
        val uri: Uri = Uri.parse(
            "android.resource://$packageName/raw/test"
        )

        //setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()



    }


}