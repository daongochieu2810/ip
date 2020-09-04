package duke.commands;

public enum Commands {
    LIST("list", "List all tasks, pass date if you want to list specific deadlines/events e.g list "),
    BYE("bye", "Exit the program"),
    DONE("done", "Mark a duke.task as done e.g done 1 = duke.task 1 is done"),
    DEADLINE("deadline", "Add a deadline with date and time(optional) e.g deadline buy smth /by 2020-12-20 1800"),
    EVENT("event", "Add an event with date and time(optional) e.g event buy smth /at 2020-12-20 1800"),
    TODO("todo", "Add a todo"),
    DELETE("delete", "Delete a duke.task"),
    HELP("help", "For dummies, like YOU"),
    FIND("find", "Find tasks with keywords e.g find book");

    private String action;
    private String description;
    public String getAction() {
        return this.action;
    }
    public String getDescription() {
        return this.description;
    }
    private Commands(String action, String description) {
        this.description = description;
        this.action = action;
    }
};