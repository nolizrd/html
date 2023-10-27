package com.example.myapplication

import java.util.Arrays
import java.util.Scanner
import java.io.File

    //fun toHTML(): String = "$address ${topic}" добавить поля разного типа,

fun main() {
    data class Message(val address: String?, val topic: String?, val sender: String?, val recipient: String?) {
        fun toHTML(): String {
            if (address == null) {

            }
            var template = "<table> "
            // ниже используется интерполяция строк (подстановка переменных как в PHP/Python)
            address?.let { template += "<tr><td>address</td><td bgcolor=#ffcc00 style=\"font-family: Baskerville;\">$it</td></tr> \n"}
            topic?.let { template += "<tr><td>topic</td><td bgcolor=#ffcc00 style=\"font-family: Baskerville;\">$it</td></tr> \n" } //топик оказался нулем
            sender?.let { template += "<tr><td>sender</td><td bgcolor=#ffcc00 style=\"font-family: Baskerville;\">$it</td></tr> \n" }
            recipient?.let { template += "<tr><td>recipient</td><td bgcolor=#ffcc00 style=\"font-family: Baskerville;\">$it</td></tr> \n" }
            template +=  "</table>"
            return template
        }
    }

    val m = Message("askbill@microsoft.com", "gfdgdfg", "rita", null)
    println(m.toHTML())
    // content to be written to file
    var content = m.toHTML()

    File("file.html").writeText(content)
}













//class Main() {
//}
//fun moveRobot(robot: Robot, toX: Int, toY: Int) {
//    while (robot.x != toX || robot.y != toY) {
//        if (robot.x < toX) {
//            while (robot.direction != Direction.RIGHT) {
//                robot.turnRight()
//            }
//            robot.stepForward()
//        } else if (robot.x > toX) {
//            while (robot.direction != Direction.LEFT) {
//                robot.turnRight()
//            }
//            robot.stepForward()
//        }
//
//        if (robot.y < toY) {
//            while (robot.direction != Direction.UP) {
//                robot.turnRight()
//            }
//            robot.stepForward()
//        } else if (robot.y > toY) {
//            while (robot.direction != Direction.DOWN) {
//                robot.turnRight()
//            }
//            robot.stepForward()
//        }
//    }
//}
//enum class Direction {
//
//    UP, DOWN, LEFT, RIGHT
//}
//fun main(){
//    val empty=SmartRobot?=null
//    empty //пустая ссылка
//    robot.let {
//        println(it)
//        it.moveRobot( 0, 0)
//    }
//
//}
//
//
//
//class Robot (var x:Int, var y:Int, var direction:Direction)
//{
//    fun stepForward (){
//        when (direction)
//        {
//            Direction.RIGHT->x++
//            Direction.LEFT->x--
//            Direction.UP->y++
//            Direction.DOWN->y--
//
//        }
//    }
//    fun turnLeft (){
//        direction = when (direction)
//        {
//            Direction.RIGHT->Direction.UP
//            Direction.LEFT->Direction.DOWN
//            Direction.UP->Direction.LEFT
//            Direction.DOWN->Direction.RIGHT
//
//        }
//    }
//    fun turnRight (){
//        direction = when (direction)
//        {
//            Direction.RIGHT->Direction.DOWN
//            Direction.LEFT->Direction.UP
//            Direction.UP->Direction.RIGHT
//            Direction.DOWN->Direction.LEFT
//
//        }
//    }
//
//    override fun toString(): String {
//        return "${x}, ${y}, looks ${direction}"
//    }
//}