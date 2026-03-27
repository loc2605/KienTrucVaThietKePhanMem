package observer.task;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String taskName;
    private String status;
    private List<TaskObserver> observers;

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = "To Do";
        this.observers = new ArrayList<>();
    }

    public void registerObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(taskName, status);
        }
    }
}