package br.com.scalacamp.basics

/**
  * Multiparadigm
  *
  * Funções podem ser passadas como parâmetros para outras funções. Desta forma,
  * o código se torna capaz de transmitir comportamento de uma forma mais simples.
  *
  * Note como a função y = f(x) é passada na função map, que recolhe um a um os elementos
  * de uma matriz. O resultado de map é outra matriz, agora com os valoress de y para cada x.
  *
  * Para tornar a saída visual, tomamos a matriz resultado e aplicamos sucessivamente a
  * função println a cada elemento. Note uma abordagem alternativa, o uso de _ como um
  * "placeholder" para receber o valor a ser impresso.
  *
  * @author mauriciofernandesdecastro
  */
object MultiParadigm {

  def y(x:Int) = 2 * x + 1 // define uma função

  val graph = Array(-1, 0, 1, 2).map(y).foreach(println(_))

}
