/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
 let longLen = 0;
    let longL = 0;
    let longR = 0;

    var getLongPalindrome = function (lp, rp) {   
        while (
            lp >= 0 &&
            rp < s.length &&
            s[lp] === s[rp] ) {
            
            lp--;
            rp++;
        }

        if (rp - lp > longLen) {
            longL = lp + 1;
            longR = rp - 1;
            longLen = longR - longL + 1;
        }
    };


    for (let i = 0; i < s.length; i++) {
        getLongPalindrome(i, i + 1);

        getLongPalindrome(i, i);

        if ((s.length - i) * 2 < longLen) {
            break;
        }
    }

    return s.slice(longL, longR + 1);
};