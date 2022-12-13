package com.example.create.abstractfactory

import com.example.create.factory.*

/**
 *
 *
 *
 * @author dyliaoyh [Contact me...](mailto:dyliaoyh@chint.com)
 * @version 1.0
 * @since 2022/12/13 11:04
 */
class ShapeFactory1 : AbstractFactory() {
    override fun getShape(shape: String): Shape? {
        when (shape) {
            "circular" -> return Circular()
            "square" -> return Square()
            "triangle" -> return Triangle()
        }
        return null
    }

    override fun getColor(color: String): Color? {
        return null
    }
}