package com.bawp.todos.adapter;

import com.bawp.todos.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);
    void onTodoImageButtonClick(Task task);
}
