package com.pronaycoding.roomiematch.ui.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pronaycoding.roomiematch.R
import com.pronaycoding.roomiematch.ui.components.RoomieMatchOutlinedTextField
import com.pronaycoding.roomiematch.ui.theme.RoomieBlue
import com.pronaycoding.roomiematch.ui.theme.RoomieBlue2
import com.pronaycoding.roomiematch.ui.theme.RoomieMatchTheme

@Composable
@Preview(showSystemUi = true)
fun PreviewSignUpScreen(){
    RoomieMatchTheme {
        SignupScreen {

        }
    }
}

@Composable
fun SignupScreen(
    gotoLoginScreen : () -> Unit
) {
    var name by rememberSaveable {
        mutableStateOf("")
    }
    var email by rememberSaveable {
        mutableStateOf("")
    }
    var phoneNumber by rememberSaveable {
        mutableStateOf("")
    }
    var password by rememberSaveable {
        mutableStateOf("")
    }
    var confirmPasword by rememberSaveable {
        mutableStateOf("")
    }
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Image(painter = painterResource(id = R.drawable.signup), contentDescription = "",
                modifier = Modifier
                    .height(300.dp)
                    .align(Alignment.CenterHorizontally))

            RoomieMatchOutlinedTextField(value = name, onValueChange = { name = it },
                label = { Text(text = "Name") },
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Person, contentDescription = null)
                }
            )

            Spacer(modifier = Modifier.height(8.dp))

            RoomieMatchOutlinedTextField(value = email, onValueChange = { email = it },
                label = { Text(text = "Email") },
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Email, contentDescription = null)
                }
            )

            Spacer(modifier = Modifier.height(8.dp))

            RoomieMatchOutlinedTextField(value = phoneNumber, onValueChange = { phoneNumber = it },
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Lock, contentDescription = null)
                }
            )

            Spacer(modifier = Modifier.height(8.dp))

            RoomieMatchOutlinedTextField(value = confirmPasword, onValueChange = { confirmPasword = it },
                label = { Text(text = "Confirm password") },
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Lock, contentDescription = null)
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            FilledTonalButton(
                onClick = {

                },
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth()
                    .height(50.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Transparent,
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = RoomieBlue,
                    contentColor = MaterialTheme.colorScheme.surface
                ),

                shape = RoundedCornerShape(0.dp)
            ) {
                Text(text = "SignUp")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Divider(modifier = Modifier.weight(.4f))
                Text(text = "or")
                Divider(modifier = Modifier.weight(.4f))
            }

            FilledTonalButton(
                onClick = {

                },
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth()
                    .height(50.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Transparent,
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isSystemInDarkTheme()) Color.Black
                    else RoomieBlue2,
                    contentColor = if (isSystemInDarkTheme()) Color.White
                    else RoomieBlue
                ),

                shape = RoundedCornerShape(0.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.search), contentDescription = null,
                    modifier = Modifier.size(30.dp), tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "SignUp using Google")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Already have an account?")
                TextButton(onClick = { gotoLoginScreen.invoke() }) {
                    Text(text = "Sign in")
                }
            }

        }
    }
}