
fun comprobarEstadoDia(){
    Datos.texto = devolverTiempo()
    if(Datos.texto == "Soleado") {
        Datos.texto = "Buenos dias"
    } else {
        Datos.texto = "Malos dias"
    }
    print(Datos.texto)
}

fun devolverTiempo(): String {
    return if(Datos.temperatura > 20) {
        "Soleado"
    } else {
        "Nublado"
    }
}