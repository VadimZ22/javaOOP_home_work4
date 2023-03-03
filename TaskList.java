package Home_Work4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskList <V> {
    Map<Integer, V> tasklist;
    int key = 0;

    public TaskList() {
        this.tasklist = new HashMap<>();
    }

    public void addTask(V t){
        this.tasklist.put(++key, t);
    }

    public void removeTask(int i){
        tasklist.remove(i);
    }

    public V get(int i){
        return tasklist.get(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Set<Integer> keys = tasklist.keySet();
        for (int i : keys){
            sb.append(tasklist.get(i));
        }
        return sb.toString();
    }
}
