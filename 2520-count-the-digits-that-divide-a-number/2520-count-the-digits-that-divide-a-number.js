/**
 * @param {number} num
 * @return {number}
 */
var countDigits = function(num) {
    let arrNum = String(num).split("") // first of all you need to convert this into String because you need to use split("") function 
   let count = 0 ;
    for(let i = 0 ; i < arrNum.length ; i++){
        if(num % arrNum[i] == 0 ){ // check if  number is divisible by numbers in the arrNum then increase the count++
            count++
        }
    }

    return count 
};