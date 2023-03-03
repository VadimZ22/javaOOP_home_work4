package Home_Work4;

import Home_Work2.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Import<T> {
    T task;

    public Import(T task) {
        this.task = task;
    }

    public void toCSV(){
        try {
            FileWriter writer = new FileWriter("File.csv", true);
            writer.write("\n"+this.task.toString());
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void toXML(){
        try {
            FileWriter writer = new FileWriter("File.xml", true);
            writer.write("\n"+this.task.toString());
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void toJSON(){
        try {
            FileWriter writer = new FileWriter("File.json", true);
            writer.write("\n"+this.task.toString());
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
