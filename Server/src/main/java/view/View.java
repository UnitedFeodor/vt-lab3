package view;

import model.File;

public interface View {

    void print(String text);

    void print(File file);
}
