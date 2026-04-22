package hust.soict.elitech.aims;
import hust.soict.elitech.aims.cart.Cart2;
import hust.soict.elitech.aims.disc.DigitalVideoDisc;
public class Aims2 {

	 public static void main(String[] args) {
		//Tạo một giỏ hàng mới
	        Cart2 anOrder = new Cart2();
	        
	        //Tạo các đối tượng dvd mới và thêm chúng vào giỏ hàng
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
	                "Animation", "Roger Alters", 87, 19.95f);
	       
	        
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
	                "Science Fiction", "George Lucas", 87, 24.95f);
	        
	        
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
	                "Animation", "John Musker", 90, 18.99f);
	        
	        
	        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Frozen", 
	                "Animation", "Chris Buck", 102, 22.99f);
	        
	        
	        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Avatar", 
	                "Science Fiction", "James Cameron", 162, 29.99f);
	        
	        
	        // Hiển thị giỏ hàng trước khi xóa
	        System.out.println("GIỎ HÀNG BAN ĐẦU:");
	        anOrder.displayCart();
	        
	        // Test phương thức addDigitalVideoDisc với một tham số
	        System.out.println("===== THÊM MỘT ĐĨA =====");
	        anOrder.addDigitalVideoDisc(dvd1);
	        anOrder.displayCart();
	        
	        // Test phương thức addDigitalVideoDisc với hai tham số
	        System.out.println("\n===== THÊM HAI ĐĨA =====");
	        anOrder.addDigitalVideoDisc(dvd2, dvd3);
	        anOrder.displayCart();
	        
	        // Test phương thức addDigitalVideoDisc với varargs (số lượng tham số biến đổi)
	        System.out.println("\n===== THÊM VỚI VARARGS =====");
	        // Tạo giỏ hàng mới để kiểm tra varargs
	        Cart2 anotherOrder = new Cart2();
	        anotherOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd5, dvd6);
	        anotherOrder.displayCart();
	        
	        // So sánh cách sử dụng mảng và varargs
	        System.out.println("\n===== NHẬN XÉT VỀ MẢNG VÀ VARARGS =====");
	        System.out.println("Sử dụng varargs thuận tiện hơn vì:");
	        System.out.println("1. Không cần phải tạo mảng trước khi gọi phương thức");
	        System.out.println("2. Có thể truyền số lượng tham số tùy ý (0, 1, 2, ...)");
	        System.out.println("3. Cú pháp gọi phương thức đơn giản và trực quan hơn");
	        System.out.println("4. Xử lý nội bộ tương tự như mảng nhưng có giao diện người dùng thân thiện hơn");
	        
	        // Thử nghiệm chức năng xóa đĩa DVD
	        System.out.println("\nXÓA DVD \"Aladin\" KHỎI GIỎ HÀNG...");
	        if (anOrder.removeDigitalVideoDisc(dvd3)) {
	            System.out.println("Đã xóa DVD \"Aladin\" thành công!");
	        } else {
	            System.out.println("Không thể xóa DVD \"Aladin\"!");
	        }
	        
	        // Hiển thị giỏ hàng sau khi xóa
	        System.out.println("\nGIỎ HÀNG SAU KHI XÓA:");
	        anOrder.displayCart();
	        
	        // Thử nghiệm xóa một DVD khác
	        System.out.println("\nXÓA DVD \"Star Wars\" KHỎI GIỎ HÀNG...");
	        if (anOrder.removeDigitalVideoDisc(dvd2)) {
	            System.out.println("Đã xóa DVD \"Star Wars\" thành công!");
	        } else {
	            System.out.println("Không thể xóa DVD \"Star Wars\"!");
	        }
	        
	        // Hiển thị giỏ hàng sau khi xóa DVD thứ hai
	        System.out.println("\nGIỎ HÀNG SAU KHI XÓA LẦN THỨ HAI:");
	        anOrder.displayCart();
	        
	        // Thử nghiệm chức năng xóa với DVD không có trong giỏ hàng
	        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Interstellar", 
	                "Science Fiction", "Christopher Nolan", 169, 50.99f);
	        System.out.println("\nXÓA DVD \"Interstellar\" KHÔNG CÓ TRONG GIỎ HÀNG...");
	        if (anOrder.removeDigitalVideoDisc(dvd4)) {
	            System.out.println("Đã xóa DVD \"Interstellar\" thành công!");
	        } else {
	            System.out.println("Không thể xóa DVD \"Interstellar\" (không tìm thấy DVD này trong giỏ hàng)!");
	        }
	        
	        // Hiển thị giỏ hàng cuối cùng
	        System.out.println("\nGIỎ HÀNG CUỐI CÙNG:");
	        anOrder.displayCart();
	    }
	}