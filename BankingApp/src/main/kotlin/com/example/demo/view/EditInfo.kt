package com.example.demo.view

import com.example.demo.Scopes.CustomerScope
import com.example.demo.controllers.EditInfoController
import com.example.demo.data.CurrentLoggedInCustomer
import tornadofx.*

class EditInfo : Fragment("My View")
{
    override val root = Form()

    private val customerScope = super.scope as CustomerScope

    private val controller = EditInfoController()

    init
    {
        with(root)
        {
            spacing = 10.0
            fieldset("Personal Information") {
                field("First Name:") {
                    textfield(customerScope.model.firstname)
                }
                field("Last Name:") {
                    textfield(customerScope.model.lastname)
                }
                field("Address:") {
                    textfield(customerScope.model.address)
                }
            }
            hbox {
                spacing = 20.0

                button("Submit") {
                    action {
                        controller.sendUpdate(controller.getCustomer(customerScope.model))
                        //CurrentLoggedInCustomer.getInstance().loggedInCustomer = controller.getCustomer(customerScope.model)
                        close()
                        find(PersonalInfo::class, customerScope).openWindow()
                    }
                }
                button("Back") {
                    action {
                        close()
                        find(PersonalInfo::class).openWindow()
                    }
                }
            }
        }
    }
}