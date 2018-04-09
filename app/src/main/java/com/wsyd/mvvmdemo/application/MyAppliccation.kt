package com.wsyd.mvvmdemo.application

import android.app.Application
import com.lzy.okgo.OkGo

class MyAppliccation : Application() {
    override fun onCreate() {
        super.onCreate()
        OkGo.getInstance().init(this)
    }
}