import java.util.*

class Deck {

    val cards = Array(52) { Card(it % 13, getSuit(it)) }
    var cardsIndeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsIndeck.removeAt(0)

    fun reset() {
        cardsIndeck = cards.toMutableList()
        cardsIndeck.shuffle()
    }

    private fun getSuit(i: Int): String = when(i / 13){
        0 -> clubs
        1 -> diamonds
        2 -> hearts
        else -> spades
    }
}