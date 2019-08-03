package com.example.demo.modals

import javafx.geometry.Pos
import tornadofx.*

class NothingSelected : View("My View")
{
    override val root = vbox {
        spacing = 10.0
        paddingAll = 20.0
        alignment = Pos.CENTER

        label("No application was selected")
        button("Ok") {
            action {
                close()
            }
        }
    }
}
