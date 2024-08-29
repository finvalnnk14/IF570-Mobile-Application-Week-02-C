package com.finavalentina.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.finavalentina.lab_week_02_c.ui.theme.LAB_WEEK_02_CTheme

class MainActivity : ComponentActivity() {
    companion object {
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(DEBUG, "onCreate")

        val buttonClickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.button_standard -> startActivity(
                    Intent(
                        this,
                        StandardActivity::class.java
                    )
                )

                R.id.button_single_top -> startActivity(
                    Intent(
                        this,
                        SingleTopActivity::class.java
                    )
                )
            }
        }

        findViewById<Button>(R.id.button_standard).setOnClickListener(buttonClickListener)
        findViewById<Button>(R.id.button_single_top).setOnClickListener(buttonClickListener)
    }
}