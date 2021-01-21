package com.sonukg.todoappwithmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sonukg.todoappwithmvvm.R

class AddTodoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_todo)
    }
}