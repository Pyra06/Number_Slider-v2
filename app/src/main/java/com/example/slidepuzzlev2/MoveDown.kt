package com.example.slidepuzzlev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MoveDown : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun moveDownClass() {
        when {
            textView25.text.isEmpty() -> {
                textView25.text = textView20.text
                textView20.text = ""
            }
            textView20.text.isEmpty() -> {
                textView20.text = textView15.text
                textView15.text = ""
            }
            textView15.text.isEmpty() -> {
                textView15.text = textView10.text
                textView10.text = ""
            }
            textView10.text.isEmpty() -> {
                textView10.text = textView5.text
                textView5.text = ""
            }
            textView5.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView24.text.isEmpty() -> {
                textView24.text = textView19.text
                textView19.text = ""
            }
            textView19.text.isEmpty() -> {
                textView19.text = textView14.text
                textView14.text = ""
            }
            textView14.text.isEmpty() -> {
                textView14.text = textView9.text
                textView9.text = ""
            }
            textView9.text.isEmpty() -> {
                textView9.text = textView4.text
                textView14.text = ""
            }
            textView4.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView23.text.isEmpty() -> {
                textView23.text = textView18.text
                textView18.text = ""
            }
            textView18.text.isEmpty() -> {
                textView18.text = textView13.text
                textView13.text = ""
            }
            textView13.text.isEmpty() -> {
                textView13.text = textView8.text
                textView8.text = ""
            }
            textView8.text.isEmpty() -> {
                textView8.text = textView3.text
                textView3.text = ""
            }
            textView3.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView22.text.isEmpty() -> {
                textView22.text = textView17.text
                textView17.text = ""
            }
            textView17.text.isEmpty() -> {
                textView17.text = textView12.text
                textView12.text = ""
            }
            textView12.text.isEmpty() -> {
                textView12.text = textView7.text
                textView7.text = ""
            }
            textView7.text.isEmpty() -> {
                textView7.text = textView2.text
                textView2.text = ""
            }
            textView2.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView21.text.isEmpty() -> {
                textView21.text = textView16.text
                textView16.text = ""
            }
            textView16.text.isEmpty() -> {
                textView16.text = textView11.text
                textView11.text = ""
            }
            textView11.text.isEmpty() -> {
                textView11.text = textView6.text
                textView6.text = ""
            }
            textView6.text.isEmpty() -> {
                textView6.text = textView1.text
                textView1.text = ""
            }
            textView1.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
