// Java03.연산자와 제어문
public class Java03 {
    public static void main(String[] args) {
/*  [ 자바 연산자 ] 
    : 변수와 값에 대한 연산을 수행하는데 사용됨

    [1.산술 연산자] : 일반적인 수학 연산을 수행하는 데 사용

    +	더하기	x + y	
    -	빼기	x - y	
    *	곱하기	x * y	
    /	나누기	x / y	
    %	나머지	x % y	
    ++	1씩증가	++x	
    --	1씩감소	--x
*/
    System.out.println("[ 1. 산술연산자 ]");
    System.out.println("사칙연산: ");
    System.out.println("3+7*9/20-5="+(3+7*9/20-5));
    System.out.println("나머지연산자: ");
    System.out.println("500을 7로 나눈 나머지는?: " + (500%7));

    System.out.println("증감연산자:");
    int worldNum = 78;
    System.out.println("현재 세계인구는 " + worldNum +  "억이다. \n5년 뒤 10억명이 더 늘어난다고 한다. \n현재인구에서 1억명만 더 늘려봐라! " +
    // (worldNum++)+"억명");
    (++worldNum)+"억명");

    // ++이 뒤에 있으면 출력이 먼저되고 증가
    // ++이 앞에 있으면 먼저 증가되고 출력!

    System.out.println("worldNum의 값: " + worldNum);

//  [2. 할당연산자] : = 오른쪽의 값을 왼쪽에 할당함!

//  [3. 대입연산자] : 기존값에 연산을 중첩함
//  -> += , -=, *=, /=, %=

    // 현재 인구수 조정
    System.out.println("현재 인구수 조정" +(--worldNum));

    System.out.println();
    System.out.println("[ 3. 대입연산자 ]");
    System.out.println("5년 뒤 인구는 몇명인가?: " + (worldNum+=10)+"억명");

//  [4. 비교연산자] : >,<,==,!=,>=,<=
// -> 조건문에 값을 비교하여 true / false의 결과가 나옴
    System.out.println();
    System.out.println("[ 4. 비교연산자 ]");
    int braAge = 19;
    int myAge = 18;
    System.out.println("내가 알던 형은 형인가? " + (braAge>myAge));
    System.out.println("내가 알던 형은 형인가? " + (braAge>myAge?"응, 형맞아!":"아니, 동생이었어"));

    System.out.println();
    System.out.println("테스트");

    float a = 1.1f;
    float b = 0.1f;
    System.out.println("1.1 + 0.1 = 1.2 |"+(a+b==1.2));


//  [5. 논리연산자] : &&(논리곱), ||(논리합), !(논리부정)
// &&(논리곱) -> 모두 true이면 true
// ||(논리합) -> 하나만 true이면 true
// !(논리부정) -> true / false 결과 반대로 출력!
    System.out.println();
    System.out.println("[ 5. 논리연산자 ]");
    String man = "남자";
    int age = 20;

    System.out.println();

    // 논리곱
    System.out.println("한 사람의 성별과 나이가 각각 남자이고 20세 이상이면 회원자격을 준다. 이 사람은 회원인가? |" + (man=="남자"&&age>=20));

    System.out.println();

    // 논리합
    System.out.println("한 사람의 성별과 나이가 각각 남자이거나 20세 이상이면 회원자격을 준다. 이 사람은 회원인가? |" + (man=="남자"||age>=20));

    System.out.println();

    boolean mem = false;
    // 논리부정
    // false의 결과를 true로
    // 처리해야할 때 사용함
    System.out.println("회원이 아니면 나가세요! 라고 말한다! |" + (!mem?"나가세요":"어서오세요"));
    }
}