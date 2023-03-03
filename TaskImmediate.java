package Home_Work4;

public class TaskImmediate extends Task {
    public TaskImmediate() {
        setPr(Priority.immediate);
    }
    public String toString(){
        return "Priority: " + getPr().toString() + "\n" + super.toString();
    }
}
