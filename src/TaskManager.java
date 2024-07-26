import java.util.*;

public class TaskManager {
    LinkedList<Task> tasklist;
    Stack<Task>undostack;
    Queue<Task>taskqueue;
    TaskManager(){
        tasklist = new LinkedList<>();
        undostack = new Stack<>();
        taskqueue = new LinkedList<>();
    }

    void addTask(String desc){
        Task task = new Task(desc);
        tasklist.add(task);
        taskqueue.offer(task);
        undostack.push(task);

        System.out.println("Added Task is : "+ task);
    }

    void completedTask(){
        if(!taskqueue.isEmpty()){
            Task task = taskqueue.poll();
            tasklist.remove(task);
            System.out.println("You have Completed your "+task+" task");
        }
        else{
            System.out.println("No Tasks to Complete , Add Some tasks!!");
        }


    }

    void undoTask(String desc){
        if(!undostack.isEmpty()){
            Task task = undostack.pop();
            tasklist.remove(task);
            taskqueue.remove(task);
            System.out.println("Undone the task is "+ task);
        }
        else{
            System.out.println("No Tasks to Undo !");
        }

    }

    void availableTasks(){
        if(tasklist.isEmpty()){
            System.out.println("No tasks available");
        }
        else {
            System.out.println("Tasks : ");
            for(Task task : tasklist){
                System.out.println("-> "+task);
            }
        }
    }



}
