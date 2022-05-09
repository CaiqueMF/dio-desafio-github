import React, {Component} from "react"
import ReactDOM from "react-dom"
import "./styles.css"
import Button from "./Button"

function soma(a, b){
    alert(a+b)
}


class Teste2 extends Component {

    constructor(props){
        super(props)
        this.state={
            clock: 1000,
            copo: "água"
        }
    }

    componentDidMount(){
        window.setTimeout(() => {
            this.setState({
                copo:"suco"
            })
        }, 3000)
    }

    alterarCopo = () => {
        this.setState({
            copo: "refrigerante"
        })
    }
    render(){
        const {clock, copo} =this.state
        return(
            <div>
                <h1>{clock}</h1>
                <button onClick={() => this.alterarCopo()}>{copo}</button>
            </div>
        )
    }
}



function testejsx() {
    return (
        <div className="teste">
            testando jsx
            <h1>
            soma 10 + 20 = <Button onClick={ () => soma(10,20)} name="ver resultado"/>
            </h1>
        </div>
    )
}
var testeDeCondicional = true
const testeDeLista = [
    {nome: 'josé', presta: true},
    {nome: 'maria', presta: true},
    {nome: 'ninguém', presta: false}
]
function pessoaPresta(prestometro) {
    let aprovado = 'presta sim, chefia'
    if(!prestometro){
        aprovado = 'não presta não'
    }
    return aprovado
}

const Botao = <button onClick={()=>console.log('testando')}>testando</button>
const App = () => {
    const lerLista = (pessoa, index) => {
        return (
            <li key={'indentificador único de pessoa -'+index}>{pessoa.nome} {pessoaPresta(pessoa.presta)}</li>
        )
    }
    return (
        <div className="App">
            {Botao}
            {testeDeCondicional ? (
                <div> deu certo </div>
            ): (
                <div> não deu </div>
            )}
            {testejsx()}
            {testeDeLista.map(lerLista)}
        </div>
    )
}

const rootElement = document.getElementById("root")
ReactDOM.render(<App />, rootElement)