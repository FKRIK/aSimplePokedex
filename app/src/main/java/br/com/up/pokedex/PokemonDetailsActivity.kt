package br.com.up.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import br.com.up.pokedex.network.PokeApi
import com.squareup.picasso.Picasso

class PokemonDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_details)

        val pokemon = intent.getStringExtra("pokemon")

        val pokemonNome : TextView = findViewById(R.id.txt_pokemon_name)
        val pokemonImagem : ImageView = findViewById(R.id.img_pokemon)
        val pokemonTipo : TextView = findViewById(R.id.txt_pokemon_tipo)
        val pokemonMov : TextView = findViewById(R.id.txt_pokemon_mov)
        val pokemonHab : TextView = findViewById(R.id.txt_pokemon_hab)

        val url = "https://pokeapi.co/api/v2/pokemon/${pokemon}"
        Picasso.get().load(url).into(pokemonImagem)

        PokeApi().getPokemonByName(pokemon!!){
                pokemon ->

            if(pokemon != null){

            }
        }

    }
}