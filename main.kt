fun main() {
    var hello: String? = null
    val isTrue = true
    val text = "hi"
    var num: Int? = 11

    when (num) {
        null -> print("ohhh")
        10 -> print("no")
        12 -> print("asda")
        else -> {
            num = 123123
            print(num)
        }
    }
}