package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.exception.PlayerException;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        if (media instanceof Playable) {
            JButton playButton = new JButton("Play");
            container.add(playButton);

            playButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        ((Playable) media).play();
                        JDialog dialog = new JDialog();
                        dialog.setTitle("Play");
                        dialog.add(new JLabel("Playing " + media.getTitle()));
                        dialog.pack();
                        dialog.setLocationRelativeTo(MediaStore.this);
                        dialog.setModal(true);
                        dialog.setVisible(true);
                    } catch (PlayerException ex) {
                        JOptionPane.showMessageDialog(
                            MediaStore.this,
                            ex.getMessage(),
                            "Playback Error",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                }
            });
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
