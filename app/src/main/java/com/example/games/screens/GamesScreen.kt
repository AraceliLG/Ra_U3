package com.example.games.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.games.components.BottomNavigationBar
import com.example.games.components.TopAppBar
import com.example.games.data.Game
import com.example.games.data.mostPlayedGames
import com.example.games.navigation.AppScreens


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GamesScreen(mostPlayedGames, NavController(context = LocalContext.current))
}

@Composable
fun GamesScreen(games: List<Game>, navController: NavController) {

    Scaffold(
        topBar = { TopAppBar("Juegos más jugados") },
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            items(games) { game ->
                GameCard(game = game, navController)
                Spacer(modifier = Modifier.height(8.dp))

            }
        }
    }
}

@Composable
fun GameCard(game: Game, navController: NavController) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .clickable {
                navController.navigate(AppScreens.GameScreen.createRoute(game.id))
            }
            .fillMaxSize()
            .size(310.dp)
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = rememberImagePainter(data = game.url),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = game.name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = "Género: ${game.genre}",
            )
        }
    }
}
