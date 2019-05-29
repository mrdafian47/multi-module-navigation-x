package com.dafian.android.multimodulenavigationx.di

import com.dafian.android.module_dashboard.DashboardNavigation
import com.dafian.android.module_feed.FeedNavigation
import com.dafian.android.multimodulenavigationx.navigation.DashboardNavigationImpl
import com.dafian.android.multimodulenavigationx.navigation.FeedNavigationImpl
import org.koin.dsl.module

val baseModule = module {

}

val navigationModule = module {

    factory<DashboardNavigation> { DashboardNavigationImpl() }

    factory<FeedNavigation> { FeedNavigationImpl() }
}