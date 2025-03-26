select  DATE_FORMAT(DATETIME, '%H') AS Hour , COUNT(*) FROM ANIMAL_OUTS 
where  HOUR(DATETIME) > 8 AND HOUR(DATETIME) < 20
group by hour
order by hour