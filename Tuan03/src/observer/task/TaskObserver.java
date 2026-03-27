package observer.task;

public interface TaskObserver {
    void update(String taskName, String status);
}