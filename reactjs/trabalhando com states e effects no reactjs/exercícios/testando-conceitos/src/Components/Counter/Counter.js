
function Counter() {
    let quantity = 10
    
    function upQuantity (){
        quantity = quantity + 1
        document.getElementById('counter-box'). innerHTML = quantity
    }

    return (
        <>
            <h1 id="counter-box">{quantity}</h1>
            <button onClick={upQuantity}>aumentar</button>
        </>
    )
}
export default Counter