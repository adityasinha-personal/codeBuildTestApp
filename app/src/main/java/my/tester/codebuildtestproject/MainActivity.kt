package my.tester.codebuildtestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import my.tester.liba.A

class MainActivity : AppCompatActivity() {

    lateinit var displayText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayText = findViewById(R.id.display_text)
        val test = A()
        val A = test.varA
        val B = test.varB

        displayText.text = "$A  $B"
    }
}
