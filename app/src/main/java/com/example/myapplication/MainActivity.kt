package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // явное намерение
        binding.button.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("key","123123")
            startActivity(intent)
        }

        // неявное намерение
      // val str = "https://mirea.ru"
      //  val str = "geo:55.669959653733564, 37.48031155995766"
        val str = "tel: +7234234234234"
        binding.button2.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse(str))
            startActivity(intent)
        }

    }
}