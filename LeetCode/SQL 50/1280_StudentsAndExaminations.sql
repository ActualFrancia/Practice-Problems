SELECT stu.student_id,
       stu.student_name,
       s.subject_name,
       count(e.student_id) as attended_exams
FROM Students as stu
CROSS JOIN Subjects as s
LEFT JOIN Examinations as e
       ON stu.student_id = e.student_id
      AND s.subject_name = e.subject_name
GROUP BY stu.student_id, s.subject_name
ORDER BY stu.student_id