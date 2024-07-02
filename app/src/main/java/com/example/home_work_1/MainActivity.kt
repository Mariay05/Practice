package com.example.home_work_1

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.home_work_1.databinding.ActivityMainBinding

    private var viewBinding: ActivityMainBinding? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}


open class Car(
    open val model: String,
    open val age: Int,
    open val brand: String,
    open val color: String,
) {
    open fun printInfo() {}

class Crossover(override val model: String,
                override val age: Int,
                override val brand: String,
                override val color: String,
                val typeofdrive: String,
                val power: Int,):
    Car(
        model = model,
        age = age,
        brand = brand,
        color = color
    )
{
    override fun printInfo() {
        println("Model: $model, Age: $age, Brand: $brand, Color: $color")
    }
}
class Sedan(override val model: String,
                override val age: Int,
                override val brand: String,
                override val color: String,
                val typeofdrive: String,
                val power: Int,):
    Car(
        model = model,
        age = age,
        brand = brand,
        color = color
    )
{
    override fun printInfo() {
        println("Model: $model, Age: $age, Brand: $brand, Color: $color")
    }
}

class Station(override val model: String,
                override val age: Int,
                override val brand: String,
                override val color: String,
                val typeofdrive: String,
                val power: Int,):
    Car(
        model = model,
        age = age,
        brand = brand,
        color = color
    )
class Pickup(override val model: String,
              override val age: Int,
              override val brand: String,
              override val color: String,
              val typeofdrive: String,
              val power: Int,):
    Car(
        model = model,
        age = age,
        brand = brand,
        color = color
    )
{
    override fun printInfo() {
        println("Model: $model, Age: $age, Brand: $brand, Color: $color")
    }
}

class CrossoverBuilder {

    private var model: String = ""
    private var age: Int = 0
    private var brand: String = ""
    private var color: String = ""
    private var typeOfDrive: String = ""
    private var power: Int = 0

    fun model(value: String): CrossoverBuilder {
        this.model = value
        return this
    }

    fun age(value: Int): CrossoverBuilder {
        this.age = value
        return this
    }

    fun brand(value: String): CrossoverBuilder {
        this.brand = value
        return this
    }

    fun color(value: String): CrossoverBuilder {
        this.color = value
        return this
    }

    fun typeOfDrive(value: String): CrossoverBuilder {
        this.typeOfDrive = value
        return this
    }

    fun power(value: Int): CrossoverBuilder {
        this.power = value
        return this
    }

    fun build(): Crossover {
        return Crossover(
            model = model,
            age = age,
            brand = brand,
            color = color,
            typeofdrive = typeOfDrive,
            power = power
        )
    }
}

    class SedanBuilder {

        private var model: String = ""
        private var age: Int = 0
        private var brand: String = ""
        private var color: String = ""
        private var typeOfDrive: String = ""
        private var power: Int = 0

        fun model(value: String): SedanBuilder {
            this.model = value
            return this
        }

        fun age(value: Int): SedanBuilder {
            this.age = value
            return this
        }

        fun brand(value: String): SedanBuilder {
            this.brand = value
            return this
        }

        fun color(value: String): SedanBuilder {
            this.color = value
            return this
        }

        fun typeOfDrive(value: String): SedanBuilder {
            this.typeOfDrive = value
            return this
        }

        fun power(value: Int): SedanBuilder {
            this.power = value
            return this
        }

        fun build(): Sedan {
            return Sedan(
                model = model,
                age = age,
                brand = brand,
                color = color,
                typeofdrive = typeOfDrive,
                power = power
            )
        }
    }

    class StationBuilder {

        private var model: String = ""
        private var age: Int = 0
        private var brand: String = ""
        private var color: String = ""
        private var typeOfDrive: String = ""
        private var power: Int = 0

        fun model(value: String): StationBuilder {
            this.model = value
            return this
        }

        fun age(value: Int): StationBuilder {
            this.age = value
            return this
        }

        fun brand(value: String): StationBuilder {
            this.brand = value
            return this
        }

        fun color(value: String): StationBuilder {
            this.color = value
            return this
        }

        fun typeOfDrive(value: String): StationBuilder {
            this.typeOfDrive = value
            return this
        }

        fun power(value: Int): StationBuilder {
            this.power = value
            return this
        }

        fun build(): Station {
            return Station(
                model = model,
                age = age,
                brand = brand,
                color = color,
                typeofdrive = typeOfDrive,
                power = power
            )
        }
    }

    class PikupBuilder {

        private var model: String = ""
        private var age: Int = 0
        private var brand: String = ""
        private var color: String = ""
        private var typeOfDrive: String = ""
        private var power: Int = 0

        fun model(value: String): PikupBuilder {
            this.model = value
            return this
        }

        fun age(value: Int): PikupBuilder {
            this.age = value
            return this
        }

        fun brand(value: String): PikupBuilder {
            this.brand = value
            return this
        }

        fun color(value: String): PikupBuilder {
            this.color = value
            return this
        }

        fun typeOfDrive(value: String): PikupBuilder {
            this.typeOfDrive = value
            return this
        }

        fun power(value: Int): PikupBuilder {
            this.power = value
            return this
        }

        fun build(): Pickup {
            return Pickup(
                model = model,
                age = age,
                brand = brand,
                color = color,
                typeofdrive = typeOfDrive,
                power = power
            )
        }
    }

    fun race(other: Car): String {
        val comparison = compareBy<Car> {it.age}
        return when (comparison)

    }    }