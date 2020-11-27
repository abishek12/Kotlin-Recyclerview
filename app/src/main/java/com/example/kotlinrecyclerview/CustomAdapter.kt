package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val usersList: ArrayList<Users>) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.txtName)
        val address = itemView.findViewById<TextView>(R.id.txtAddress)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list, null))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val users: Users = usersList[position]
        holder.name.text = users.uName
        holder.address.text = users.uAddress
    }

    override fun getItemCount(): Int {
        return usersList.size
    }
}