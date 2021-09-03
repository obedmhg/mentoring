package com.company.class2;

import javax.swing.*;
import java.awt.*;

public class MyJOptionPane extends JOptionPane {
    public static void showMessageDialog(Component parentComponent,
                                         Object message) throws HeadlessException {
        System.out.println("Antes de mostrar el mensaje");
        showMessageDialog(parentComponent, message, UIManager.getString(
                "OptionPane.messageDialogTitle", null),
                INFORMATION_MESSAGE);
        System.out.println("Despues de mostrar el mensaje");
    }

}
