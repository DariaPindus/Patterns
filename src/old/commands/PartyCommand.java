package old.commands;


public class PartyCommand implements Command {
    Command[] commands;

    public PartyCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command c : commands)
            c.execute();
    }

    @Override
    public void undo() {
        for (Command c : commands)
            c.undo();
    }
}
