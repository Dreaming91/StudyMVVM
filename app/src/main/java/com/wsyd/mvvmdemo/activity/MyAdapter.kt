package com.wsyd.mvvmdemo.activity

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.wsyd.mvvmdemo.bean.MatchInfoDataBean

class MyAdapter(layoutResId: Int, data: MutableList<MatchInfoDataBean>?) : BaseQuickAdapter<MatchInfoDataBean,BaseViewHolder>(layoutResId, data) {
    override fun convert(helper: BaseViewHolder?, item: MatchInfoDataBean?) {


    }
}