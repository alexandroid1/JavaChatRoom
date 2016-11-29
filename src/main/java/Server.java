/**
 * Created by Oleksandr on 29.11.2016.
 */
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame {

    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;

    //constructor
    public Server(){
        super("new Messenger");
        userText = new JTextField();
        userText.setEditable(false);
        userText.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {

                    }
                }
        );
    }

}
