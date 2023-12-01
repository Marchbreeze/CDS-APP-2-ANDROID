package org.sopt.cds29cm.presentation.category

import androidx.lifecycle.ViewModel
import org.sopt.cds29cm.R
import org.sopt.cds29cm.data.CategoryHorizontal
import org.sopt.cds29cm.data.dataclass.CategoryVertical

class CategoryViewModel : ViewModel() {

    //상단 가로스크롤 카테고리
    val categoryHorizontalDataList = listOf<CategoryHorizontal>(
        CategoryHorizontal(
            categoryName = "모아보기",
            categoryImage = R.drawable.img_category_20
        ),
        CategoryHorizontal(
            categoryName = "쇼케이스",
            categoryImage = R.drawable.img_category_20
        ),
        CategoryHorizontal(
            categoryName = "PT",
            categoryImage = R.drawable.img_category_20
        ),
        CategoryHorizontal(
            categoryName = "선물하기",
            categoryImage = R.drawable.img_category_20
        ),
        CategoryHorizontal(
            categoryName = "해외브랜드",
            categoryImage = R.drawable.img_category_20
        ),
        CategoryHorizontal(
            categoryName = "프리미엄홈",
            categoryImage = R.drawable.img_category_20
        ),
        CategoryHorizontal(
            categoryName = "전시공간",
            categoryImage = R.drawable.img_category_20,
        ),
        CategoryHorizontal(
            categoryName = "던스트",
            categoryImage = R.drawable.img_category_20,
        ),
        CategoryHorizontal(
            categoryName = "테이블웨어",
            categoryImage = R.drawable.img_category_20,
        ),
        CategoryHorizontal(
            categoryName = "이벤트",
            categoryImage = R.drawable.img_category_20,
        ),
        CategoryHorizontal(
            categoryName = "리빙스타일",
            categoryImage = R.drawable.img_category_20,
        ),
        CategoryHorizontal(
            categoryName = "WELOVE",
            categoryImage = R.drawable.img_category_20,
        ),
        CategoryHorizontal(
            categoryName = "룩북",
            categoryImage = R.drawable.img_category_20,
        ),
        CategoryHorizontal(
            categoryName = "스페셜오더",
            categoryImage = R.drawable.img_category_20,
        ),

        )

    val CategoryVerticalLeftDataList = listOf<CategoryVertical>(
        CategoryVertical(categoryName = "의류"),
        CategoryVertical(categoryName = "가방"),
        CategoryVertical(categoryName = "신발"),
        CategoryVertical(
            categoryName = "액세서리",
            font = R.style.TextAppearance_Kor_Bold
    ),
        CategoryVertical(categoryName = "가구/인테리어"),
        CategoryVertical(categoryName = "주방/생활"),
        CategoryVertical(categoryName = "가전"),
        CategoryVertical(categoryName = "컴퓨터/디지털"),
        CategoryVertical(categoryName = "뷰티"),
        CategoryVertical(categoryName = "푸드"),
    )

    val CategoryVerticalRightDataList = listOf<CategoryVertical>(
        CategoryVertical(categoryName = "전체",
            font = R.style.TextAppearance_Kor_SemiBold,
        ),
        CategoryVertical(
            categoryName = "FOR YOU",
            font = R.style.TextAppearance_Eng_Bold,
            fontSize =10.0
        ),
        CategoryVertical(
            categoryName = "BEST",
            font = R.style.TextAppearance_Eng_Bold,
            fontSize =10.0
        ),
        CategoryVertical(
            categoryName = "NEW",
            font = R.style.TextAppearance_Eng_Bold,
            fontSize =10.0
        ),
        CategoryVertical(categoryName = "모자",
            font = R.style.TextAppearance_Kor_SemiBold,),
        CategoryVertical(categoryName = "주얼리",
            font = R.style.TextAppearance_Kor_SemiBold,),
        CategoryVertical(categoryName = "시계",
            font = R.style.TextAppearance_Kor_SemiBold,),
        CategoryVertical(categoryName = "아이웨어",
            font = R.style.TextAppearance_Kor_SemiBold,),
        CategoryVertical(categoryName = "패션 액세서리",
            font = R.style.TextAppearance_Kor_SemiBold,),
        CategoryVertical(
            categoryName = "EXCLUSIVE",
            font = R.style.TextAppearance_Eng_Bold,
            fontSize =10.0
        ),
        CategoryVertical(categoryName = "해외브랜드",
            font = R.style.TextAppearance_Kor_SemiBold,),
    )
}