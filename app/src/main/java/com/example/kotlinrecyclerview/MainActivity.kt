package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var customAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val usersList = ArrayList<Users>()
        usersList.add(Users("Abishek Khanal","Dhungedhara"))
        usersList.add(Users("Abishek Khanal","Dhungedhara"))
        usersList.add(Users("Abishek Khanal","Dhungedhara"))
        usersList.add(Users("Abishek Khanal","Dhungedhara"))
        usersList.add(Users("Abishek Khanal","Dhungedhara"))

        customAdapter = CustomAdapter(usersList)
        recyclerView.adapter = customAdapter
    }
}