import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SmartToDoApp extends JFrame {

    private JPanel taskPanel;
    private JTextField taskInput;

    public SmartToDoApp() {
        setTitle("Smart To-Do List");
        setSize(480, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(245, 245, 245));

        // Header with icon and title
        JLabel title = new JLabel("✨ My Daily Tasks", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 28));
        title.setForeground(Color.BLACK); // Changed to black
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        // Input panel with gradient
        JPanel inputPanel = new JPanel(new BorderLayout()) {
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, new Color(144, 238, 144), getWidth(), getHeight(), new Color(0, 128, 0)); // light green to dark green
                g2.setPaint(gp);
                g2.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        inputPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        taskInput = new JTextField();
        taskInput.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        taskInput.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));
        inputPanel.add(taskInput, BorderLayout.CENTER);

        JButton addButton = new JButton("+");
        addButton.setFont(new Font("Segoe UI", Font.BOLD, 22));
        addButton.setForeground(Color.BLACK); // Text in black
        addButton.setBackground(Color.GREEN); // Button in green
        addButton.setFocusPainted(false);
        addButton.setBorderPainted(false);
        inputPanel.add(addButton, BorderLayout.EAST);

        add(inputPanel, BorderLayout.SOUTH);

        // Scrollable task list
        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
        taskPanel.setBackground(new Color(245, 245, 245));

        JScrollPane scrollPane = new JScrollPane(taskPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        scrollPane.setBackground(new Color(245, 245, 245));
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);

        // Button actions
        addButton.addActionListener(e -> addTask());
        taskInput.addActionListener(e -> addTask());

        setVisible(true);
    }

    private void addTask() {
        String text = taskInput.getText().trim();
        if (!text.isEmpty()) {
            JPanel taskContainer = new JPanel(new BorderLayout());
            taskContainer.setMaximumSize(new Dimension(420, 50));
            taskContainer.setBackground(Color.WHITE);
            taskContainer.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
            ));

            JCheckBox taskCheckBox = new JCheckBox(text);
            taskCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            taskCheckBox.setBackground(Color.WHITE);
            taskCheckBox.setForeground(Color.BLACK);

            JButton deleteButton = new JButton("🗑");
            deleteButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            deleteButton.setForeground(Color.RED); // Red for delete
            deleteButton.setBackground(Color.WHITE);
            deleteButton.setFocusPainted(false);
            deleteButton.setBorderPainted(false);

            deleteButton.addActionListener(e -> {
                taskPanel.remove(taskContainer);
                refreshTasks();
            });

            taskContainer.add(taskCheckBox, BorderLayout.CENTER);
            taskContainer.add(deleteButton, BorderLayout.EAST);
            taskPanel.add(taskContainer);
            taskInput.setText("");

            refreshTasks();
        }
    }

    private void refreshTasks() {
        taskPanel.revalidate();
        taskPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SmartToDoApp::new);
    }
}