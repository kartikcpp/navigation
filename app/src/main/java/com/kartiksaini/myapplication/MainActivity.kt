package com.kartiksaini.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.kartiksaini.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        NavigationUI.setupActionBarWithNavController(this,this.findNavController(R.id.navhost))
    }

    override fun onSupportNavigateUp(): Boolean {
      val navController=this.findNavController(R.id.navhost)
        return navController.navigateUp()
    }
}