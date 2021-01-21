package com.sonukg.todoappwithmvvm.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.sonukg.todoappwithmvvm.model.Todo

@Dao
interface TodoDao {

    @Insert
    suspend fun insert(todo: Todo)

    @get:Query("SELECT * FROM Todo")
    val allTodo: LiveData<List<Todo>>

    @Update
    suspend fun update(todo: Todo)

    @Delete
    suspend fun delte(todo: Todo)

}