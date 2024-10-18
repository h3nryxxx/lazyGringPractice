package com.example.coursesapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Course(
   @DrawableRes val imageResourceId: Int,
   @StringRes val stringResourceId: Int,
    val coursesAmount: Int = 1,
   @DrawableRes val iconResourceId: Int
)
