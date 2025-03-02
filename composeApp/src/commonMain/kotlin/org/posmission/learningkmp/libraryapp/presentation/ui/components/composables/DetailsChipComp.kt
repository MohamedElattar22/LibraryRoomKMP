package org.posmission.learningkmp.libraryapp.presentation.ui.components.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import libraryroomkmp.composeapp.generated.resources.Res
import libraryroomkmp.composeapp.generated.resources.font_regular
import org.jetbrains.compose.resources.Font

@Composable
fun DetailsChip(
    modifier: Modifier = Modifier,
    title: String,
    content: String,
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            fontFamily = FontFamily(
                fonts = listOf(
                    Font(Res.font.font_regular)
                ),
            ),
            color = Color(0xff2A2A29),
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Box(
            modifier = Modifier
                .background(
                    color = Color(0xffE2DDD1),
                    shape = RoundedCornerShape(20.dp)
                ).border(
                    width = 1.dp,
                    color = Color(0xff796A5D),
                    shape = RoundedCornerShape(20.dp)
                ),
            contentAlignment = Alignment.Center

        ) {
            Text(
                text = content,
                fontSize = 11.sp,
                fontFamily = FontFamily(
                    fonts = listOf(
                        Font(Res.font.font_regular)
                    ),
                ),
                modifier = Modifier.padding(5.dp)

            )

        }


    }

}