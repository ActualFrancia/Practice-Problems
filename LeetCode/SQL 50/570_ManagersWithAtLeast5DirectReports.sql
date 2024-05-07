SELECT e1.name
FROM Employee as e1
INNER JOIN Employee as e2
        ON e1.id = e2.managerID
GROUP BY e1.id
HAVING count(e2.managerID) >= 5