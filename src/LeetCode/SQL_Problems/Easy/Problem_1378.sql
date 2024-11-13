--LINK: https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/?envType=study-plan-v2&envId=top-sql-50
SELECT Employees.name, EmployeeUNI.unique_id FROM Employees
LEFT JOIN EmployeeUNI ON EmployeeUNI.id = Employees.id;