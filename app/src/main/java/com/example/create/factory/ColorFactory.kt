package com.example.create.factory

/**
 *
 *
 *
 * @author dyliaoyh [Contact me...](mailto:dyliaoyh@chint.com)
 * @version 1.0
 * @since 2022/12/13 10:59
 */
class ColorFactory {
    fun getColor(color: String): Color? {
        when (color) {
            "red" -> return Red()
            "green" -> return Green()
        }
        return null
    }
}