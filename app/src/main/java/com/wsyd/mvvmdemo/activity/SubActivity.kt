package com.wsyd.mvvmdemo.activity

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import com.lzy.okgo.OkGo
import com.lzy.okgo.callback.StringCallback
import com.wsyd.mvvmdemo.R
import com.wsyd.mvvmdemo.bean.MatchInfoDataBean
import com.wsyd.mvvmdemo.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    private var recycle: RecyclerView? = null
    private var list: ArrayList<MatchInfoDataBean>? = null
    private var callBack: StringCallback? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val subBinding = DataBindingUtil.setContentView<ActivitySubBinding>(this@SubActivity, R.layout.activity_sub)

        recycle = subBinding?.cycleview
        recycle?.adapter = MyAdapter(R.layout.item_sub, list)
        callBack=StringCallback(){
        }
        OkGo.post<String>("http://footballplayer.wsfk.cn/apimobi/racenews")
                .headers("Content-Type", "application/json")
                .headers("request-type", "application/json").upJson().execute()
    }


}