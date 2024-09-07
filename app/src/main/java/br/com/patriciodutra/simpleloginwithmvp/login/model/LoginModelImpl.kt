package br.com.patriciodutra.simpleloginwithmvp.login.model

class LoginModelImpl : LoginModel {
    override fun login(username: String, password: String, listener: LoginModel.OnLoginFinishedListener) {
        // Simulação de validação (chamada a uma API, por exemplo)
        if (username == "user" && password == "password") {
            listener.onSuccess()
        } else {
            listener.onError("Credenciais inválidas")
        }
    }
}

