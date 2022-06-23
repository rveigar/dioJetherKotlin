package one.digitalinnovation.Testes

data class Movie(var name: String, var studio: String, var rating: Float)

fun main () {
    val movie = Movie("Spider-Man", "Sony Pictures", 8.5F)
    println(movie.name)   //Spider-Man
    println(movie.studio) //Sony Pictures
    println(movie.rating) //8.5

    movie.rating = 9F

    println(movie.toString())

    val betterRating = movie.copy(rating = 9.55F)
    println(betterRating.toString()) // Movie(name=Spider-Man, studio=Sony Pictures, rating=9.5)
}