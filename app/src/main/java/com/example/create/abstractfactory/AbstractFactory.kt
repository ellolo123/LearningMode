package com.example.create.abstractfactory

import com.example.create.factory.Color
import com.example.create.factory.Shape

/**
 *
 *
 *
 * @author dyliaoyh [Contact me...](mailto:dyliaoyh@chint.com)
 * @version 1.0
 * @since 2022/12/13 11:01
 */
abstract class AbstractFactory {
    abstract fun getShape(shape: String): Shape?
    abstract fun getColor(color: String): Color?
}