/**
 * @param {number[][]} mat
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(mat, r, c) {
    let sol = [];
  if (r * c !== mat.length * mat[0].length) return mat;
  mat = mat.flat();
  for (let i = 0, k = 0; i < r; i++) {
    let temp = [];
    for (let j = 0; j < c; j++) {
      temp.push(mat[k]);
      k++;
    }
    sol.push(temp);
  }
  return sol; 
};