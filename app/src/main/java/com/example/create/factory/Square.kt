package com.example.create.factory

import android.util.Log

/**
 *
 *
 *
 * @author dyliaoyh [Contact me...](mailto:dyliaoyh@chint.com)
 * @version 1.0
 * @since 2022/12/13 10:29
 */
class Square : Shape {
    override fun draw() {
        Log.i("Square", "正方形")
    }
}