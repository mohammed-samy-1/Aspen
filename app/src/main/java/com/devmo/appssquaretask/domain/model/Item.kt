package com.devmo.appssquaretask.domain.model

import com.devmo.appssquaretask.R

data class Item(
    val id: Int,
    val title:String,
    val numRev: Int,
    val description: String,
    val img: Int
){
    companion object{
        val items = listOf(
            Item(
                0,
                "Coeurdes Alpes ",
                100,
                "\u2028\u2028\u2028Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and  Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and  Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and  Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and ........",
                R.drawable.i1
            ),
            Item(
                1,
                "Coeurdes Alpes ",
                50,
                "\u2028\u2028\u2028Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and  Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and  Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and  Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and ........",
                R.drawable.i2
            ),
            Item(
                2,
                "Coeurdes Alpes ",
                255,
                "\u2028\u2028\u2028Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and  Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and  Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and  Aspen is as close as one can get to a storybook alpine town in America. The choose-your-own-adventure possibilities—skiing, hiking, dining shopping and ........",
                R.drawable.i3
            ),
        )
    }
}
