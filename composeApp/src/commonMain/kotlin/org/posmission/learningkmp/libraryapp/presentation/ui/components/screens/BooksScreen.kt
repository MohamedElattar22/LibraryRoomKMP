package org.posmission.learningkmp.libraryapp.presentation.ui.components.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BooksScreen(modifier: Modifier = Modifier) {

    Scaffold(
        topBar = {
            TopAppBar(
                windowInsets = AppBarDefaults.topAppBarWindowInsets,
                backgroundColor = Color(0xffF9F3EC),
                navigationIcon = {


                },
                actions = {

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
                                imageVector = Icons.Default.Add,
                                contentDescription = "Add Books"
                            )
                        }

                    }
                    Spacer(modifier = Modifier.width(12.dp))

                },
                title = {
                    Text(
                        "Books",
                        fontSize = 21.sp,

                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                }


            )
        }


    ) {
        Column(
            modifier = Modifier.padding(it).background(
                color = Color(0xffF9F3EC)
            ),

            ) {
            LazyColumn(

            ) {
//                items(10) {
//                    BooksCardComposable()
//                }
            }

        }

    }


}