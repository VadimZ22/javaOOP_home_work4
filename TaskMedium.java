package Home_Work4;

public class TaskMedium extends Task {
    public TaskMedium() {
        setPr(Priority.medium);
    }
    public String toString(){
        return "Priority: " + getPr().toString() + "\n" + super.toString();
    }
}
