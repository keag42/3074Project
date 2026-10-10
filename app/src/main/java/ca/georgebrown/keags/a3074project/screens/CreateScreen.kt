package ca.georgebrown.keags.a3074project.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreateScreen(modifier: Modifier = Modifier) {
    var getName by rememberSaveable { mutableStateOf("") }
    var location by rememberSaveable { mutableStateOf("") }
    var rating by rememberSaveable { mutableStateOf("") }
    var notes by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly// Cross-axis centering
    ) {
        Spacer(modifier.height(50.dp))
        Text(
            text = "Add New Entry",
            fontSize = 50.sp
        )
        Row() {
            Text(
                text = "Name: "
            )
            TextField(
                value = getName,
                onValueChange = { getName = it },
                singleLine = true,
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
            )
        }
        Row() {
            Text(
                text = "Location: "
            )
            TextField(
                value = location,
                onValueChange = { location = it },
                singleLine = true,
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
            )
        }
        Row() {
            Text(
                text = "Rating: "
            )
            TextField(
                value = rating,
                onValueChange = { rating = it },
                singleLine = true,
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
            )
        }
        Text(
            text = "Notes:"
        )
        TextField(
            value = notes,
            onValueChange = { notes = it },
            singleLine = true,
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
        )
        Button(onClick = {}) {
            Text("Add Now")
        }
    }
}