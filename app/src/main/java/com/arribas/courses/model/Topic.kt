package com.arribas.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val title: Int,
    val score: Int,
    @DrawableRes val image: Int
)
