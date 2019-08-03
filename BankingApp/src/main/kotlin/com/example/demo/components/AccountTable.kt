package com.example.demo.components

import com.example.demo.Scopes.AccountScope
import com.example.demo.controllers.CustomerHomeController
import com.example.demo.data.CustomerAccountJoin
import com.example.demo.model.Account
import com.example.demo.view.AccountView
import javafx.geometry.Pos
import tornadofx.*

class AccountTable : Fragment("My View")
{
    private val controller = CustomerHomeController()

    override val root = vbox {
        paddingTop = 25.0
        spacing = 20.0
        tableview(controller.customerAccounts) {
            maxHeight = 200.0
            minWidth = 400.0
            onUserSelect {customerAccountJoin ->
                val accountScope = AccountScope()
                accountScope.model.item = customerAccountJoin
                close()
                find(AccountView::class, accountScope).openWindow()
            }
            column("Name", CustomerAccountJoin::getName)
            column("Account Number", CustomerAccountJoin::getAccountNumber)
            column("Balance", CustomerAccountJoin::getBalance)
            column("Account Type", CustomerAccountJoin::getType)
        }
    }
}