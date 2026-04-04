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

				// Hiển thị giỏ hàng trước khi xóa
				System.out.println("GIỎ HÀNG BAN ĐẦU:");
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
		
				// Print total cost
				System.out.println("Total Cost is: ");
				System.out.println(anOrder.totalCost());
			}
		}