public class Aims {
	public static void main(String[] args) {

		
				// Create a new cart
				Cart anOrder = new Cart();
		
				// Create new dvd objects and add them to the cart
				DigitalVideoDisc dvd1 = new DigitalVideoDisc(
						"The Lion King", "Animation", "Roger Alters", 87, 19.95f);
				anOrder.addDigitalVideoDisc(dvd1);
		
				DigitalVideoDisc dvd2 = new DigitalVideoDisc(
						"Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
				anOrder.addDigitalVideoDisc(dvd2);
		
				DigitalVideoDisc dvd3 = new DigitalVideoDisc(
					        "Aladin", "Animation", "John Musker", 90, 18.99f);
				anOrder.addDigitalVideoDisc(dvd3);

				DigitalVideoDisc dvd5 = new DigitalVideoDisc("Frozen", 
				   "Animation", "Chris Buck", 102, 22.99f);
				anOrder.addDigitalVideoDisc(dvd5);
		   
		   		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Avatar", 
				   "Science Fiction", "James Cameron", 162, 29.99f);
				anOrder.addDigitalVideoDisc(dvd6);



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
						   
				// Test phương thức addDigitalVideoDisc với mảng tham số
				System.out.println("\n===== THÊM MẢNG ĐĨA =====");
				DigitalVideoDisc[] dvdArray = {dvd5, dvd6};
				anOrder.addDigitalVideoDisc(dvdArray);
				anOrder.displayCart();

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


				// Print total cost
				System.out.println("Total Cost is: ");
				System.out.println(anOrder.totalCost());
			}
		}