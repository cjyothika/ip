package duke.command;

import java.io.IOException;
import duke.task.TaskList;
import duke.Ui;
import duke.Storage;
import duke.DukeException;

public class ExitCommand extends Command{

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        ui.sayGoodbye();
        try {
            storage.save(tasks.getTasksToSave());
        } catch (IOException e) {
            throw new DukeException("unable to save tasks");
        }
    }
}
