package task2;

public class AreaChecker {
    static public boolean isUpperArea(int x, int y) {
        if (x >= -4 && x <= 4 && y >= 0 && y <= 5) return true;
        else return false;
    }

    static public boolean isLowerArea(int x, int y) {
        if (x >= -6 && x <= 6 && y >= -3 && y <= 0) return true;
        else return false;
    }

    static public boolean isPointInArea(int x, int y) {
        if (isUpperArea(x, y) || isLowerArea(x, y)) return true;
        else return false;
    }
}

