package command.impl;

import command.Command;
import service.FileBaseService;
import service.impl.ServiceProvider;

public class AddFileCommand implements Command {

    FileBaseService fileBaseService = ServiceProvider.getInstance().getFileBaseService();

    @Override
    public String execute(String request) {
        String response;
        response = "file added!";
        //fileBaseService.addFile();
        return response;
    }
}
