package com.example.test.ViewPage

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.test.R

class StartViewPager : AppCompatActivity() {

    private lateinit var adapter: ViewPagerAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_view_pager)

        val mainPage: ViewPager2 = findViewById(R.id.mainPager)
        val obj: List<ViewPageModel> = listOf(
            ViewPageModel("Анализы", "Экспресс сбор и получение проб",R.drawable.group1, R.drawable.illustration),
            ViewPageModel("Уведомления", "Вы быстро узнаете о результатах",R.drawable.group2, R.drawable.secondpic),
            ViewPageModel("Мониторинг", "Наши врачи всегда наблюдают \n" +
                    "за вашими показателями здоровья",R.drawable.group3, R.drawable.thirdpic)
        )
        adapter = ViewPagerAdapter()
        adapter.obj = obj
        mainPage.adapter = adapter
    }
}