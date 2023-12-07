package com.vale19t.repaso_kotlin.Repaso.ejemplo_2

class Cliente (var nombre:String, var saldo_cuenta:Float) {
    fun consignar (valor_consignar:Float){
        //+= es para incrementar el valor
        this.saldo_cuenta += valor_consignar
    }
    fun retirar (valor_retirar:Float){
        //-= es para disminuir el valor
        this.saldo_cuenta -= valor_retirar
    }
    fun consultar (){
        println("$nombre - Saldo: $saldo_cuenta")
    }
}