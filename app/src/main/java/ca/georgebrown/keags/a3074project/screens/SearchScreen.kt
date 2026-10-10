package ca.georgebrown.keags.a3074project.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
    var search by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally, // Cross-axis centering
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = search,
            onValueChange = { search = it },
            singleLine = true,
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            placeholder = { Text("Search") }
        )
        repeat(7) {
            Spacer(modifier.height(0.01.dp))
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center // Centers all children by default
            ) {
                Text(text = "Hello Inside Box")
            }
        }
    }
}