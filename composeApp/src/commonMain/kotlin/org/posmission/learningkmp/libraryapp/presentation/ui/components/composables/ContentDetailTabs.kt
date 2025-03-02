package org.posmission.learningkmp.libraryapp.presentation.ui.components.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import libraryroomkmp.composeapp.generated.resources.Res
import libraryroomkmp.composeapp.generated.resources.font_bold
import libraryroomkmp.composeapp.generated.resources.font_regular
import org.jetbrains.compose.resources.Font

@Composable
fun ContentDetailsTabsComp(modifier: Modifier = Modifier) {
    val tabs = listOf("نبذة", "اقتباسات")
    val pagerState = rememberPagerState(
        pageCount = {
            tabs.size
        }, initialPage = 0
    )
    val coroutineScope = rememberCoroutineScope()


    TabRow(
        backgroundColor = Color(0xffF9F3EC),
        selectedTabIndex = pagerState.currentPage,
        modifier = Modifier
            .fillMaxWidth()
            .height(45.dp),
    ) {
        tabs.forEachIndexed { index, title ->
            Tab(

                selected = pagerState.currentPage == index,
                onClick = {
                    coroutineScope.launch {
                        pagerState.scrollToPage(index)
                    }
                },
                text = {
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            fonts = listOf(
                                Font(
                                    resource = Res.font.font_regular,
                                    weight = androidx.compose.ui.text.font.FontWeight.SemiBold
                                )
                            )
                        )

                    )
                }
            )
        }
    }

    HorizontalPager(
        state = pagerState,
        userScrollEnabled = false,

        ) { page ->

        when (page) {
            0 -> DescriptionContent()
            1 -> QuotesScreen()
        }
    }


}

@Composable
fun QuotesScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xffF9F3EC)
            )
    ) {
        items(10) {
            QuoteListItem()
            Spacer(modifier = Modifier.height(10.dp))
        }

    }


}

@Composable
fun DescriptionContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().background(
            Color(0xffF9F3EC)
        ).padding(15.dp)
    ) {
        Text(
            "فتي الأندلس",
            fontSize = 14.sp,
            fontFamily = FontFamily(
                fonts = listOf(
                    Font(Res.font.font_bold)
                ),
            ),
            color = Color(0xff75685D)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(

            "اسم الكتاب الحالي اسم الكتاب الحالي " +
                    "اسم الكتاب الحالي اسم الكتاب " +
                    "الحال ياسم الكتاب الحال ياسم" +
                    " الكتاب الحال ياسم الكتاب " +
                    "الحال ياسم الكتاب الحالي", fontSize = 14.sp,

            fontFamily = FontFamily(
                fonts = listOf(
                    Font(Res.font.font_regular)
                ),
            ),
            color = Color(0xff4B4A4B),
            lineHeight = 20.sp
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth()

        ) {
            DetailsChip(
                title = "الكاتب",
                content = "ال milliseconds"
            )
            Spacer(modifier = Modifier.width(40.dp))
            DetailsChip(
                title = "التصنيف",
                content = "القسم"
            )

        }


    }
}
