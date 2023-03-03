package Home_Work4;


public class Main {
    public static void main(String[] args) {
        int id = 0;
        Task task = new TaskImmediate();
        task.setAuthor("Vadim");
        task.setId(++id);
        task.setText("Any task");
        task.setDeadline("today!");

        Task task1 = new TaskMedium();
        task1.setAuthor("Bob");
        task1.setId(++id);
        task1.setText("New task");
        task1.setDeadline("05/03/2023");

        Task task2 = new TaskLow();
        task2.setAuthor("Bart");
        task2.setId(++id);
        task2.setText("Another task");
        task2.setDeadline("to New Year");


        TaskList <Task> tl = new TaskList<>(); // класс TaskList - Лист задач на основе HashMap с некоторым набором своих методов
        tl.addTask(task);
        tl.addTask(task1);
        Import <TaskList> imp = new Import<>(tl); // Класс Import позволяет импортировать в файл (csv/jsom/xml) объекты разных типов
        imp.toCSV();
        imp.toJSON();
        imp.toXML();
        Import <Task> imp2 = new Import<>(task2);
        imp2.toCSV();












    }
    int setId(int id){
        id++;
        return id;
    }
}
