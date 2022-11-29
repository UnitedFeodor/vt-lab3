package presentation;

import model.File;

public interface View {

    void print(File file);

    void print(String text);
}
