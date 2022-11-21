package fruitpack.asia;

import fruitpack.america.south.PeruFruit;

// import fruitpack.america.south.PeruFruit;

public class KoreaFruit extends PeruFruit{
    // extends PeruFruit -> 페루가 수퍼클래스가 됨, 한국은 서브클래스 됨!
    // 수퍼클래스 == 부모클래스 , 서부클래스 == 자식클래스
    public void KoreaFn(){
        System.out.println("한국산 과일은 제주밀감입니다!");

        // 페루의 protected 메서드를 호출할 수 있나?
        // PeruFruit peru = new PeruFruit();
        // peru.PeruFn(); -> 프로텍티드 메서드 보이지도 않음!

        // 페루의 자식클래스가 됐을 때 페루의 protected 메서드 호출 가능!
        // 부모클래스는 super 키워드로 부를 수 있다!
        System.out.println("***한국은 페루의 서브클래스가 되어 페루 호출!");
        super.peruFnProtected();
    } 
}
