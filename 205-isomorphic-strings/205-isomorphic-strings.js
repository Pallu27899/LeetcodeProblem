/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
     if (s.length !== t.length) return false;

      const a = new Map();
      const b = new Map();

      for (let i = 0; i < s.length; i++) {
        if (a.has(s[i])) {
          if (a.get(s[i]) !== t[i]) {
            return false;
          }
        } else {
          a.set(s[i], t[i])
        }

        if (b.has(t[i])) {
          if (b.get(t[i]) !== s[i]) {
            return false;
          }
        } else {
          b.set(t[i], s[i])
        }
      }

      return true

};