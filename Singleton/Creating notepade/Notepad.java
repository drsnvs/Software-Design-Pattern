import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Notepad extends Frame {
    private static Notepad instance;
    private TextArea textArea;
	private File currentFile;
	
    private Notepad() {
        setTitle("Notepad");
        setSize(600, 400);
        textArea = new TextArea();
        add(textArea);
		addMenuBar();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    public static Notepad getInstance() {
        if (instance == null) {
            instance = new Notepad();
        }
		// instance = new Notepad();
        return instance;
    }

    private void addMenuBar() {
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });
        
        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);
        setMenuBar(menuBar);
    }
	private void openFile() {
        FileDialog fileDialog = new FileDialog(this, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);
        String directory = fileDialog.getDirectory();
        String fileName = fileDialog.getFile();
        if (directory != null && fileName != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(new File(directory, fileName)))) {
                String line;
                StringBuilder text = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    text.append(line).append("\n");
                }
                textArea.setText(text.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveFile() {
        if (currentFile == null) {
            FileDialog fileDialog = new FileDialog(this, "Save File", FileDialog.SAVE);
            fileDialog.setVisible(true);
            String directory = fileDialog.getDirectory();
            String fileName = fileDialog.getFile();
            if (directory != null && fileName != null) {
                currentFile = new File(directory, fileName);
            }
        }
        if (currentFile != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile))) {
                writer.write(textArea.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
