fun main() {
    println("╔════════════════════════════════════════════════════════════════╗")
    println("║                    Типы данных в Kotlin                        ║")
    println("╠════════════════════════════════════════════════════════════════╣")

    // Int
    println("║ Int (целое число)                                             ║")
    println("║ • Размер: 32 бита                                            ║")
    println("║ • Диапазон: от -2,147,483,648 до 2,147,483,647              ║")
    println("║ Пример: val number: Int = 42                                 ║")
    println("╠════════════════════════════════════════════════════════════════╣")

    // String
    println("║ String (строка)                                              ║")
    println("║ • Неизменяемая последовательность символов                   ║")
    println("║ • Поддержка Unicode                                          ║")
    println("║ Пример: val text: String = \"Hello, Kotlin!\"                 ║")
    println("╠════════════════════════════════════════════════════════════════╣")

    // Boolean
    println("║ Boolean (логический тип)                                     ║")
    println("║ • Принимает значения: true или false                         ║")
    println("║ Пример: val isActive: Boolean = true                         ║")
    println("╠════════════════════════════════════════════════════════════════╣")

    // Float
    println("║ Float (число с плавающей точкой)                            ║")
    println("║ • Размер: 32 бита                                            ║")
    println("║ • Точность: ~6-7 десятичных цифр                            ║")
    println("║ Пример: val pi: Float = 3.14f                               ║")
    println("╠════════════════════════════════════════════════════════════════╣")

    // Double
    println("║ Double (число с плавающей точкой двойной точности)          ║")
    println("║ • Размер: 64 бита                                            ║")
    println("║ • Точность: ~15-17 десятичных цифр                          ║")
    println("║ Пример: val e: Double = 2.71828                             ║")
    println("╠════════════════════════════════════════════════════════════════╣")

    // Byte
    println("║ Byte (целое число)                                          ║")
    println("║ • Размер: 8 бит                                             ║")
    println("║ • Диапазон: от -128 до 127                                  ║")
    println("║ Пример: val byte: Byte = 100                                ║")
    println("╠════════════════════════════════════════════════════════════════╣")

    // Char
    println("║ Char (символ)                                               ║")
    println("║ • Размер: 16 бит                                            ║")
    println("║ • Представляет одиночный символ Unicode                      ║")
    println("║ Пример: val letter: Char = 'A'                              ║")
    println("╚════════════════════════════════════════════════════════════════╝")
}

    // 2. Число с точностью до сотых
    fun main(){
        val b:Float = 1.123F
        println("%.2f".format(b))
    }

    // 3. Число e с точностью до десятых
    fun main() {
        val e:Double = Math.E
        println("%.1f".format(e))
    }

    // 4. Вывод числа с сообщением перед ним
    fun main() {
        print("Введите число: ")
        val a = readln()
        println("Вы ввели число $a")
    }

    // 5. Вывод числа с сообщением после него
    fun main() {
        print("Введите число: ")
        val a = readln()
        println("$a - Это число вы ввели")
    }

    // 6. Три числа на одной строке с одним пробелом
    fun main() {
        println("1 13 49")
    }

    // 7. Три числа на одной строке с двумя пробелами
    fun main() {
        println("7  15  100")
    }

    // 8. Три любых числа на одной строке с двумя пробелами
    fun main() {
        println("169  250  49.56")
    }

    // 9. Четыре любых числа на одной строке с одним пробелом
    fun main() {
        println("1 13 49 69")
    }

    // 10. Два числа одно под другим
    fun main() {
        print("50\n10")
    }

    // 11. Три числа одно под другим
    fun main() {
        print("5\n10\n21")
    }

    // 12. Четыре числа "столбиком"
    fun main() {
        print("50\n10\n2.5\n434")
    }