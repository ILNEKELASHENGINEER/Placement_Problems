/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let ot = []
    for(var i = 0;i<arr.length;i++){
        if(fn(arr[i],i)){
            ot.push(arr[i]);
        }
    }
    return ot;
};
