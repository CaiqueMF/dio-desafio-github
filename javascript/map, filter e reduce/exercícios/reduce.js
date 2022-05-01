function somaArray(arr){
    return arr.reduce(function(prev, current){
        return prev + current
    })
}
const arr = [1,2,3]
console.log(somaArray(arr))



function reduzirSaldo(arr, saldo){
    return arr.reduce(function(prev, current){
        return prev - current
    }, saldo)
}
console.log(reduzirSaldo(arr,100))