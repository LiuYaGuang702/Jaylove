package testKotlin

fun main(){
    val goodsList = mutableSetOf("惠普", "联想", "戴尔", "IBM", "长城", "方正")

    println("for in 电脑畅销榜已添加,并且已经remove goodsA商品惠普，当前共有${goodsList.size}款电脑")
    for (good in goodsList) {
        println("for in 测试\\n$good")
    }

    println("iterator while 电脑畅销榜已添加,并且已经remove goodsA商品惠普，当前共有${goodsList.size}款电脑")
    val iterator = goodsList.iterator()
    while (iterator.hasNext()) {
        val good = iterator.next()
        println("iterator while 测试\\n$good")
    }

    println("forEach 电脑畅销榜已添加,并且已经remove goodsA商品惠普，当前共有${goodsList.size}款电脑")
    goodsList.forEach { good ->
        println("forEach 测试\\n名称：$good")
    }

    goodsList.remove("惠普")
}