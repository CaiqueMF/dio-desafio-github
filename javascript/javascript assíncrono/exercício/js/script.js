const BASE_URL = 'https:/thatcopy.pw/catapi/rest/'
const btn = document.getElementById('change-cat')
const img = document.getElementById('cat')

const get_cats = async() => {
    try{
        const data = await fetch (BASE_URL)
        const json = await data.json()
        return json.webpurl
    }
    catch (e){
        console.log(e.message)
    }
    
}
const loadImg = async() => {
    img.src = await get_cats();
}

btn.addEventListener('click',loadImg)
loadImg()