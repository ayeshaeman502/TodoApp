package com.example.todolist;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.room.Room;
import java.util.List;

public class TaskRepository {

    private TaskDao taskDao;
    private LiveData<List<Task>> allTasks;

    public TaskRepository(Application application) {
        TaskDatabase db = TaskDatabase.getDatabase(application);
        taskDao = db.taskDao();
        allTasks = taskDao.getAllTasks();
    }

    public LiveData<List<Task>> getAllTasks() {
        return allTasks;
    }

    public void insert(Task task) {
        TaskDatabase.databaseWriteExecutor.execute(() -> taskDao.insert(task));
    }

    public void delete(Task task) {
        TaskDatabase.databaseWriteExecutor.execute(() -> taskDao.delete(task));
    }
}
