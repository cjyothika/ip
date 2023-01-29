package duke.task;

import duke.DukeException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskListTest {

    @Test
    public void addAndDeleteTest() throws DukeException {
        TaskList testTaskList = new TaskList();
        testTaskList.addTodo("do testing");
        testTaskList.addDeadline("do hw /by", "2023-02-02");
        int expectedSize = testTaskList.size();
        int actualSize = 2;
        assertEquals(expectedSize, actualSize);
        assertEquals(testTaskList.delete(0), String.format("OK, I've deleted: %s\n", new Todo("do testing")));
    }
}
