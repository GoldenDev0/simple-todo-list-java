public class Todo {
    public int index;
    public String name;
    public String description;
    public Status status;
    public boolean isDone;

    private static String reset = "\u001B[0m"; // Reset color

    public enum Status{
        DONE, DOING, PENDING;
    };

    Todo(int index, String name, String description, Status status) {
        this.index = index;
        this.name = name;
        this.description = description;
        this.status = status;
    }



    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus(){
        return status;
    }

    public Status setStatus(Status status){
        this.status = status;
        return this.status;
    }

    public void getInfo(){
        System.out.println(reset + "ID: " + getIndex() + " | " + "Name: " + getName() + " | " + " Todo: " + getDescription() + " | " + " status: " + getStatusAsString() + reset);

    }

    public String getStatusAsString(){
        if(this.status == Status.DONE)
            return "\u001B[38;2;0;255;0m" + "done";
        else if(this.status == Status.DOING)
            return "\u001B[38;5;214m" + "in progress";
        else
            return "\u001B[38;2;255;0;0m" +"pending";
    }
}