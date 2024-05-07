SELECT s.user_id,
       ifnull(round(sum(c.action = "confirmed") / count(c.action), 2), 0.00) as confirmation_rate
FROM Signups as s
LEFT JOIN Confirmations as c
    USING (user_id)
GROUP BY s.user_id
