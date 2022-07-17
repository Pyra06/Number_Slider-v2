package com.example.slidepuzzlev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {


    private lateinit var moveLeft: Button
    private lateinit var moveRight: Button
    private lateinit var moveUP: Button
    private lateinit var moveDown: Button
    private lateinit var shuffleBtn: Button
    private lateinit var solveBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveLeft = findViewById(R.id.button1)
        moveRight = findViewById(R.id.button2)
        moveUP = findViewById(R.id.button3)
        moveDown = findViewById(R.id.button4)
        shuffleBtn = findViewById(R.id.button5)
        solveBtn = findViewById(R.id.button6)

        var myList = ArrayList((1..24).toList())
        myList.shuffle()
        textView1.text = ((myList[0] + 64).toChar()).toString()
        textView2.text = ((myList[1] + 64).toChar()).toString()
        textView3.text = ((myList[2] + 64).toChar()).toString()
        textView4.text = ((myList[3] + 64).toChar()).toString()
        textView5.text = ((myList[4] + 64).toChar()).toString()
        textView6.text = ((myList[5] + 64).toChar()).toString()
        textView7.text = ((myList[6] + 64).toChar()).toString()
        textView8.text = ((myList[7] + 64).toChar()).toString()
        textView9.text = ((myList[8] + 64).toChar()).toString()
        textView10.text = ((myList[9] + 64).toChar()).toString()
        textView11.text = ((myList[10] + 64).toChar()).toString()
        textView12.text = ((myList[11] + 64).toChar()).toString()
        textView13.text = ((myList[12] + 64).toChar()).toString()
        textView14.text = ((myList[13] + 64).toChar()).toString()
        textView15.text = ((myList[14] + 64).toChar()).toString()
        textView16.text = ((myList[15] + 64).toChar()).toString()
        textView17.text = ((myList[16] + 64).toChar()).toString()
        textView18.text = ((myList[17] + 64).toChar()).toString()
        textView19.text = ((myList[18] + 64).toChar()).toString()
        textView20.text = ((myList[19] + 64).toChar()).toString()
        textView21.text = ((myList[20] + 64).toChar()).toString()
        textView22.text = ((myList[21] + 64).toChar()).toString()
        textView23.text = ((myList[22] + 64).toChar()).toString()
        textView24.text = ((myList[23] + 64).toChar()).toString()
        textView25.text = ""

        moveLeft.setOnClickListener() {
            when {
                textView1.text.isEmpty() -> {
                    textView1.text = textView2.text
                    textView2.text = ""
                }
                textView2.text.isEmpty() -> {
                    textView2.text = textView3.text
                    textView3.text = ""
                }
                textView3.text.isEmpty() -> {
                    textView3.text = textView4.text
                    textView4.text = ""
                }
                textView4.text.isEmpty() -> {
                    textView4.text = textView5.text
                    textView5.text = ""
                }
                textView5.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                textView6.text.isEmpty() -> {
                    textView6.text = textView7.text
                    textView7.text = ""
                }
                textView7.text.isEmpty() -> {
                    textView7.text = textView8.text
                    textView8.text = ""
                }
                textView8.text.isEmpty() -> {
                    textView8.text = textView9.text
                    textView9.text = ""
                }
                textView9.text.isEmpty() -> {
                    textView9.text = textView10.text
                    textView10.text = ""
                }
                textView10.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                textView11.text.isEmpty() -> {
                    textView11.text = textView12.text
                    textView12.text = ""
                }
                textView12.text.isEmpty() -> {
                    textView12.text = textView13.text
                    textView13.text = ""
                }
                textView13.text.isEmpty() -> {
                    textView13.text = textView14.text
                    textView14.text = ""
                }
                textView14.text.isEmpty() -> {
                    textView14.text = textView15.text
                    textView15.text = ""
                }
                textView15.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                textView16.text.isEmpty() -> {
                    textView16.text = textView17.text
                    textView17.text = ""
                }
                textView17.text.isEmpty() -> {
                    textView17.text = textView18.text
                    textView18.text = ""
                }
                textView18.text.isEmpty() -> {
                    textView18.text = textView19.text
                    textView19.text = ""
                }
                textView19.text.isEmpty() -> {
                    textView19.text = textView20.text
                    textView20.text = ""
                }
                textView20.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                textView21.text.isEmpty() -> {
                    textView21.text = textView22.text
                    textView22.text = ""
                }
                textView22.text.isEmpty() -> {
                    textView22.text = textView23.text
                    textView23.text = ""
                }
                textView23.text.isEmpty() -> {
                    textView23.text = textView24.text
                    textView24.text = ""
                }
                textView24.text.isEmpty() -> {
                    textView24.text = textView25.text
                    textView25.text = ""
                }
                textView25.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        moveRight.setOnClickListener() {
            when {
                textView5.text.isEmpty() -> {
                    textView5.text = textView4.text
                    textView4.text = ""
                }
                textView4.text.isEmpty() -> {
                    textView4.text = textView3.text
                    textView3.text = ""
                }
                textView3.text.isEmpty() -> {
                    textView3.text = textView2.text
                    textView2.text = ""
                }
                textView2.text.isEmpty() -> {
                    textView2.text = textView1.text
                    textView1.text = ""
                }
                textView1.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                textView10.text.isEmpty() -> {
                    textView10.text = textView9.text
                    textView9.text = ""
                }
                textView9.text.isEmpty() -> {
                    textView9.text = textView8.text
                    textView8.text = ""
                }
                textView8.text.isEmpty() -> {
                    textView8.text = textView7.text
                    textView7.text = ""
                }
                textView7.text.isEmpty() -> {
                    textView7.text = textView6.text
                    textView6.text = ""
                }
                textView6.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                textView15.text.isEmpty() -> {
                    textView15.text = textView14.text
                    textView14.text = ""
                }
                textView14.text.isEmpty() -> {
                    textView14.text = textView13.text
                    textView13.text = ""
                }
                textView13.text.isEmpty() -> {
                    textView13.text = textView12.text
                    textView12.text = ""
                }
                textView12.text.isEmpty() -> {
                    textView12.text = textView11.text
                    textView11.text = ""
                }
                textView11.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                textView20.text.isEmpty() -> {
                    textView20.text = textView19.text
                    textView19.text = ""
                }
                textView19.text.isEmpty() -> {
                    textView19.text = textView18.text
                    textView18.text = ""
                }
                textView18.text.isEmpty() -> {
                    textView18.text = textView17.text
                    textView17.text = ""
                }
                textView17.text.isEmpty() -> {
                    textView17.text = textView16.text
                    textView16.text = ""
                }
                textView16.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
                textView25.text.isEmpty() -> {
                    textView25.text = textView24.text
                    textView24.text = ""
                }
                textView24.text.isEmpty() -> {
                    textView24.text = textView23.text
                    textView23.text = ""
                }
                textView23.text.isEmpty() -> {
                    textView23.text = textView22.text
                    textView22.text = ""
                }
                textView22.text.isEmpty() -> {
                    textView22.text = textView21.text
                    textView21.text = ""
                }
                textView21.text.isEmpty() -> {
                    Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        moveUP.setOnClickListener() {
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

        moveDown.setOnClickListener() {
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
                    textView4.text = ""
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

        shuffleBtn.setOnClickListener() {

            val myList = ArrayList((1..24).toList())
            myList.shuffle()
            textView1.text = ((myList[0] + 64).toChar()).toString()
            textView2.text = ((myList[1] + 64).toChar()).toString()
            textView3.text = ((myList[2] + 64).toChar()).toString()
            textView4.text = ((myList[3] + 64).toChar()).toString()
            textView5.text = ((myList[4] + 64).toChar()).toString()
            textView6.text = ((myList[5] + 64).toChar()).toString()
            textView7.text = ((myList[6] + 64).toChar()).toString()
            textView8.text = ((myList[7] + 64).toChar()).toString()
            textView9.text = ((myList[8] + 64).toChar()).toString()
            textView10.text = ((myList[9] + 64).toChar()).toString()
            textView11.text = ((myList[10] + 64).toChar()).toString()
            textView12.text = ((myList[11] + 64).toChar()).toString()
            textView13.text = ((myList[12] + 64).toChar()).toString()
            textView14.text = ((myList[13] + 64).toChar()).toString()
            textView15.text = ((myList[14] + 64).toChar()).toString()
            textView16.text = ((myList[15] + 64).toChar()).toString()
            textView17.text = ((myList[16] + 64).toChar()).toString()
            textView18.text = ((myList[17] + 64).toChar()).toString()
            textView19.text = ((myList[18] + 64).toChar()).toString()
            textView20.text = ((myList[19] + 64).toChar()).toString()
            textView21.text = ((myList[20] + 64).toChar()).toString()
            textView22.text = ((myList[21] + 64).toChar()).toString()
            textView23.text = ((myList[22] + 64).toChar()).toString()
            textView24.text = ((myList[23] + 64).toChar()).toString()
            textView25.text = ""
        }

        solveBtn.setOnClickListener() {
            textView1.text = (65).toChar().toString()
            textView2.text = (66).toChar().toString()
            textView3.text = (67).toChar().toString()
            textView4.text = (68).toChar().toString()
            textView5.text = (69).toChar().toString()
            textView6.text = (70).toChar().toString()
            textView7.text = (71).toChar().toString()
            textView8.text = (72).toChar().toString()
            textView9.text = (73).toChar().toString()
            textView10.text = (74).toChar().toString()
            textView11.text = (75).toChar().toString()
            textView12.text = (76).toChar().toString()
            textView13.text = (77).toChar().toString()
            textView14.text = (78).toChar().toString()
            textView15.text = (79).toChar().toString()
            textView16.text = (80).toChar().toString()
            textView17.text = (81).toChar().toString()
            textView18.text = (82).toChar().toString()
            textView19.text = (83).toChar().toString()
            textView20.text = (84).toChar().toString()
            textView21.text = (85).toChar().toString()
            textView22.text = (86).toChar().toString()
            textView23.text = (87).toChar().toString()
            textView24.text = (88).toChar().toString()
            textView25.text = ""
        }
    }
}
