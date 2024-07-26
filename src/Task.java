public class Task {
    String desc;
    Task(String desc){
        this.desc = desc;
    }

    String getDesc(){
        return desc;
    }
    @Override
    public String toString(){
        return desc;
    }
}
