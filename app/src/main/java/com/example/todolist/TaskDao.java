package com.example.todolist;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM task_table ORDER BY task_name ASC")
    LiveData<List<Task>> getAllTasks();

    @Insert
    void insert(Task task);

    @Delete
    void delete(Task task);
}
