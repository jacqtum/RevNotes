// JavaScript source code

/* Notes:
 * Allows to you request any site with ajax from any source. Adds to response 'Allow-Control-Allow-Origin: *' header
 * https://chrome.google.com/webstore/detail/allow-control-allow-origi/nlfbmbojpeacfghkpbjhddihlkkiljbi?hl=en-US
 */

function loadPokemon(pokemon) {
    document.getElementById("name").innerHTML = pokemon.name + "Ability: " + pokemon.abilities[0];
}
function loadPokemonAbility(pokemon) {
    document.getElementById("ability").innerHTML = pokemon.name;
}

function getPokemon() {
    console.log("in getPokemon");
    // Gets element from the field with an id: 1
    var pokemonId = document.getElementById("pokeID").value;

    // Step 1: Create the XMLHttpRequest() -> XHR object
    var xhr = new XMLHttpRequest();

    // Step 2: Define the onreadystatechange function
    // onreadystatechange defines a function be execute when the readystate property changes
    xhr.onreadystatechange = function () {
        console.log("rolltide");

        // if ready state and status are both ready
        // readystate gives us the status of the XHR object:
        //  * 0 - request not initialized
        if (xhr.readyState == 4 && xhr.status == 200) {
            console.log(xhr.responseText);
            var pokemon = JSON.parse(xhr.responseText);
            loadPokemon(pokemon);
        }
    };

    // Step 3: Open our request xhr.open(HTTP method, url, true/false)
    xhr.open("GET", "https://pokeapi.co/api/v2/pokemon/" + pokemonId, true);

    // Step 4: Send Request (w/ Request body if needed)
    // xhr.send()
    // If it's a POST, send with request body
    xhr.send(); // No data to send because it will be appended to the URL
}

function getPokemonAbility() {
    console.log("in getPokemonAbility");
    var pokemonAbility = document.getElementById("pokeAbilityId").value;
    var xhr = new XMLHttpRequest();

    xhr.onreadystatechange = function () {
        console.log("rolltide");
        
        if (xhr.readyState == 4 && xhr.status == 200) {
            console.log(xhr.responseTest);
            var pokemonab = JSON.parse(xhr.responseText)
            console.log(pokemonab);
            loadPokemonAbility(pokemonab);
        }
    };
    xhr.open("GET", "https://pokeapi.co/api/v2/ability/" + pokemonAbility, true);
    xhr.send();
}

window.onload = function () {
    console.log("in onLoad");
    document.getElementById("pokemonSubmit1").addEventListener("click", getPokemon, false);
    document.getElementById("pokemonSubmit2").addEventListener("click", getPokemonAbility, false);
        //.addEventListener(type, handler, useCapture: t/f)
};

