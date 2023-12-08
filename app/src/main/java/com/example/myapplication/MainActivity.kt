package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        var rvTodos = findViewById<RecyclerView>(R.id.rvTodos)
        var btAddTodo = findViewById<Button>(R.id.btAddTodo)
        var etTodo = findViewById<TextView>(R.id.etTodo)


        var todoList = mutableListOf(
            Todo("Test Item", false),
            Todo("Test Item2", false)
        )

        val adapter = TodoAdapter(todoList)
        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btAddTodo.setOnClickListener {
            val title = etTodo.text.toString()
            val todo = Todo(title,false)
            todoList.add(todo)
            adapter.notifyDataSetChanged()
            adapter.notifyItemInserted(todoList.size -1)
            Toast.makeText(application, "new added", Toast.LENGTH_SHORT)
        }
    }
}