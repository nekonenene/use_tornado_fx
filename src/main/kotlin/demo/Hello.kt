package demo

//fun main(args: Array<String>) {
//    println("Hello, Kotlin!")
//}

import javafx.application.Application
import tornadofx.App
import tornadofx.View
import tornadofx.hbox
import tornadofx.label

class HelloView : View() {
    override val root = hbox {
        label("Hello world!!\n" +
            "This is first view!!")
    }
}

class HelloWorldApp : App() {
    override val primaryView = HelloView::class
}

fun main(args: Array<String>) {
    Application.launch(HelloWorldApp::class.java, *args)
}
