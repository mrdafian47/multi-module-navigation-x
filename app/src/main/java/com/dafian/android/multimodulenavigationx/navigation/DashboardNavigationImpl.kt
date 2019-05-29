package com.dafian.android.multimodulenavigationx.navigation

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.dafian.android.module_dashboard.DashboardNavigation
import com.dafian.android.multimodulenavigationx.R

class DashboardNavigationImpl : DashboardNavigation {

    override fun dashboardToRadio(view: View, bundle: Bundle) {
        view.findNavController()
            .navigate(R.id.dashboard_to_radio)
    }
}