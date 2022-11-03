import java.util.Scanner;

// Java04. 자바 제어문(if, switch, while, for문), 배열
public class Java04 {
    public static void main(String[] args) {
        // [Java 조건 및 If 문]

        // 1. Java는 수학의 일반적인 논리 조건사용

        // (1) 미만: a < b
        // (2) 이하: a <= b
        // (3) 초과: a > b
        // (4) 이상: a >= b
        // (5) 같음: a == b
        // (6) 다름: a != b

        // Scanner를 사용하여 입력데이터 받기!
        // Java.util.Scanner를 import하여 사용함
        // 자동 import 단축키 : alt+shift+O(알쉬오)
        // 스캐너 생성시 값으로 System.in을 설정하여
        // 입력라인이 생성되게 한다!

        // 스캐너는 메모리 영역을 try문으로 감싸서 관리한다!
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("배우의 이름을 입력하시오!");
            // 아래쪽에 입력라인이 생김
            // 입력 후 입력 데이터를 변수에 할당한다
            // nextLine() 메서드로 입력 라인 전체를 가져옴
            // next() 메서드는 단어하나를 가져옴(띄어쓰기 맨 앞단어만)
            // nextInt() -> 숫자를 입력받는 스캐너 메서드(형별도 다 있음)
            String actor = myObj.nextLine();
            System.out.println();
            System.out.println("배우이름: " + actor);

            System.out.println();
            System.out.println("이 배우의 성별을 입력하시오. [ 남자 | 여자 ]");
            String gender = myObj.nextLine();
            System.out.println();
            System.out.println("성별: " + gender);
            System.out.println();

            // 입력창으로 받은 데이터는 엔터기호등 다른
            // 데이터가 포함되어 있어서 == 비교연산자로 하지말고
            // 변수.equals(내용) 메서드로 비교하면
            // 정확히 입력된 데이터만 비교한다!

            /////////////////////////////////////////////////////////
            // 배우 이름에 해당하는 대표작을 표시하는 if문
            // if (actor=="공유") { 데이터 때문에 비교못함
            // 2. if문
            // : 조건이 true일때 실행할 코드를 제어함

            // if (조건문) {
            // // 실행코드
            // } else if (조건문) {
            // // 실행코드
            // } else {
            // // 실행코드
            // }

            // if : 지정된 조건이 true인 경우 실행할 코드
            // else if : 상단 조건이 false인 경우 새로운 조건 추가
            // else : 모든 조건에 해당없을 경우 실행할 코드
            if (actor.equals("공유") && gender.equals("남자")) {
                System.out.println("대표작: 도깨비");
            } // if
            else if (actor.equals("김수현") && gender.equals("남자")) {
                System.out.println("대표작: 별그대");
            } // else if
            else if (actor.equals("김수현") && gender.equals("여자")) {
                System.out.println("대표작: 어벤져스:에이지 오브 울트론");
            } // else if
            else {
                System.out.println("모르는 배우");
            } // else

            //////////////////////////////////////////////////
            // 3. 삼항연산자(짧은 if문)
            // 변수 = (조건문) ? true시 실행문 : false시 실행문;
            // 비?집:놀이동산
            System.out.println();

            System.out.println("오늘은 당신의 생일인가요? [ 예 | 아니오 ]");
            String birth = myObj.nextLine();
            System.out.println();
            System.out.println(
                    birth.equals("예") ? "생일축하합니다" : "오늘도 행복하세요");

            System.out.println();
            ///////////////////////////////////////////////
            // 4. switch 문

            // : 단일조건을 분류하여 실행코드를 나눔

            // switch(변수) {
            // case x:
            // // 실행코드
            // break;
            // case y:
            // // 실행코드
            // break;
            // default:
            // // 실행코드
            // }
            System.out.println("오늘 점심메뉴를 선택하세요!");
            System.out.println("1. 마라탕");
            System.out.println("2. 감자탕");
            System.out.println("3. 돈까스");
            System.out.println("4. 비빔밥");
            System.out.println("5. 기타");

            System.out.println("#메뉴선택번호: ");
            int menu = myObj.nextInt();
            System.out.println();

            // 선텍메뉴 번호에 따라 switch문으로 출력문을 다르게함!
            switch (menu) {
                case 1:
                    System.out.println("마라마라마라탕탕탕");
                    break;
                case 2:
                    System.out.println("감자돌이, 감자순이");
                    break;
                case 3:
                    System.out.println("돈내고 돈까스먹어");
                    break;
                case 4:
                    System.out.println("마구마구비벼먹어");
                    break;
                default:
                    System.out.println("아무거나 먹어");
            }// switch
             ///////////////////////////////////////
             // 5. while문
             // - 조건이 true인 동안 반복실행 코드를 제어함

            // while (조건문) {
            // // 실행코드
            // }
            System.out.println();
            System.out.println(
                    "지금 빵을 몇개 먹고 싶은가? \n개수를 숫자로 써라! 그럼 빵줄게");
            System.out.println("#빵개수: ");
            int bread = myObj.nextInt();
            System.out.println();

            // 숫자 증가변수
            int bnum = 0;
            while (bnum < bread) {
                bnum++; // 1씩 증가
                System.out.println("빵 ");

            } // while

            System.out.println("\n");
            /////////////////////////////////////////////
            // 6. Do/While문
            // - 먼저 코드를 실행후 반복실행 여부를 제어함

            // do {
            // // 실행코드
            // }
            // while (조건문);
            

        } // try문 (스캐너)

        // catch문 (에러발생시 처리 구역)
        catch (Exception e) {
            // e.getMessage() -> 기본 에러메시지
            // System.out.println(e.getMessage());
            // 결과: null -> 내용이 없는 데이터!

            // 사용자가 보여주는 메시지
            System.out.println("꼭 숫자로 입력바랍니다!\n다시갑니다\n");
        }

        // 7. for문
        // - 지정된 횟수 만큼 코드를 반복실행하여 제어함

        // for (시작값; 한계값; 증감) {
        // // 실행코드
        // }

        // (1) 시작값 : 변수선언과 시작값 할당
        // (2) 한계값 : 변수의 한계값 설정
        // (3) 증감 : 변수의 증가 / 감소

        // 8. for-each 문
        // - 배열값 만큼 자동으로 변수에 할당하면 실행코드 반복 제어함

        // for (타입선언변수 : 배열변수명) {
        // // 실행코드
        // }

        // 9. for문 중단,계속 옵션 키워드
        // (1) continue 빼고 계속
        // (2) break 중단
    }
}