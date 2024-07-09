package testKotlin
    fun main() {
        // 给定字符串
        val sorigin: String = "abc.def.ghi.jkl,opq,201410598210"

        // 输出原始字符串
        println("原始字符串：$sorigin")

        // 使用substring函数获取第一个小数点前的字符子串
        val firstSubstring = sorigin.substringBefore('.')
        println("第一个小数点前的子串：$firstSubstring")

        // 将字符串转换为字符数组，并以-连接每个字符，包括特殊字符（如.和,）
        val charArray = sorigin.toCharArray().joinToString("-")
        println("字符数组连接结果：$charArray")

        // 将字符串中的逗号(,)替换为分号(;)
        val replacedString = sorigin.replace(',', ';')
        println("逗号替换为分号后的字符串：$replacedString")

        // 按照逗号(,)将字符串分割为多个子串并分别输出
        val substrings = sorigin.split(',')
        println("按逗号分割的子串：$substrings")

        // 获取并输出字符串的第五个字符
        val fifthChar = sorigin.getOrNull(4)
        println("第五个字符：$fifthChar")

        // 计算并输出字符串的长度
        val length = sorigin.length
        println("字符串长度：$length")

        // 将字符串中最后的数字部分格式化为美元金额（例如：$201410598210）
        val lastNumber = sorigin.substringAfterLast(',')
        val formattedAmount = "$${lastNumber.replace(Regex("\\\\B(?=\\\\d{4})"), "*")}"
        println("格式化后的美元金额：$formattedAmount")
    }
