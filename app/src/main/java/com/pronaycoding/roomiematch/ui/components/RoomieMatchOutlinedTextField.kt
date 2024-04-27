package com.pronaycoding.roomiematch.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.pronaycoding.roomiematch.ui.theme.RoomieBlue
import com.pronaycoding.roomiematch.ui.theme.RoomieBlue2
import com.pronaycoding.roomiematch.ui.theme.RoomieGreen
import com.pronaycoding.roomiematch.ui.theme.RoomieGreen2


@Composable
fun RoomieMatchOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    keyboardType: KeyboardType = KeyboardType.Text,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp),
    label: @Composable() (() -> Unit)? = null,
    leadingIcon: @Composable() (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    singleLine: Boolean = true,
    trailingIcon: @Composable() (() -> Unit)? = null,
) {
    OutlinedTextField(
        value = value, onValueChange = onValueChange,
        modifier = modifier,
        keyboardOptions = KeyboardOptions (
            keyboardType = keyboardType
    ),
        label = label,
        leadingIcon = leadingIcon,
        isError = isError,
        visualTransformation = visualTransformation,
        singleLine = singleLine,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = RoomieBlue2,
            focusedBorderColor = RoomieBlue,
            unfocusedLeadingIconColor = RoomieBlue,
            focusedLeadingIconColor = RoomieBlue
        ),
        trailingIcon = trailingIcon

//        modifier = modifier,

    )
}