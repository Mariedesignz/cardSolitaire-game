class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPile = arrayOf(FoundationPile("Clubs"), FoundationPile("Diamonds") ,
    FoundationPile("Hearts"), FoundationPile("Spades"))
    val tableauPiles = Array (7) { TableauPile() }

    fun resetGame() {
        
    }

}