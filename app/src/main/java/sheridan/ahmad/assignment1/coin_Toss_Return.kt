package sheridan.ahmad.assignment1

import kotlin.random.Random

enum class coinOutcome {
    Queer,
    Deer
}


interface coinTossReturn {
    fun tossCoin(coinResult: String): coinOutcome

}







