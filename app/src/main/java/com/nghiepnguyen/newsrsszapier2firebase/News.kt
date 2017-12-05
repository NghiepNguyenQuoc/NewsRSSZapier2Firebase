package com.nghiepnguyen.newsrsszapier2firebase

/**
 * Created by W10-PRO on 05-Dec-17.
 */
data class News(val title: String, val link: String, val description: String, val pubdate: String){
    constructor() : this("","","","")
}