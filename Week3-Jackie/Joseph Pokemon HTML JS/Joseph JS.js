function loadPokemon(pokemon) {
    document.getElementById("name").innerHTML = pokemon.name;
    document.getElementById("sprite").src = pokemon.sprites.front_default;
    document.getElementById("stats").innerHTML = "";
    pokemon.stats.forEach(function(e) {
        document.getElementById("stats").innerHTML += '<h4>' + e.stat.name + " : " + e.base_stat + '</h4>';
    });
} 