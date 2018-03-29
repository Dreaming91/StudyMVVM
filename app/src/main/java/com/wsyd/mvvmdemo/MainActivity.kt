package com.wsyd.mvvmdemo

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.wsyd.mvvmdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val activityMainBinding: ActivityMainBinding?
        get() {
            val mainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this@MainActivity, R.layout.activity_main)
            return mainBinding
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainBinding = activityMainBinding
        mainBinding?.user = UserBean()
        mainBinding?.user?.setAge("46")
        mainBinding?.user?.setName("hello")

    }


}
