-- 코드를 입력하세요
SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS AS I left join ANIMAL_OUTS AS O
on I.ANIMAL_ID = O.ANIMAL_ID

WHERE O.ANIMAL_ID is null

ORDER BY I.DATETIME ASC
LIMIT 3