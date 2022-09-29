var isPalindrome = function(x) {
    return x === Number(x.toString().split("").reverse().join(""));
};
