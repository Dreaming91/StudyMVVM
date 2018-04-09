package com.wsyd.mvvmdemo.bean

import android.databinding.BaseObservable

/**
 * Created by wsyd on 2018/2/5.
 */

class PageBean : BaseObservable() {


    /**
     * pageSize : 20
     * pageNo : 1
     * data : null
     * totalCount : 4
     * totalPage : 1
     * startRow : 0
     * endRow : 20
     * totalPages : 1
     */

    var pageSize: Int = 0
    var pageNo: Int = 0
    var data: Any? = null
    var totalCount: Int = 0
    var totalPage: Int = 0
    var startRow: Int = 0
    var endRow: Int = 0
    var totalPages: Int = 0

}
