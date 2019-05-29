package com.dafian.android.multimodulenavigationx

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dafian.android.common.base.BaseFragment
import com.dafian.android.module_account.AccountFragment
import com.dafian.android.module_dashboard.DashboardFragment
import com.dafian.android.module_feed.FeedFragment
import com.dafian.android.module_meal.MealFragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            loadFragment(DashboardFragment())
        }

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.dashboard_fragment -> {
                    loadFragment(DashboardFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.feed_fragment -> {
                    loadFragment(FeedFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.meal_fragment -> {
                    loadFragment(MealFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.account_fragment -> {
                    loadFragment(AccountFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false
        }
    }

    private fun loadFragment(fragment: BaseFragment) {
        fragmentManager?.beginTransaction()
            ?.replace(R.id.frame_content, fragment)
            ?.addToBackStack(null)
            ?.commit()
    }
}