package com.example.test

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.test.databinding.ActivityOneOfThreeBinding

class OneOfThree : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityOneOfThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOneOfThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.oneofthreecontainer.setOnClickListener{
            startActivity(Intent(this, SecondOfThree::class.java))
            finish()
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_one_of_three)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}