package org.posmission.learningkmp.libraryapp.presentation.ui.components.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.coil3.CoilImage
import libraryroomkmp.composeapp.generated.resources.Res
import libraryroomkmp.composeapp.generated.resources.font_bold
import libraryroomkmp.composeapp.generated.resources.font_regular
import org.jetbrains.compose.resources.Font
import org.posmission.learningkmp.libraryapp.domain.model.Book

@Composable
fun BooksCardComposable(
    modifier: Modifier = Modifier,
    book: Book,
    onBookClick: (Int) -> Unit = {},
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                12.dp
            )
            .height(
                300.dp
            )
            .clickable(
                interactionSource = null,
                indication = null,
            ) {
                onBookClick(book.id)
            }.background(
                color = Color(0xffFEFBF7),
                shape = RoundedCornerShape(10.dp)

            ),
        border = BorderStroke(
            width = 1.dp,
            color = Color(0xffEBE4DD)
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            CoilImage(
                modifier = Modifier.fillMaxWidth().height(
                    150.dp
                ),
                imageModel = { book.image },
                imageOptions = ImageOptions(
                    contentScale = ContentScale.Crop,
                ),
            )
            Text(
                text = book.title,
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    fonts = listOf(
                        Font(Res.font.font_bold)
                    ),
                ),
                modifier = Modifier.padding(8.dp)
            )
            Spacer(
                modifier = Modifier.height(10.dp)
            )
            Text(
                text = book.summary,
                fontSize = 11.sp,
                fontFamily = FontFamily(
                    fonts = listOf(
                        Font(Res.font.font_regular)
                    ),
                ),
                modifier = Modifier.padding(horizontal = 10.dp),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                lineHeight = 18.sp,
                letterSpacing = 0.25.sp,
                color = Color(0xff969492)
            )
            Spacer(
                modifier = Modifier.height(10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = book.author,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        fonts = listOf(
                            Font(Res.font.font_bold)
                        ),
                    ),
                    modifier = Modifier.padding(horizontal = 10.dp)
                )

            }


        }

    }

}