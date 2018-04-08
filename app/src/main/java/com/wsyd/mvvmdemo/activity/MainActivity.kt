package com.wsyd.mvvmdemo.activity

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.wsyd.mvvmdemo.R
import com.wsyd.mvvmdemo.bean.User
import com.wsyd.mvvmdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {



    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.click -> startActivity(Intent(this, SubActivity::class.java))
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this@MainActivity, R.layout.activity_main)
        mainBinding?.user = User()
        mainBinding?.click?.setOnClickListener(this)
    }


}
