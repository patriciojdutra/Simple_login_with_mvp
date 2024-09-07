package br.com.patriciodutra.simpleloginwithmvp.login.model

interface LoginModel {
    fun login(username: String, password: String, listener: OnLoginFinishedListener)

    interface OnLoginFinishedListener {
        fun onSuccess()
        fun onError(error: String)
    }
}
