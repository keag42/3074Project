package ca.georgebrown.keags.a3074project.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailsScreen(modifier: Modifier = Modifier) {
    var search by rememberSaveable { mutableStateOf("") }
    Column() {
        Spacer(modifier.height(50.dp))

        Text(
            text = "Restaurant Name"
        )

        Text(
            text = "Location"
        )

        Text(
            text = "Rating"
        )

        Text(
            text = "Directions"
        )

        Text(
            text = "Notes"
        )
    }
}
