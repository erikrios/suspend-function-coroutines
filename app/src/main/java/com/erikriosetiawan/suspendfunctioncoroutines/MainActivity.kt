package com.erikriosetiawan.suspendfunctioncoroutines

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            val networkCallAnswerOne = doNetworkCall()
            val networkCallAnswerTwo = doNetworkCallTwo()

            Log.d(TAG, networkCallAnswerOne)
            Log.d(TAG, networkCallAnswerTwo)
        }
    }

    private suspend fun doNetworkCall(): String {
        delay(3000L)
        return "This is the answer from network call one"
    }

    private suspend fun doNetworkCallTwo(): String {
        delay(3000L)
        return "This is the answer from network call two"
    }
}
