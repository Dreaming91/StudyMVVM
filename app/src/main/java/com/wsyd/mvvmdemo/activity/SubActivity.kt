package com.wsyd.mvvmdemo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.lzy.okgo.OkGo
import com.lzy.okgo.callback.StringCallback
import com.lzy.okgo.model.Response
import com.wsyd.mvvmdemo.R
import com.wsyd.mvvmdemo.bean.HomeBean
import com.wsyd.mvvmdemo.bean.HomeDataBean
import com.wsyd.mvvmdemo.utill.GsonUtill
import kotlinx.android.synthetic.main.activity_sub.*
import org.json.JSONObject

class SubActivity : AppCompatActivity() {


    private var list: List<HomeDataBean>? = null
    private var myAdapter: MyAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val subBinding = DataBindingUtil.setContentView<ActivitySubBinding>(this@SubActivity, R.layout.activity_sub)
        setContentView(R.layout.activity_sub)
        cycleview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        myAdapter = MyAdapter(R.layout.item_sub, list)
        cycleview.adapter = myAdapter
        initData()
    }

    private fun initData() {
        OkGo.post<String>("http://footballplayer.wsfk.cn/apimobi/racenews")
                .headers("Content-Type", "application/json")
                .headers("request-type", "application/json")
                .upJson("{}")
                .execute(object : StringCallback() {
                    override fun onSuccess(response: Response<String>?) {
                        val string = response?.body()?.toString()
                        val data = JSONObject(string).getString("data")
                        val homeBean = GsonUtill.getObejctFromJSON(data, HomeBean::class.java)
                        list = homeBean.data
                        cycleview.adapter = MyAdapter(R.layout.item_sub, list)


                    }
                })
    }


}