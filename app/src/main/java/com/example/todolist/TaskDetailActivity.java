package com.example.todolist;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class TaskDetailActivity extends AppCompatActivity {

    private EditText taskNameEditText;
    private Button saveTaskButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        taskNameEditText = findViewById(R.id.taskNameEditText);
        saveTaskButton = findViewById(R.id.saveTaskButton);

        saveTaskButton.setOnClickListener(v -> {
            // Logic to save the task
        });
    }
}
