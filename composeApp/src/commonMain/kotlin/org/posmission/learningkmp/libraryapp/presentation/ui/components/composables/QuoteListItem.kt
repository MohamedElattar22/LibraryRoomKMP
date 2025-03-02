package org.posmission.learningkmp.libraryapp.presentation.ui.components.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import libraryroomkmp.composeapp.generated.resources.Res
import libraryroomkmp.composeapp.generated.resources.font_regular
import org.jetbrains.compose.resources.Font

@Composable
fun QuoteListItem(
    modifier: Modifier = Modifier,
    onShareClick: () -> Unit = {},
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(160.dp)
            .background(
                Color(0xffFEFBF7)
            ),

        ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(10.dp)
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "❝ ومن يتهيب صعود الجبال يعش أبد الدهر بين الحفر , ومن كانت يده في الحرير ❞",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(
                    fonts = listOf(
                        Font(Res.font.font_regular)
                    ),
                ),
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                " -أحمد ماهر (فتي الأندلس)",
                textDecoration = TextDecoration.Underline,
                textAlign = TextAlign.Start,
                fontFamily = FontFamily(
                    fonts = listOf(
                        Font(Res.font.font_regular)
                    ),
                ),
                color = Color(0xff78695B),
                fontSize = 12.sp

            )
            Spacer(modifier = Modifier.height(15.dp))

            IconButton(
                onClick = {
                    onShareClick()

                },
                modifier = Modifier.size(16.dp)
            ) {
                Icon(
                    tint = Color(0xff78695B),
                    imageVector = Icons.Default.Share,
                    contentDescription = "Share"
                )

            }


        }


    }


}
