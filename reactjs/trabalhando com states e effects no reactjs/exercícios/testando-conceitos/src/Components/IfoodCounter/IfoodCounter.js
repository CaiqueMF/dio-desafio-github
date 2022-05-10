import React, {useState, useEffect} from "react"
import '../IfoodCounter/IfoodCounter.css'

function IfoodCounter() {
    const [value, setValue] = useState(1)
    const [ButtonStyle, setButtonStyle] = useState("counter-button-minus-active")
    useEffect(()=>{
        document.getElementById("moeda").innerHTML = 2.00 *value
    }, [value])
    function down() {
        if(value<=1){
            setButtonStyle("counter-button-minus-desactive")
        }
        if(value > 0){
            setValue(value-1)
        }
    }
    function up(){
        setValue(value+1)
        setButtonStyle("counter-button-minus-active")
        
    }
    return (
        <>
            <div className="countex-wrapper">
                <button className={ButtonStyle} onClick={down}>-</button>
                <p>{value}</p>
                <button className="counter-button-plus-active" onClick={up}>+</button>
            </div>
            <button id="moeda">13,00</button>
        </>
    )
}

export default IfoodCounter