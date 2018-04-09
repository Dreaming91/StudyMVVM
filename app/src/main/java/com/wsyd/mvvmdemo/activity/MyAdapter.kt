package com.wsyd.mvvmdemo.activity

import android.widget.ImageView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.squareup.picasso.Picasso
import com.wsyd.mvvmdemo.R
import com.wsyd.mvvmdemo.bean.HomeDataBean

class MyAdapter(layoutResId: Int, data: List<HomeDataBean>?) : BaseQuickAdapter<HomeDataBean, BaseViewHolder>(layoutResId, data) {
    override fun convert(helper: BaseViewHolder?, item: HomeDataBean?) {
        helper?.setText(R.id.item_sub_name, item?.title)
        Picasso.get().load(item?.coverImage).into(helper?.getView<ImageView>(R.id.item_sub_logo))
    }
}