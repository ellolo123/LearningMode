package com.example.create.abstractfactory

import com.example.create.factory.Color
import com.example.create.factory.Green
import com.example.create.factory.Red
import com.example.create.factory.Shape

/**
 *
 *
 *
 * @author dyliaoyh [Contact me...](mailto:dyliaoyh@chint.com)
 * @version 1.0
 * @since 2022/12/13 11:06
 */
class ColorFactory1 : AbstractFactory() {
    override fun getShape(shape: String): Shape? {
        return null
    }

    override fun getColor(color: String): Color? {
        when (color) {
            "red" -> return Red()
            "green" -> return Green()
        }
        return null
    }
}