package com.example.demo.components

import com.example.demo.controllers.LoginController
import com.example.demo.model.User
import com.example.demo.view.CustomerHome
import com.example.demo.viewmodel.UserViewModel
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class LoginForm : Fragment("My View")
{
    override val root = Form()

    private val controller = LoginController()

    private val userModel = UserViewModel(User())

    var labelValue = SimpleStringProperty()

    init
    {
        with(root)
        {
            fieldset("Login") {
                field("Username") {
                    textfield(userModel.username).required()
                }
                field("Password") {
                    passwordfield(userModel.password).required()
                }
            }
            button("Login") {
                enableWhen(userModel.valid)
                action {
                    userModel.commit()
                    val user = userModel.item
                    if (controller.checkCredentials(user.username.value, user.password.value))
                    {
                        controller.SetLoggedInCustomer(user.username.value)
                        close()
                        find(CustomerHome::class).openWindow()
                    }
                }
            }
            label(labelValue)
        }
    }
}
