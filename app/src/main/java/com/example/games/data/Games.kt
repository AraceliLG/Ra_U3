package com.example.games.data
data class Game(
    val id: Int,
    val name: String,
    val genre: String,
    val platform: String,
    val developer: String,
    val releaseDate: String,
    val description: String,
    val url: String,
)

val mostPlayedGames = listOf(
    Game(
        id = 1,
        name = "Minecraft",
        genre = "Sandbox",
        platform = "Multiplataforma",
        developer = "Mojang Studios",
        releaseDate = "18 de noviembre de 2011",
        description = "Un juego de construcción y supervivencia donde los jugadores pueden crear y explorar mundos infinitos.",
        url = "https://assets.nintendo.com/image/upload/ar_16:9,c_lpad,w_1240/b_white/f_auto/q_auto/ncom/software/switch/70070000016597/0a33bcaba879403460afe2ff2aafaaefeede964e0fc11a430f71077867cc87f1"
    ),
    Game(
        id = 2,
        name = "Fortnite",
        genre = "Battle Royale",
        platform = "Multiplataforma",
        developer = "Epic Games",
        releaseDate = "25 de julio de 2017",
        description = "Un juego de disparos y construcción en el que 100 jugadores compiten para ser el último en pie.",
        url = "https://cdn1.epicgames.com/offer/fn/Blade_1200x1600_1200x1600-fcea56f5eb92df731a89121e2b4416b5"

    ),
    Game(
        id = 3,
        name = "League of Legends",
        genre = "MOBA",
        platform = "PC",
        developer = "Riot Games",
        releaseDate = "27 de octubre de 2009",
        description = "Un juego de estrategia en equipo donde los jugadores controlan campeones con habilidades únicas.",
        url = "https://esports.as.com/2022/05/06/league-of-legends/League-Legends-contara-sistema-desafios_1571552855_971917_1440x810.jpg"

    ),
    Game(
        id = 4,
        name = "Call of Duty: Warzone",
        genre = "Battle Royale",
        platform = "Multiplataforma",
        developer = "Infinity Ward",
        releaseDate = "10 de marzo de 2020",
        description = "Un juego de disparos en primera persona con modos de juego Battle Royale y Plunder.",
        url = "https://assets.xboxservices.com/assets/db/88/db8834a9-115d-45e7-a9b5-fa4216b2aac2.jpg?n=CoD-Warzone_GLP-Page-Hero-1084_1920x1080_04.jpg"
    ),
    Game(
        id = 5,
        name = "Among Us",
        genre = "Party Game",
        platform = "Multiplataforma",
        developer = "InnerSloth",
        releaseDate = "15 de junio de 2018",
        description = "Un juego multijugador en el que los jugadores deben trabajar juntos para completar tareas mientras descubren a los impostores.",
        url = "https://cdn1.epicgames.com/salesEvent/salesEvent/amoguslandscape_2560x1440-3fac17e8bb45d81ec9b2c24655758075"
    ),
    Game(
        id = 6,
        name = "PUBG: Battlegrounds",
        genre = "Battle Royale",
        platform = "Multiplataforma",
        developer = "PUBG Corporation",
        releaseDate = "23 de marzo de 2017",
        description = "Un juego de disparos en el que los jugadores luchan para ser el último sobreviviente en un campo de batalla.",
        url = "https://cdn1.epicgames.com/spt-assets/53ec4985296b4facbe3a8d8d019afba9/pubg-battlegrounds-1e9a7.jpg"
    ),
    Game(
        id = 7,
        name = "Grand Theft Auto V",
        genre = "Acción/Aventura",
        platform = "Multiplataforma",
        developer = "Rockstar North",
        releaseDate = "17 de septiembre de 2013",
        description = "Un juego de mundo abierto donde los jugadores pueden explorar, realizar misiones y participar en diversas actividades.",
        url = "https://fotografias.larazon.es/clipping/cmsimages02/2019/08/06/0662D4DE-63F9-4E0F-9705-49EE65CA5F3A/98.jpg?crop=1075,605,x0,y0&width=1900&height=1069&optimize=low&format=webply"
    ),
    Game(
        id = 8,
        name = "The Legend of Zelda: Breath of the Wild",
        genre = "Acción/Aventura",
        platform = "Nintendo Switch",
        developer = "Nintendo",
        releaseDate = "3 de marzo de 2017",
        description = "Un juego de aventura en mundo abierto donde los jugadores exploran el reino de Hyrule y resuelven acertijos.",
        url = "https://assets.nintendo.com/image/upload/c_fill,w_1200/q_auto:best/f_auto/dpr_2.0/ncom/software/switch/70010000000025/7137262b5a64d921e193653f8aa0b722925abc5680380ca0e18a5cfd91697f58"
    )
)
