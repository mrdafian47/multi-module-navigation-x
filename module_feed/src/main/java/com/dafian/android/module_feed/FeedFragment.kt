package com.dafian.android.module_feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dafian.android.common.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_feed.*
import org.koin.android.ext.android.inject

class FeedFragment : BaseFragment() {

    private val navigation by inject<FeedNavigation>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_feed_detail?.setOnClickListener {
            navigation.moveToDetailFeed(it, Bundle())
        }
    }
}