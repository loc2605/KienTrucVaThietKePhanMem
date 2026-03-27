package observer.task;

public class TeamMember implements TaskObserver {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println("Thanh vien " + name
                + " nhan thong bao: Task '"
                + taskName + "' chuyen sang trang thai '"
                + status + "'");
    }
}