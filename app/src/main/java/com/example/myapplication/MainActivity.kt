package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    val recyclerView: RecyclerView = findViewById(R.id.rvTodos)
//    var addButton: Button
//    var setTitle: TextView
//    var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.btAddTodo)
        val newTitle = findViewById<TextView>(R.id.etTodo)
        val recyclerView = findViewById<RecyclerView>(R.id.rvTodos)


        var todoList = mutableListOf(
            Todo("Test Item", false),
            Todo("Test Item2", false)
        )
//
//        val adapter = TodoAdapter(todoList)
//        recyclerView.adapter = adapter
//        recyclerView.layoutManager = LinearLayoutManager(this)

        addButton.setOnClickListener {
            val title =  newTitle.text.toString()
            val todo = Todo(title,false)
//            todoList.add(todo)
//            adapter.notifyDataSetChanged()
//            adapter.notifyItemInserted(todoList.size -1)
            Toast.makeText(application, "new added", Toast.LENGTH_SHORT)
        }
    }
}