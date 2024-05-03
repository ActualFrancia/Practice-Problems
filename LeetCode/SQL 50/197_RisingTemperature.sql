SELECT w1.id
FROM Weather as w1
INNER JOIN Weather as w2
        ON datediff(w1.recordDate, w2.recordDate) = 1
       AND w1.temperature > w2.temperature