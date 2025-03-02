package org.posmission.learningkmp.libraryapp.presentation.ui.components.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import libraryroomkmp.composeapp.generated.resources.Res
import libraryroomkmp.composeapp.generated.resources.img
import org.jetbrains.compose.resources.painterResource
import org.posmission.learningkmp.libraryapp.presentation.ui.components.composables.ContentDetailsTabsComp

@Composable
fun BookDetailssScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                windowInsets = AppBarDefaults.topAppBarWindowInsets,
                backgroundColor = Color(0xffF9F3EC),
                navigationIcon = {

                    Box(
                        modifier = Modifier.size(40.dp).background(
                            color = Color(0xffFDF9F5),
                            shape = CircleShape,
                        ).border(
                            width = 1.dp,
                            color = Color(0xffF1EBE4),
                            shape = CircleShape
                        ),
                        contentAlignment = Alignment.Center
                    ) {
                        IconButton(
                            onClick = {

                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Add Books"
                            )
                        }

                    }
                },
                actions = {


                },
                title = {
                    Column {
                        Text(
                            "Books",
                            fontSize = 18.sp,

                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            "Quetos",
                            fontSize = 11.sp,

                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }


                }


            )
        }


    ) {
        Column(
            modifier = Modifier.padding(it).background(
                color = Color(0xffF9F3EC)
            ),


            )
        {
            Card(
                modifier = Modifier.fillMaxWidth().padding(20.dp).height(180.dp),
            ) {
                Image(
                    painter = painterResource(Res.drawable.img),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.height(10.dp))

            ContentDetailsTabsComp()


        }

    }


}