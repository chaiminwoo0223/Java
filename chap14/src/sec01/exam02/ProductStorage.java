package sec01.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Scanner로 입력된 문자열 얻기
public class ProductStorage {
	private List<Product> list = new ArrayList<>(); // List 컬렉션 생성
	private Scanner scanner = new Scanner(System.in); // 키보드 입력 Scanner 생성
	private int counter; // pno 제공 카운터

	public void showMenu() {
		while(true) {
			System.out.println("--------------------");
			System.out.println("1.등록 | 2.목록 | 3.종료");
			System.out.println("--------------------");

			System.out.print("선택: ");
			String selectNo = scanner.nextLine(); // 번호 읽기
			switch(selectNo) {
			case "1": // Product 등록
				registerProduct();
				break;
			case "2": // 등록된 모든 Product 정보 보기
				showProducts();
				break;
			case "3": // 프로그램 종료
				return;
			}
		}
	}

	public void registerProduct() {
		try {
			// pno 세팅
			Product product = new Product();
			product.setPno(++counter);

			// 이름을 읽고 세팅
			System.out.print("상품명: ");
			product.setName(scanner.nextLine());

			// 가격을 읽고 세팅
			System.out.print("가격: ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));

			// 재고를 읽고 세팅
			System.out.print("재고: ");
			product.setStock(Integer.parseInt(scanner.nextLine()));

			// list에 Product 저장
			list.add(product);
		} catch(Exception e) {
			System.out.println("등록 에러: " + e.getMessage());
		}
	}

	public void showProducts() {
		// list에 저장된 모든 Product 정보를 모니터에 출력
		for(Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
}
