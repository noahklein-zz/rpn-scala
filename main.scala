import scala.collection.mutable.Stack


object Main {
  def main(args: Array[String]) = {       
    println(calculate(args))
  }

  def calculate(tokens: Array[String]): Double = {
    val stack = new Stack[Double]
    tokens.foreach(token => token match {
      case "+" => stack.push(stack.pop() + stack.pop())
      case "-" => stack.push(stack.pop() - stack.pop())
      case "*" => stack.push(stack.pop() * stack.pop())
      case "/" => stack.push(stack.pop() / stack.pop())
      case "^" => stack.push(Math.pow(stack.pop(), stack.pop()))
      case _ => stack.push(token.toDouble)
      })
    stack.pop()
  }
}