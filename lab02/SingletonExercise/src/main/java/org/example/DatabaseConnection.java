package org.example;

public class DatabaseConnection {
    // 'volatile' đảm bảo các Thread đọc giá trị mới nhất của biến
    private static volatile DatabaseConnection instance;

    private DatabaseConnection() {
        // Chống phá khóa bằng Reflection
        if (instance != null) {
            throw new RuntimeException("Dùng getInstance() ấy bạn ơi!");
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) { // Check 1
            synchronized (DatabaseConnection.class) {
                if (instance == null) { // Check 2S
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void executeQuery(String sql) {
        System.out.println("Đang thực thi: " + sql + " trên instance: " + this.hashCode());
    }
}