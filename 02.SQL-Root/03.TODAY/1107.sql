-- select문 50개 만들기
----------------------------------------------------------
-- SELECT * FROM `테이블명` 
-- -> 전체 데이터 조회,전체 컬럼조회

-- 쿼리 1 : 'customers' 테이블
SELECT * FROM `customers`;
----------------------------------------------------------
-- SELECT 컬럼명(들) FROM `테이블명` 
-- -> 전체 데이터 조회, 일부컬럼 조회 

-- 쿼리 2 : 'customers' 테이블
SELECT `first_name`,`company`,`business_phone` FROM `customers`;
----------------------------------------------------------
-- SELECT * FROM `테이블명` WHERE 컬럼명 = 값
-- -> 데이터 중 조건에 맞는 데이터 조회

-- 쿼리 3 : 'customers' 테이블
SELECT `first_name`,`company`,`business_phone` FROM `customers` WHERE `first_name`="Daniel";
----------------------------------------------------------