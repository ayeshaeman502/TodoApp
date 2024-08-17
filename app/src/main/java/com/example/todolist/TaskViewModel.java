package com.example.todolist;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;

import java.util.List;

public class TaskViewModel extends AndroidViewModel {

    private TaskRepository repository;
    private LiveData<List<Task>> allTasks;

    public TaskViewModel(@NonNull Application application) {
        super(application);
        repository = new TaskRepository(application);
        allTasks = repository.getAllTasks();
    }

    public void insert(Task task) {
        repository.insert(task);
    }

    public void delete(Task task) {
        repository.delete(task);
    }

    public LiveData<List<Task>> getAllTasks() {
        return allTasks;
    }
}
