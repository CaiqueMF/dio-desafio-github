const mult = {
    value: 2
}

function mapThis(arr, thisArg){
    return arr.map(function(item){
       return item * this.value
    }, thisArg)
}
function mapSemThis(arr){
    return arr.map(function(item){
        return item*2
    })
}
const ar = [1,2,3]
console.log(mapThis(ar,mult))
console.log(mapSemThis(ar))