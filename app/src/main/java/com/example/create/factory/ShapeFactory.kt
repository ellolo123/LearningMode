package com.example.create.factory

/**
 *
 *
 *
 * @author dyliaoyh [Contact me...](mailto:dyliaoyh@chint.com)
 * @version 1.0
 * @since 2022/12/13 10:35
 */
class ShapeFactory {
    fun getShape(shape: String): Shape? {
        when (shape) {
            "circular" -> return Circular()
            "square" -> return Square()
            "triangle" -> return Triangle()
        }
        return null
    }
}