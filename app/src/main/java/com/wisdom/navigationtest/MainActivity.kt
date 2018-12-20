package com.wisdom.navigationtest

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import org.jetbrains.anko.clipboardManager
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast(clipboardManager.text)

    }

    override fun onSupportNavigateUp(): Boolean {
        var fragment = getSupportFragmentManager().findFragmentById(R.id.fragment)
        return NavHostFragment.findNavController(fragment!!).navigateUp()
    }
}
