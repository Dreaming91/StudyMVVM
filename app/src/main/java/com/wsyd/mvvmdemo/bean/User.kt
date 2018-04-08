package com.wsyd.mvvmdemo.bean

import android.databinding.BaseObservable

class User : BaseObservable() {

    private var name = "hy"
    private var age = "20"

    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return this.name
    }

    fun setAge(age: String) {
        this.age = age
    }

    fun getAge(): String {
        return this.age
    }

    fun action(): String {
        return "new activity"
    }
}