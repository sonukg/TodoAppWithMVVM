package com.sonukg.todoappwithmvvm.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Task")
class Todo (
    @field:PrimaryKey(autoGenerate = true)
    private val id:Int,
    private var name:String,
    private val date:String,
    private val type:String,
    private val severity:String)