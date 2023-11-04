package Test3;

import task3.Table;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JTable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TableTest {
    @Test
    public void testCreateTableModel() {
        Table table = new Table();
        int a = -10;
        int b = 10;
        int h = 1;

        DefaultTableModel model = table.createTableModel(a, b, h);
        Assertions.assertNotNull(model);
        Assertions.assertEquals(21, model.getRowCount());

        for (int i = 0; i < model.getRowCount(); i++) {
            int argument = (int) model.getValueAt(i, 0);
            double result = (double) model.getValueAt(i, 1);
            Assertions.assertEquals(Math.tan(argument), result, 0.001);
        }
    }

}
