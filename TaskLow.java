package Home_Work4;

public class TaskLow extends Task{
    public TaskLow() {
        setPr(Priority.low);
    }
    public String toString(){
        return "Priority: " + getPr().toString() + "\n" + super.toString();
    }
}
