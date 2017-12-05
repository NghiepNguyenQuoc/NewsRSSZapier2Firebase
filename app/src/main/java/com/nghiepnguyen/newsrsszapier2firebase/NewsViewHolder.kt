package com.nghiepnguyen.newsrsszapier2firebase

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_news.view.*

/**
 * Created by W10-PRO on 05-Dec-17.
 */
class NewsViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    fun bind(model: News) {
        itemView.news_title_textview.text = model.title
    }
}