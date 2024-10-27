package quiz;

import java.util.Scanner;

public class Ex04_Service {
	//private String saveId, savePwd;
	private Ex04_Dto dto;//dto 회원저장
	public Ex04_Service() {
		dto = new Ex04_Dto();
	}
	public void loginCheck() {
		Scanner input = new Scanner(System.in);
		String inputId, inputPwd;
		System.out.println("인증 id 입력");
		inputId = input.next();
		System.out.println("인증 pwd 입력");
		inputPwd = input.next();
		if (inputId.equals(dto.getSaveId())) {
			if (inputPwd.equals(dto.getSavePwd())) {
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
		String saveId = input.next();
		dto.setSaveId(saveId);
		System.out.println("저장 pwd 입력");
		dto.setSavePwd(input.next());
		System.out.println("저장 완료");
	}

	public void memberOut() {
		if (dto.getSaveId() == null) {
			System.out.println("회원가입 먼저 하세요");
		} else {
			dto.setSaveId(null);
			dto.setSavePwd(null);
			//saveId = savePwd = null;
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