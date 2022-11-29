package command.impl;

import command.Command;
import service.FileBaseService;
import service.impl.ServiceProvider;

public class GetFilesBySearchCommand implements Command {

    FileBaseService fileBaseService = ServiceProvider.getInstance().getFileBaseService();

    @Override
    public String execute(String request) {
        return fileBaseService.searchFilesByKeywords(request);
    }
}
