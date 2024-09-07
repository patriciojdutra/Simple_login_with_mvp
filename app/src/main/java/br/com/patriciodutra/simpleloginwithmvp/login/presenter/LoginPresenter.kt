package br.com.patriciodutra.simpleloginwithmvp.login.presenter

interface LoginPresenter {
    fun onLoginClicked(username: String, password: String)
}
