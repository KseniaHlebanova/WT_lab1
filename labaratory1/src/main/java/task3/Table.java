package task3;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table {
    public DefaultTableModel createTableModel(int a, int b, int h) {
        int steps = Math.abs(a - b) / h;
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Argument", "Result"}, 0);

        for (int i = 0; i <= steps; i++) {
            int argument = a + i * h;
            double result = Math.tan(argument);
            tableModel.addRow(new Object[]{argument, result});
        }

        return tableModel;
    }

    public void drawTable(int a, int b, int h) {
        DefaultTableModel model = createTableModel(a, b, h);

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JFrame frame = new JFrame("Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}

