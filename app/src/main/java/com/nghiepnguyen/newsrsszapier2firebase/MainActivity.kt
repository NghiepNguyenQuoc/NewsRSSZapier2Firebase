package com.nghiepnguyen.newsrsszapier2firebase

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showNewsFragment()
    }

    private fun showNewsFragment() {
        var tag = "NewsListFragment"
        val existingFragmentWithTag = supportFragmentManager.findFragmentByTag(tag)
        if (existingFragmentWithTag == null)
            supportFragmentManager.beginTransaction().add(R.id.news_list_fragment_container, NewsListFragment(), tag).commit()
    }
}
