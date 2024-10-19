package com.dikin.fit1.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dikin.fit1.R

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { HomeScreenTopBar() },
        bottomBar = { BottomNavigationBar() }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            item { BannerSection() }
        }
    }
}

@Composable
private fun HomeScreenTopBar() {
    CenterAlignedTopAppBar(
//        colors = TopAppBarColors(MaterialTheme.colorScheme.onPrimaryContainer,
//            MaterialTheme.colorScheme.surfaceContainer,
//            MaterialTheme.colorScheme.primary,
//            MaterialTheme.colorScheme.onTertiary,
//            MaterialTheme.colorScheme.primary),
        title = {
            Text(
                text = "Home",
                style = MaterialTheme.typography.headlineMedium,
            )
        },
        actions = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.notifications),
                    contentDescription = "Notifications",
                    tint = Color.Black
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.bookmark),
                    contentDescription = "Favourites",
                    tint = Color.Black
                )
            }
        }
    )
}

@Composable
private fun BottomNavigationBar() {
    BottomAppBar {
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = "Home",
                )
            },
            label = { Text("Home") },
            selected = true,
            onClick = {/*TODO*/ }
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "Search",
                )
            },
            label = { Text("Search") },
            selected = false,
            onClick = {/*TODO*/ }
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = "Profile",
                )
            },
            label = { Text("Profile") },
            selected = false,
            onClick = {/*TODO*/ }
        )
    }
}

@Preview
@Composable
fun HomePagePreview() {
    HomeScreen()
}

//@Preview
@Composable
private fun BannerSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.choose_membership),
                    contentDescription = "Choose membership",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "One-year membership at a special price",
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(0.7f)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "12990 ₸ X 12 months\n155 880 ₸",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(0.7f)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = {/*TODO*/ },
                    modifier = Modifier.fillMaxWidth(0.5f),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = "Choose a membership",
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun PostsSection() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.choose_membership),
                contentDescription = "Profile Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(start = 16.dp),
        ) {
            Text(
                text = "Fit1 added a new studio",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "19 October",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
    Row(modifier = Modifier.fillMaxWidth()) {
        Card {

        }
    }
}

//@Composable
//private fun ImageCarousel() {
//    val carouselState = rememberCarouselState()
//}