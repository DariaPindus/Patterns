package old.commands;

import old.objects.GarageDoor;

/**
 * Created by daria_p on 22.11.16.
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }

    @Override
    public void undo() {
        door.open();
    }
}
