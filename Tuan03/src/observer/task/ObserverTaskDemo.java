package observer.task;

public class ObserverTaskDemo {
    public static void main(String[] args) {
        Task task = new Task("Thiet ke giao dien");

        TeamMember dev = new TeamMember("Dev");
        TeamMember tester = new TeamMember("Tester");
        TeamMember pm = new TeamMember("PM");

        task.registerObserver(dev);
        task.registerObserver(tester);
        task.registerObserver(pm);

        task.setStatus("In Progress");
        task.setStatus("Done");
    }
}