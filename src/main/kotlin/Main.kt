import kotlin.contracts.Returns
import kotlin.math.max

fun main() {
var Car = car("Totota", "R400", "Maroon", 19)
    Car.carry(14)
    Car.carry(22)

    Car.identity()

    var results = Car.calculateParkingFees(5)
    println(results)

    var bus = Bus("Easy coach", "Redmi", "Grey", 50)
    var answer = bus.maxTripFare(250.5)
    println(answer)

    var result = bus.calculateParkingFees(2)
    println(result)



}
open class car (var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people: Int){
        var x = (people - capacity)

        if (people <= capacity){
            println("Carrying $people passengers")
        }

        else if(people > capacity){
            println("Over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours: Int): Int{
        var ParkingFees = hours * 20
        return ParkingFees
    }

}

class Bus( make: String,  model: String,  color: String,  capacity: Int): car(make, model, color, capacity){

    fun maxTripFare(fare: Double): Double{
        var max = fare * capacity
        return max

    }

    override fun calculateParkingFees(hours: Int): Int{
        var Fees = hours * capacity
        return Fees
    }

}





