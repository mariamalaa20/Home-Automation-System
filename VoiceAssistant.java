public class VoiceAssistant {
    private ICommand command;

    void setCommand(ICommand command){
        this.command = command;
    }
    
    void executeCommand(){
        command.execute();
    }
}
