function reverterTodos () {
    for(tipo of listaElementos){
        for(elemento of tipo){
            elemento.classList.toggle('dark-mode')
            if(elemento.tagName=='button' || elemento.innerHTML=='Dark Mode'){
                elemento.innerHTML='Light Mode'
            }else if(elemento.tagName=='button' || elemento.innerHTML=='Light Mode'){
                elemento.innerHTML='Dark Mode'
            }
            if(elemento.tagName=='h1' || elemento.innerHTML=='Dark Mode ON'){
                elemento.innerHTML='Light Mode ON'
            }else if(elemento.tagName=='h1' || elemento.innerHTML=='Light Mode ON'){
                elemento.innerHTML='Dark Mode ON'
            }
        }
    }
}
const botao = document.getElementById('mode-selector')
const lista = ['h1', 'button', 'footer', 'body']
let listaElementos = []
for(item of lista){
    listaElementos.push(document.getElementsByTagName(item))
}

botao.addEventListener('click',reverterTodos)
