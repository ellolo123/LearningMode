package com.example.create.abstractfactory

/**
 *
 *
 *
 * @author dyliaoyh [Contact me...](mailto:dyliaoyh@chint.com)
 * @version 1.0
 * @since 2022/12/13 11:09
 */
class FactoryProducer {
    fun getFactory(choice: String): AbstractFactory? {
        if (choice == "color") {
            return ColorFactory1()
        }
        if (choice == "shape") {
            return ShapeFactory1()
        }
        return null
    }

}