package com.example.learningmode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.create.abstractfactory.FactoryProducer
import com.example.create.factory.ShapeFactory

class CreateModeActivity : AppCompatActivity() {

    private var factory: Button? = null
    private var abstractFactory: Button? = null
    private var single: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        factory = findViewById(R.id.but_factory)
        abstractFactory = findViewById(R.id.but_abstract_factory)
        single = findViewById(R.id.but_single)
        factory!!.setOnClickListener(onSingleClickListener)
        abstractFactory!!.setOnClickListener(onSingleClickListener)
        single!!.setOnClickListener(onSingleClickListener)
    }

    private val onSingleClickListener = View.OnClickListener {
        when (it.id) {
            factory?.id -> {
                //工厂模式
                val shapeFactory = ShapeFactory()
                val circular = shapeFactory.getShape("circular")
                circular?.draw()
                val square = shapeFactory.getShape("square")
                square?.draw()
                val triangle = shapeFactory.getShape("triangle")
                triangle?.draw()
            }
            abstractFactory?.id -> {
                //抽象工厂模式
                val factory = FactoryProducer()
                val shapeFactory1 = factory.getFactory("shape")
                val colorFactory1 = factory.getFactory("color")
                val circular = shapeFactory1?.getShape("circular")
                circular?.draw()
                val square = shapeFactory1?.getShape("square")
                square?.draw()
                val triangle = shapeFactory1?.getShape("triangle")
                triangle?.draw()
                val red = colorFactory1?.getColor("red")
                red?.chromatically()
                val green = colorFactory1?.getColor("green")
                green?.chromatically()
            }
            single?.id -> {
                //单例模式
                

            }
        }

    }
}