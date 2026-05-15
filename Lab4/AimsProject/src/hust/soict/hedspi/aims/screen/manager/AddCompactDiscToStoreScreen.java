package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle, tfCategory, tfArtist, tfDirector, tfLength, tfCost;

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add CD to Store");

        JPanel center = new JPanel(new GridLayout(7, 2, 5, 5));

        center.add(new JLabel("Title:"));
        tfTitle = new JTextField(20);
        center.add(tfTitle);

        center.add(new JLabel("Category:"));
        tfCategory = new JTextField(20);
        center.add(tfCategory);

        center.add(new JLabel("Artist:"));
        tfArtist = new JTextField(20);
        center.add(tfArtist);

        center.add(new JLabel("Director:"));
        tfDirector = new JTextField(20);
        center.add(tfDirector);

        center.add(new JLabel("Length:"));
        tfLength = new JTextField(20);
        center.add(tfLength);

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
                String artist = tfArtist.getText();
                String director = tfDirector.getText();
                int length = Integer.parseInt(tfLength.getText());
                float cost = Float.parseFloat(tfCost.getText());

                CompactDisc cd = new CompactDisc(title, category, artist, director, length, cost);
                store.addMedia(cd);

                JOptionPane.showMessageDialog(null, "CD added successfully!");
                dispose();
                new StoreManagerScreen(store);
            }
        });

        getContentPane().add(center, BorderLayout.CENTER);
    }
}
