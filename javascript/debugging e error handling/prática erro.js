function TamanhoCerto(lista, numero){
    try{
    if (!lista && !numero){
        throw new ReferenceError ('parametros não enviados')
    }
    if (typeof lista !== 'object'){
        throw new TypeError ('lista incorreta')
    }
    if (typeof numero !== 'number')
        throw new TypeError ('numero incorreto')
    if (lista.length !== numero){
        throw new RangeError('tamanho errado')
    }
    return lista
    }
    catch(e){
        if (e instanceof ReferenceError){
            console.log('erro de referência')
            console.log(e.message)
        } else if (e instanceof TypeError){
            console.log('erro de digitação')
            console.log(e.message)
        }else if (e instanceof RangeError){
            console.log('erro de alcance')
            console.log(e.message)
        }else {
            console.log('tipo de erro não esparado, erro: ' + e)
        }

    }
}
TamanhoCerto(1,1)