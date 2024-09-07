package br.com.patriciodutra.simpleloginwithmvp.login.presenter

import br.com.patriciodutra.simpleloginwithmvp.login.model.LoginModel
import br.com.patriciodutra.simpleloginwithmvp.login.model.LoginModelImpl
import br.com.patriciodutra.simpleloginwithmvp.login.view.LoginView

class LoginPresenterImpl(private val view: LoginView) : LoginPresenter, LoginModel.OnLoginFinishedListener {

    private val loginModel: LoginModel = LoginModelImpl()

    override fun onLoginClicked(username: String, password: String) {
        view.showLoading()
        loginModel.login(username, password, this)
    }

    override fun onSuccess() {
        view.hideLoading()
        view.showLoginSuccess()
    }

    override fun onError(error: String) {
        view.hideLoading()
        view.showLoginError(error)
    }
}

