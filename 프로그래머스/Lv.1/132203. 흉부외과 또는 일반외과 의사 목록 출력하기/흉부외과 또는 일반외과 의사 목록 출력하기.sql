-- 코드를 입력하세요
-- 이름, 의사ID, 진료과, 고용일자

SELECT DR_NAME, DR_ID, MCDP_CD, 
    DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD LIKE 'CS' OR MCDP_CD LIKE 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME ASC
