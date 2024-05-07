SELECT p.project_id,
       round(avg(e.experience_years), 2)
       as average_years
FROM Project as p
LEFT JOIN Employee as e
    USING (employee_id)
GROUP BY p.project_id