// JavaScript source code
// Tommy code for Marvel
function loadCharacter(character) {
    document.getElementById("name").innerHTML = character.data.results.name;
    document.getElementById("desc").innerHTML = character.data.results.description;
}

function getCharacter() {
    console.log("in getCharacter");
    var characterName = document.getElementById("characterName").value;
    //Step 1 create XMLHttpRequest object
    var xhr = new XMLHttpRequest();
    //Step 2 function to handle onreadystatechange
    xhr.onreadystatechange = function () {
        console.log("Roll Tide!");
        if (xhr.readyState == 4 && xhr.status == 200) {
            console.log(xhr.responseText);
            var character = JSON.parse(xhr.responseText);
            loadCharacter(character);
        }
    }
    //Step 3 open the request/connection
    xhr.open("GET", "https://gateway.marvel.com/v1/public/characters?name=" + characterName + "&ts=1&apikey=566993eda76543d063ab2756019d03ec&hash=840406570c39381efd2fa307eff20792", true);
    //Step 4 send the request
    xhr.send();
}


window.onload = function () {
    console.log("in onLoad");
    document.getElementById("characterSubmit").addEventListener("click", getCharacter, false);
}