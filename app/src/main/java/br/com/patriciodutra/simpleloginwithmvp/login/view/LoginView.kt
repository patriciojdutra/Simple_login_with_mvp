package br.com.patriciodutra.simpleloginwithmvp.login.view

interface LoginView {
    fun showLoading()
    fun hideLoading()
    fun showLoginSuccess()
    fun showLoginError(error: String)
}
