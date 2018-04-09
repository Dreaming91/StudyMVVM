package com.wsyd.mvvmdemo.bean

import android.databinding.BaseObservable

/**
 * Created by wsyd on 2018/1/19.
 */

class HomeBean : BaseObservable() {
    var page: PageBean? = null
    var bannerNews: List<BannerNewsBean>? = null
    var data: List<HomeDataBean>? = null

}
