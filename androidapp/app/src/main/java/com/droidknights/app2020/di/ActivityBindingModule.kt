package com.droidknights.app2020.di

import com.droidknights.app2020.ui.MainActivity
import com.droidknights.app2020.di.annotation.ActivityScoped
import com.droidknights.app2020.ui.MainActivityModule
import com.droidknights.app2020.ui.mypage.MypageModule
import com.droidknights.app2020.ui.schedule.ScheduleModule
import com.droidknights.app2020.ui.eventinfo.EventInfoModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jiyoung on 29/11/2019
 */
@Module
abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(
        modules = [
            MainActivityModule::class,
            ScheduleModule::class,
            MypageModule::class,
            EventInfoModule::class
        ]
    )
    internal abstract fun getMainActivity() : MainActivity
}