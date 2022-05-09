import React, {Component} from "react";

class ToDoListStateful extends Component {

  constructor(props){
    super(props)
    this.state ={
      items: [
        'tomate',
        'alface',
        'melancia'
      ]
    }
  }
  addItem = (item) => {
    this.setState({items:[...this.state.items, item]})
  }
  removeItem = () => {
    this.setState({items:[...this.state.items.slice(1)]})
  }
  render (){
    return (
      <div className="bloco-lista">
        <p>minha lista classname</p>
        <ul className="lista-estilizada">
          {this.items.map(item => <li>{item}</li>)}
        </ul>
        <button onClick={() => this.addItem('abóbora')}>Adicionar item</button>
        <button onClick={() => this.removeItem()}>Remover item</button>
      </div>
    )
  }
}