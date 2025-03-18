SELECT 
    mcdp_cd AS "진료과코드", 
    COUNT(*) AS "5월예약건수"
FROM
(
    SELECT 
        mcdp_cd  
    FROM APPOINTMENT 
    WHERE APNT_YMD BETWEEN TO_DATE('2022-05-01', 'YYYY-MM-DD') 
                        AND TO_DATE('2022-05-31', 'YYYY-MM-DD')
  
)    
GROUP BY mcdp_cd
ORDER BY "5월예약건수" ASC, mcdp_cd ASC