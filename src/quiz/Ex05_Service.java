package quiz;

import java.util.Scanner;

public class Ex05_Service {
	private Ex05_Dto dto; 
	public Ex05_Service() {
		dto = new Ex05_Dto();
	}
	public int loginCheck(String inputId, String inputPwd) {
		if( inputId.equals( dto.getSaveId() ) ) {
			if( inputPwd.equals( dto.getSavePwd() ) ) {
				//System.out.println("인증 통과");
				return 0;
			}else {
				//System.out.println("비번틀림!!!!");
				return 1;
			}
		}else {
			//System.out.println("존재하지 않는 id");
			return -1;
		}
	}
	public int register(String saveId, String savePwd) {
		if( dto.getSaveId() == null ) {
			dto.setSaveId(saveId);
			dto.setSavePwd(savePwd);
			//System.out.println("저장 완료");
			return 0;
		}else {
			return 1;
			//System.out.println("이미 저장되어 있음");
			//System.out.println("탈퇴 먼저 하세요");
		}
	}
	public int memberOut() {
		if( dto.getSaveId() == null) {
			//System.out.println("회원가입 먼저하세요");
			return 1;
		}else {
			dto.setSaveId(null);
			dto.setSavePwd(null);
			//saveId = null; savePwd = null;
			//System.out.println("탈퇴 성공!!!");
			return 0;
		}
	}
	public void disp() {
		Scanner input = new Scanner(System.in);
		String saveId=null, savePwd=null,
				inputId=null, inputPwd=null;
		int num , result;
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.탈퇴");
			System.out.println("4.종료");
			num = input.nextInt();
			switch ( num ) {
			case 1:
				System.out.println("인증 id 입력");
				inputId = input.next();
				System.out.println("인증 pwd 입력");
				inputPwd = input.next();
				result = loginCheck(inputId, inputPwd);
				if( result == 0 ) {
					System.out.println("인증 통과");
				}else if(result ==1) {
					System.out.println("비번 틀림");
				}else {
					System.out.println("존재 id 없음");
				}
				break;
			case 2:
				System.out.println("저장 id 입력");
				saveId = input.next();
				System.out.println("저장 pwd 입력");
				savePwd = input.next();
				
				result = register(saveId, savePwd);
				if( result == 0) {
					System.out.println("가입 축하!!!");
				}else {
					System.out.println("가입 실패!!!");
				}
				break;
			case 3:
				result = memberOut();
				if( result == 0 ) {
					System.out.println("탈퇴 성공");
				}else {
					System.out.println("가입되어 있음!!!");
				}
				break;
			case 4:
				System.out.println("종료");
				return;
			}
		}
	}
}



