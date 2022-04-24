function getAdmin(map){
    let admin = []
    for([pessoa, posicao] of map){
        if(posicao ==='admin'){
            admin.push(pessoa)
        }
    }
    return admin
}
const equipe = new Map ()
equipe.set('ana','chefe')
equipe.set('jose','ajudante')
equipe.set('eu','admin')
console.log(getAdmin(equipe))