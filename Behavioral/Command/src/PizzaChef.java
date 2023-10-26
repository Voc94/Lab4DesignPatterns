class PizzaChef {
    private PizzaCommand currentCommand;

    void setCommand(PizzaCommand command) {
        currentCommand = command;
    }

    void executeCommand() {
        currentCommand.execute();
    }
}
