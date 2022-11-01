-- 한줄주석(마이너스 기호 2개 뒤에 띄어쓰기)
/* 여러줄 주석 */

-- 할 일 테이블 만들기
CREATE TABLE `todolist`(
    -- 1. 레코드 순서번호(자동증가)
	`idx` int not null AUTO_INCREMENT,
    -- 2. 할일제목
    `title` varchar(200) not null,
    -- 3. 할일내용
    `cont` text(1000) not null,
    -- 4. 입력날짜(자동입력)
    `sysdate` timestamp, 
    -- 기본키설정(idx)
    PRIMARY KEY (idx)
);
--------------------------------------------------------------------
/* 
[ 테이블 컬럼 추가하기 ] 

ALTER TABLE `테이블명`
ADD `컬럼명` 데이터형;

예시)*/
-- 할일리스트에 권한컬럼 추가하기
-- auth.char(1)
ALTER TABLE `todolist`
ADD `auth` char(1);
----------------------------------------------------------------------
/*
[ 테이블 컬럼 지우기 ]

ALTER TABLE `테이블명`
DROP COLUMN `컬럼명`;

예시)*/
ALTER TABLE `todolist`
DROP COLUMN `auth`
------------------------------------------------------------------------
/* 
[ 테이블 컬럼 수정하기(데이터형) ]

ALTER TABLE `테이블명`
MODIFY COLUMN `컬럼명` 데이터형;

예시)*/
-- title컬럼의 데이터형을 기존 varchar(200)에서 varchar(300)으로 변경
ALTER TABLE `todolist`
MODIFY COLUMN `title` varchar(300);
--------------------------------------------------------------------------
-- 기존 auth컬럼의 기본값 넣기로 변경하기!
-- 권한값은 A:Admin, U:User
-- 기본값 U가 들어가게 함!
-- 변경방법: 
-- ALTER TABLE `테이블명` 
-- ALTER COLUMN `컬럼명` SET DEFAULT 값
ALTER TABLE `todolist`
ALTER COLUMN `auth` SET DEFAULT "U"
---------------------------------------------------------------------------
/* 
[ INSERT INTO : 데이터 넣기 ]

INSERT INTO `테이블명` (컬럼명들) VALUES (값들);

예시)

INSERT INTO `friends` (`fname`,`ftel`,`faddr`,`fmsg`) 
VALUES ("이도","01011112222","서울시 종로구","세종대왕 만만세~!!!"); 
*/

-- 데이터를 넣을 때 주의할 점:
-- 1. 자동으로 들어가는 컬럼은 업데이트 하지 않는다.
-- 예) 자동증가번호, 자동입력오늘날짜

-- 2. 데이터형에 맞게 적당한 데이터를 넣는다.
-- 예) int형에 varchar형 데이터를 넣으면 에러남(전체쿼리 실행롤백됨!)
-- 전체롤백 되는 것을 데이터의 무결성원칙이라고 함!

-- 3. 디폴트(DEFAULT)값이 설정된 경우 안넣으면 
-- 기본값 들어가고 넣으면 넣은 값 들어가는 것에 유의

INSERT INTO `todolist` (`title`, `cont`)
VALUES ("SQL 데이터 넣기","insert int로 데이터를 넣어보자");
--------------------------------------------------------------------