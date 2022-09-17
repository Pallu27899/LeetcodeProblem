/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
     let result = [];
    
    for(let i = 0; i < numRows; i++)
    {
        result[i] = [];
        result[i][0] = result[i][i] = 1;
        for(let j = 1; j < i; j++)
        {
               result[i][j] = result[i-1][j] + result[i-1][j-1]; 
        }
    }
    return result;
};