package main.tasks;

/**
 * Task is a class that represents tasks that a user may input.
 */
public class Task {

    private String description;
    private boolean isDone;

    /**
     * A constructor for Task.
     * @param description
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return this.description;
    }

    private String getStatusIcon() {
        return (isDone ? "[X] " : "[ ] ");
    }

    private String getStatusNum() {
        return (isDone ? "1" : "0");
    }

    /**
     * Mark the task of the user as complete.
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Mark the task of the user as incomplete.
     */
    public void markAsNotDone() {
        this.isDone = false;
    }

    /**
     * Returns a string representing the format used for storage of input in files.
     * @return String.
     */
    public String toFileFormat() {
        return this.getStatusNum() + " .. " + this.getDescription();
    }

    @Override
    public String toString() {
        return this.getStatusIcon() + " " + this.getDescription();
    }
}
