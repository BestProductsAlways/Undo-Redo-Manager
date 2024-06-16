public class DeleteCommand implements Command {
    private String text;

    public DeleteCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        // code to delete text
    }

    @Override
    public void undo() {
        // code to undo delete text
    }
}


