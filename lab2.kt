//task1
fun sumDigUp(number: Int): Int = if (number != 0) number%10 + sumDigUp(number/10) else 0
