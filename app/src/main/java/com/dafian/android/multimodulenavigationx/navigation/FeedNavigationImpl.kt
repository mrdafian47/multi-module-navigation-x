package com.dafian.android.multimodulenavigationx.navigation

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.dafian.android.module_feed.FeedNavigation
import com.dafian.android.multimodulenavigationx.R

class FeedNavigationImpl : FeedNavigation {

    override fun moveToDetailFeed(view: View, bundle: Bundle) {
        view.findNavController()
            .navigate(R.id.move_to_detail_feed, bundle)
    }
}