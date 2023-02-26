package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.textView.visibility == View.VISIBLE) hide()
            else show()
        }
    }

    private fun show() {
        binding.button.setText(R.string.hide)
        binding.textView.visibility = View.VISIBLE
    }

    private fun hide() {
        binding.button.setText(R.string.show)
        binding.textView.visibility = View.INVISIBLE
    }
}