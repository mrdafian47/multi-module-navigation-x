package com.dafian.android.multimodulenavigationx

import android.app.Application
import com.dafian.android.multimodulenavigationx.di.baseModule
import com.dafian.android.multimodulenavigationx.di.navigationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BaseApplication)
            modules(
                baseModule,
                navigationModule
            )
        }
    }
}