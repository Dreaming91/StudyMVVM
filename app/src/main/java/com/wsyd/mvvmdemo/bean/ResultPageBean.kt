package com.wsyd.mvvmdemo.bean

import android.databinding.BaseObservable

/**
 * Created by root on 2018/1/12.
 */

class ResultPageBean : BaseObservable() {
    var pageSize: Int = 0
    var pageNo: Int = 0
    var data: Any? = null
    var totalCount: Int = 0
    var totalPage: Int = 0
    var totalPages: Int = 0
    var startRow: Int = 0
    var endRow: Int = 0
}
