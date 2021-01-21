package com.sonukg.todoappwithmvvm.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sonukg.todoappwithmvvm.dao.TodoDao
import com.sonukg.todoappwithmvvm.model.Todo

@Database(entities = [Todo::class],version = 1,exportSchema = false)
abstract class TodoDatabase:RoomDatabase() {
     abstract fun todoDao():TodoDao

     companion object{
         private var todoDbInstance:TodoDatabase?=null
         
         internal fun getTodoDbInstance(context: Context):TodoDatabase?{
            if (todoDbInstance==null){
                synchronized(TodoDatabase::class.java){
                    todoDbInstance =Room.databaseBuilder(context.applicationContext,
                    TodoDatabase::class.java,"todo_database").build()
                }
            }
             return todoDbInstance
         }
     }
}