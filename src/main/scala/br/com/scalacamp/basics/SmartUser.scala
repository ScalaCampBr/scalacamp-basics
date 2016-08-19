package br.com.scalacamp.basics

import java.util.Date

/**
  * Scala constructor.
  *
  * Tudo em uma linha, com um argumento opcional e sem corpo, uma vez que os argumentos
  * do construtor são considerados membros da classe e, em Scala, dispensam métodos de
  * acesso (getters e setters).
  *
  * @author mauriciofernandesdecastro
  *
  */
class SmartUser(var id:Int, var userName: String, var joined: Date = new Date)
