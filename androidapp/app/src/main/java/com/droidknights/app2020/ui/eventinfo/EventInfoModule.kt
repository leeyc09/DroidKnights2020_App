package com.droidknights.app2020.ui.eventinfo

import androidx.lifecycle.ViewModel
import com.droidknights.app2020.di.annotation.FragmentScoped
import com.droidknights.app2020.di.annotation.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by jiyoung on 25/12/2019
 */
@Module
internal abstract class EventInfoModule {
    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun contributeSponsorFragment(): EventInfoFragment

    @Binds
    @IntoMap
    @ViewModelKey(EventInfoViewModel::class)
    abstract fun bindSponsorFragmentViewModel(viewModel: EventInfoViewModel): ViewModel
}