package com.example.slidepuzzlev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MoveRight : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun moveUpClass() {
        when {
            textView1.text.isEmpty() -> {
                textView1.text = textView6.text
                textView6.text = ""
            }
            textView6.text.isEmpty() -> {
                textView6.text = textView11.text
                textView11.text = ""
            }
            textView11.text.isEmpty() -> {
                textView11.text = textView16.text
                textView16.text = ""
            }
            textView16.text.isEmpty() -> {
                textView16.text = textView21.text
                textView21.text = ""
            }
            textView21.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView2.text.isEmpty() -> {
                textView2.text = textView7.text
                textView7.text = ""
            }
            textView7.text.isEmpty() -> {
                textView7.text = textView12.text
                textView12.text = ""
            }
            textView12.text.isEmpty() -> {
                textView12.text = textView17.text
                textView17.text = ""
            }
            textView17.text.isEmpty() -> {
                textView17.text = textView22.text
                textView22.text = ""
            }
            textView22.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView3.text.isEmpty() -> {
                textView3.text = textView8.text
                textView8.text = ""
            }
            textView8.text.isEmpty() -> {
                textView8.text = textView13.text
                textView13.text = ""
            }
            textView13.text.isEmpty() -> {
                textView13.text = textView18.text
                textView18.text = ""
            }
            textView18.text.isEmpty() -> {
                textView18.text = textView23.text
                textView23.text = ""
            }
            textView23.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView4.text.isEmpty() -> {
                textView4.text = textView9.text
                textView9.text = ""
            }
            textView9.text.isEmpty() -> {
                textView9.text = textView14.text
                textView14.text = ""
            }
            textView14.text.isEmpty() -> {
                textView14.text = textView19.text
                textView19.text = ""
            }
            textView19.text.isEmpty() -> {
                textView19.text = textView24.text
                textView24.text = ""
            }
            textView24.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView5.text.isEmpty() -> {
                textView5.text = textView10.text
                textView10.text = ""
            }
            textView10.text.isEmpty() -> {
                textView10.text = textView15.text
                textView15.text = ""
            }
            textView15.text.isEmpty() -> {
                textView15.text = textView20.text
                textView20.text = ""
            }
            textView20.text.isEmpty() -> {
                textView20.text = textView25.text
                textView25.text = ""
            }
            textView25.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
