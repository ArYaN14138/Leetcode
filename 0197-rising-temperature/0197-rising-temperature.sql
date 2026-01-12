Select w1.id 
from Weather as w1
join Weather as w2

on w1.recordDate=DATE_ADD(w2.recordDate,Interval 1 DAY )
where w1.temperature>w2.temperature;

/*
SELECT w1.id
FROM Weather w1, Weather w2
WHERE DATEDIFF(w1.recordDate, w2.recordDate) = 1
AND w1.temperature > w2.temperature;*/