package quiz;

import java.util.Scanner;

public class Ex03_Service {
	private String saveId, savePwd;

	public void loginCheck() {
		Scanner input = new Scanner(System.in);
		String inputId, inputPwd;
		System.out.println("인증 id 입력");
		inputId = input.next();
		System.out.println("인증 pwd 입력");
		inputPwd = input.next();
		if (inputId.equals(saveId)) {
			if (inputPwd.equals(savePwd)) {
				System.out.println("인증 통과");
			} else {
				System.out.println("비번 틀림");
			}
		} else {
			System.out.println("존재하지 않는 id");
		}
	}

	public void register() {
		Scanner input = new Scanner(System.in);
		System.out.println("저장 id 입력");
		saveId = input.next();
		System.out.println("저장 pwd 입력");
		savePwd = input.next();
		System.out.println("저장 완료");
	}

	public void memberOut() {
		if (saveId == null) {
			System.out.println("회원가입 먼저 하세요");
		} else {
			saveId = null;
			savePwd = null;
			System.out.println("탈퇴 성공");
		}
	}

	public void disp() {
		Scanner input = new Scanner(System.in);
		int num;
		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.탈퇴");
			System.out.println("4.종료");
			num = input.nextInt();
			switch (num) {
			case 1:
				loginCheck();
				break;
			case 2:
				register();
				break;
			case 3:
				memberOut();
				break;
			case 4:
				System.out.println("종료");
				return;
			}
		}
	}
}