--LINK: https://leetcode.com/problems/fix-names-in-a-table/description/?envType=study-plan-v2&envId=top-sql-50
SELECT user_id, INITCAP(LOWER(name)) AS name FROM Users ORDER BY user_id;