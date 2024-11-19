--LINK : https://leetcode.com/problems/big-countries/description/?envType=study-plan-v2&envId=top-sql-50
--code is not working if I put name, population, area with parentheses
SELECT name, population, area FROM World WHERE (area >= 3000000) OR (population >= 25000000);