package com.bharat.calculator_master

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    internal lateinit var textView: TextView
    private var clear: Button? = null
    private var delete: Button? = null
    private var percentage: Button? = null
    private var divide: Button? = null
    private var add: Button? = null
    private var subtract: Button? = null
    private var multiply: Button? = null
    private var equal: Button? = null
    private var minusValue: Button? = null
    private var one: Button? = null
    private var two: Button? = null
    private var three: Button? = null
    private var four: Button? = null
    private var five: Button? = null
    private var six: Button? = null
    private var seven: Button? = null
    private var eight: Button? = null
    private var nine: Button? = null
    private var point: Button? = null
    private var zero: Button? = null

    private var ans = ""
    internal var a = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //a.add(0);


        textView = findViewById<View>(R.id.textView1) as TextView
        //textView.setMovementMethod(new ScrollingMovementMethod());
        //textView.setSelected(true);
        clear = findViewById<View>(R.id.buttonClearText) as Button
        delete = findViewById<View>(R.id.buttonDelete) as Button
        percentage = findViewById<View>(R.id.buttonPercentage) as Button
        divide = findViewById<View>(R.id.buttonDivide) as Button
        add = findViewById<View>(R.id.buttonAdd) as Button
        subtract = findViewById<View>(R.id.buttonSubtraction) as Button
        multiply = findViewById<View>(R.id.buttonMultiply) as Button
        equal = findViewById<View>(R.id.buttonEqual) as Button
        minusValue = findViewById<View>(R.id.buttonMinusValue) as Button

        one = findViewById<View>(R.id.button1) as Button
        two = findViewById<View>(R.id.button2) as Button
        three = findViewById<View>(R.id.button3) as Button
        four = findViewById<View>(R.id.button4) as Button
        five = findViewById<View>(R.id.button5) as Button
        six = findViewById<View>(R.id.button6) as Button
        seven = findViewById<View>(R.id.button7) as Button
        eight = findViewById<View>(R.id.button8) as Button
        nine = findViewById<View>(R.id.button9) as Button
        point = findViewById<View>(R.id.buttonPoint) as Button
        zero = findViewById<View>(R.id.buttonZero) as Button



        one!!.setOnClickListener {
            ans += "1"
            textView.text = textView.text.toString() + "1"
        }

        two!!.setOnClickListener {
            ans += "2"

            textView.text = textView.text.toString() + "2"
        }

        three!!.setOnClickListener {
            ans += "3"

            textView.text = textView.text.toString() + "3"
        }

        four!!.setOnClickListener {
            ans += "4"

            textView.text = textView.text.toString() + "4"
        }

        five!!.setOnClickListener {
            ans += "5"

            textView.text = textView.text.toString() + "5"
        }


        six!!.setOnClickListener {
            ans += "6"

            textView.text = textView.text.toString() + "6"
        }


        seven!!.setOnClickListener {
            ans += "7"

            textView.text = textView.text.toString() + "7"
        }

        eight!!.setOnClickListener {
            ans += "8"

            textView.text = textView.text.toString() + "8"
        }

        nine!!.setOnClickListener {
            ans += "9"

            textView.text = textView.text.toString() + "9"
        }

        point!!.setOnClickListener {
            if (!textView.text.toString().isEmpty()) {
                val s = textView.text.toString()
                val ch = s[s.length - 1]
                if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                    ans += "."
                    textView.text = textView.text.toString() + "."
                }

            }
        }

        zero!!.setOnClickListener {
            ans += "0"

            textView.text = textView.text.toString() + "0"
        }


        clear!!.setOnClickListener {
            ans = ""
            textView.text = null
            a.clear()
        }

        delete!!.setOnClickListener {
            if (!textView.text.toString().isEmpty()) {
                val s = textView.text.toString()
                //ans=ans.substring(0,ans.length());
                var s1 = ""
                for (i in 0 until s.length - 1) {
                    s1 += s[i]
                }
                //ans=ans.substring(0,s.length()-1);
                ans = s1
                textView.text = s1
            }
        }

        minusValue!!.setOnClickListener {
            val s = textView.text.toString()
            var res =( s + "").toDouble()
            res *= -1.0
            ans = res.toString()
            textView.text = res.toString() + ""
        }

        percentage!!.setOnClickListener {
            if (!textView.text.toString().isEmpty()) {
                val s = textView.text.toString()
                val ch = s[s.length - 1]
                if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                    a.add(s.length - 1)
                    ans += "%"
                    textView.text = textView.text.toString() + "%"
                }


            }
        }

        divide!!.setOnClickListener {
            if (!textView.text.toString().isEmpty()) {
                val s = textView.text.toString()
                val ch = s[s.length - 1]
                if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                    a.add(s.length - 1)
                    ans += "/"
                    textView.text = textView.text.toString() + "/"
                }
            }
        }

        add!!.setOnClickListener {
            if (!textView.text.toString().isEmpty()) {
                val s = textView.text.toString()
                val ch = s[s.length - 1]
                if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                    a.add(s.length - 1)
                    ans += "+"
                    textView.text = textView.text.toString() + "+"
                }
            }
        }

        subtract!!.setOnClickListener {
            if (!textView.text.toString().isEmpty()) {
                val s = textView.text.toString()
                val ch = s[s.length - 1]
                if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                    a.add(s.length - 1)
                    ans += "-"
                    textView.text = textView.text.toString() + "-"
                }
            }
        }

        multiply!!.setOnClickListener {
            if (!textView.text.toString().isEmpty()) {
                val s = textView.text.toString()
                val ch = s[s.length - 1]
                if (ch != '+' && ch != '-' && ch != '%' && ch != '*' && ch != '/' && ch != '.') {
                    a.add(s.length - 1)
                    ans += "*"
                    textView.text = textView.text.toString() + "*"
                }


            }
        }

        equal!!.setOnClickListener {
            if (!textView.text.toString().isEmpty()) {
                var s = ans
                val ch = s[s.length - 1]
                if (ch == '+' || ch == '-' || ch == '%' || ch == '*' || ch == '/' || ch == '.') {
                    Toast.makeText(applicationContext, "Invalid", Toast.LENGTH_SHORT).show()
                } else {
                    a.add(s.length - 1)
                    s += "="
                    //String info="";

                    //boolean div=false,mult=false,sub=false,perc=false,add1=false;
                    var res = s.substring(0, a[0] + 1).toDouble()

                    for (i in 0 until a.size - 1) {
                        val answ = s.substring(a[i] + 2, a[i + 1] + 1).toDouble()
                        if (s[a[i] + 1] == '+') {
                            res += answ
                        } else if (s[a[i] + 1] == '-') {
                            res -= answ
                        } else if (s[a[i] + 1] == '/') {
                            res /= answ
                        } else if (s[a[i] + 1] == '*') {
                            res *= answ
                        } else if (s[a[i] + 1] == '%') {
                            res = res * answ / 10000
                        }
                    }

                    val answer = res.toString()
                    a.clear()


                    //int check=0; //first time
                    //String answ= String.valueOf(a.size());


                    textView.text = answer
                    //a.add(answer.length()-1);
                    ans = answer
                }


            }
        }


    }
}





