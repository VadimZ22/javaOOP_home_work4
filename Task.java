//Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи,
// дедлай задачи, ФИО автора,

package Home_Work4;

public class Task {
    private int id;
    private String author;
    private Priority pr;
    private String text;
    private String deadline;


    public Priority getPr() {
        return pr;
    }

    public void setPr(Priority pr) {
        this.pr = pr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nauthor: " + author + "\ntask: " + text + "\ndeadline: " + deadline + "\n\n";
    }
}
