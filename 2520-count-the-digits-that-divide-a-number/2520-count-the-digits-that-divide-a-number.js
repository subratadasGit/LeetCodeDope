/**
 * @param {number} num
 * @return {number}
 */
var countDigits = function(num) {
    let arrNum = String(num).split("")
   let count = 0 ;
    for(let i = 0 ; i < arrNum.length ; i++){
        if(num %  arrNum[i] == 0 ){
            count++
        }
    }

    return count 
};