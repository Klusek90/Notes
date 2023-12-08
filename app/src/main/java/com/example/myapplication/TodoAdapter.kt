package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class TodoAdapter (
    var todos: List<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView =itemView.findViewById(R.id.tvTitle)
        var cbCheck: CheckBox= itemView.findViewById(R.id.cbDone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        //inflate item  layout | that false .. always need to be false other way its crash
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false)
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {
        //how many items list have
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        //position point to item in the list

        holder.tvTitle.text = todos[position].title
        holder.cbCheck.isChecked = this.todos[position].isChecked

       }
    }

