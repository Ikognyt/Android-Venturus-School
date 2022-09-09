package com.vntfian.trilhasoftex.class12

import com.vntfian.trilhasoftex.class6.User

class LoginScreenCompose {

    fun MyView(
        loginScreenCompose: LoginScreenCompose = LoginScreenCompose(),
        user: User,
        scope: () -> Unit = {}
    ){
        UserLogin(user)
    }


    inner class UserLogin(user: User){
        fun Column(){
            fun Row(){
                fun editTextUser(user: User){

                }
                fun editTextPassword(){

                }
            }
        }
    }

    inner class User(
        user: String = "",
        password: String = ""
    ){
        val user = user
        val password = password
    }

}