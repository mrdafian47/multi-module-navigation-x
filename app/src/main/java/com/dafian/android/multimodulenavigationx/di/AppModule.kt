package com.dafian.android.multimodulenavigationx.di

import com.dafian.android.module_dashboard.DashboardNavigation
import com.dafian.android.multimodulenavigationx.navigation.DashboardNavigationImpl
import org.koin.dsl.module

val baseModule = module {

}

val navigationModule = module {

    factory<DashboardNavigation> { DashboardNavigationImpl() }
}