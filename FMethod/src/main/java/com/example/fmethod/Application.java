package com.example.fmethod;

public class Application {
    Dialog dialog;

    void initialize(String os) {
        if (os.equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (os.equals("Web")) {
            dialog = new WebDialog();
        } else {
            throw new IllegalArgumentException("Unknown operating system.");
        }
    }

    void run() {
        dialog.render();
    }
}