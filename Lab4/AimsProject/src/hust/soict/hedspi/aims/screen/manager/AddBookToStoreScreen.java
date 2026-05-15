package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookToStoreScreen extends AddItemToStoreScreen {

    private JTextField tfTitle, tfCategory, tfAuthor, tfCost;

    public AddBookToStoreScreen(Store store) {
        super(store);
        setTitle("Add Book to Store");

        JPanel center = new JPanel(new GridLayout(5, 2, 5, 5));

        center.add(new JLabel("Title:"));
        tfTitle = new JTextField(20);
        center.add(tfTitle);

        center.add(new JLabel("Category:"));
        tfCategory = new JTextField(20);
        center.add(tfCategory);

        center.add(new JLabel("Author:"));
        tfAuthor = new JTextField(20);
        center.add(tfAuthor);

        center.add(new JLabel("Cost:"));
        tfCost = new JTextField(20);
        center.add(tfCost);

        JButton addButton = new JButton("Add");
        center.add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = tfTitle.getText();
                String category = tfCategory.getText();
                String author = tfAuthor.getText();
                float cost = Float.parseFloat(tfCost.getText());

                Book newBook = new Book(title, category, cost, author);
                store.addMedia(newBook);

                JOptionPane.showMessageDialog(null, "Book added successfully!");

                dispose();  
                new StoreManagerScreen(store);  
            }
        });

        getContentPane().add(center, BorderLayout.CENTER);
    }
}
