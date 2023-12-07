package com.vale19t.repaso_kotlin.Repaso.ejemplo_2

class Cajero {
    //la f para indicar un float flotante
    val cliente1: Cliente= Cliente("Valeria", 100000f)
    val cliente2: Cliente= Cliente("Danilo", 155000f)
    val cliente3: Cliente= Cliente("Pablo", 260000f)

    fun transacciones(){
        cliente1.consignar(12000f)
        cliente2.consignar(156000f)
        cliente3.consignar(185000f)
        cliente3.retirar(150000f)
    }
    fun saldo_total(){
        val total = cliente1.saldo_cuenta + cliente2.saldo_cuenta + cliente3.saldo_cuenta
        println("El cajero tiene un saldo de: $total")
        cliente1.consultar()
        cliente2.consultar()
        cliente3.consultar()
    }
}
