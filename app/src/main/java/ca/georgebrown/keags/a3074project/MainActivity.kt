package ca.georgebrown.keags.a3074project

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ca.georgebrown.keags.a3074project.ui.theme._3074ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _3074ProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Search(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Create(name: String, modifier: Modifier = Modifier) {
    var getName by rememberSaveable { mutableStateOf("") }
    var location by rememberSaveable { mutableStateOf("") }
    var rating by rememberSaveable { mutableStateOf("") }
    var notes by rememberSaveable { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, // Cross-axis centering
        verticalArrangement = Arrangement.Center){
        Spacer(modifier.height(50.dp))
        Text(
            text= "Add New Entry",
            fontSize=50.sp
        )


        Row(){
            Text(
                text="Name: "
            )
            TextField(
                value = getName,
                onValueChange = { getName = it },
                singleLine = true,
                modifier = Modifier.width(200.dp).height(50.dp),
            )
        }
        Row(){
            Text(
                text="Location: "
            )
            TextField(
                value = location,
                onValueChange = { location = it },
                singleLine = true,
                modifier = Modifier.width(200.dp).height(50.dp),
            )
        }
        Row(){
            Text(
                text="Rating: "
            )
            TextField(
                value = rating,
                onValueChange = { rating = it },
                singleLine = true,
                modifier = Modifier.width(200.dp).height(50.dp),
            )
        }
        Text(
            text="Notes:"
        )
        TextField(
            value = notes,
            onValueChange = { notes = it },
            singleLine = true,
            modifier = Modifier.width(200.dp).height(50.dp),
        )

        Button(onClick = {

        }) {
            Text("Add Now")
        }
    }
}

@Composable
fun Search(modifier: Modifier = Modifier) {
    var search by rememberSaveable { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, // Cross-axis centering
        verticalArrangement = Arrangement.Center) {

        TextField(
            value = search,
            onValueChange = { search = it },
            singleLine = true,
            modifier = Modifier.width(200.dp).height(50.dp),
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
@Composable
fun Details(modifier: Modifier = Modifier) {
    var search by rememberSaveable { mutableStateOf("") }
    Column() {
        Spacer(modifier.height(50.dp))

        Text(
            text="Restraunt Name"
        )

        Text(
            text="Location"
        )

        Text(
            text="Rating"
        )

        Text(
            text="Directions"
        )

        Text(
            text="Notes"
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _3074ProjectTheme {
        Details()
    }
}