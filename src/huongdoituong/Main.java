package huongdoituong;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        employeeDao dao = new employeeDao();

        // Thêm nhân viên
        employee newEmployee = new employee(0, "Nguyen Van A", "Khoa A", 5000);
        dao.addEmployee(newEmployee);

        // Tìm kiếm thông tin nhân viên
        employee searchEmployee = dao.findEmployeeById(3);
        if (searchEmployee != null) {
            System.out.println("Thong tin nhan vien:");
            System.out.println("ID: " + searchEmployee.getID());
            System.out.println("Ten: " + searchEmployee.getTen());
            System.out.println("Khoa: " + searchEmployee.getKhoa());
            System.out.println("Luong: " + searchEmployee.getLuong());
            System.out.println("=====================");
        } else {
            System.out.println("Khong tim thay nhan vien co ID = 3");
        }

        // Xóa nhân viên
        dao.deleteEmployee(1);

        // Lấy danh sách tất cả nhân viên
//        List<employee> employees = dao.getAllEmployees();
//        for (employee emp : employees) {
//            System.out.println("ID: " + emp.getID());
//            System.out.println("Ten: " + emp.getTen());
//            System.out.println("Khoa: " + emp.getKhoa());
//            System.out.println("Luong: " + emp.getLuong());
//            System.out.println("=====================");
//        }

        // Đóng kết nối
        dao.closeConnection();
    }
}